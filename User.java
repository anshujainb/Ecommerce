import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class User {
String name;
String Password;
int userId;

public Set <CreditCard>ccList=new HashSet<>();	//CreditCard List of user
public ArrayList <Address>addressList=new ArrayList<>();


Cart userCart= new Cart();


public User(String name, int userId, String password) {	//constructor
	this.name = name;
	this.userId = userId;
	this.Password = password;
}

public void addCard(int cardNum,String name,String BankName ){	//Method for adding CreditCard to CCLIST
	CreditCard card= new CreditCard(cardNum,name,BankName);
	ccList.add(card);
}

public void removeCard(int cardNum){		//Method to remove CreditCard from CCLIST
	ccList.remove(searchCard(cardNum));
}

public CreditCard searchCard(int cardNum){	//Method to search CreditCard from CCLIST
	  CreditCard x=null;
	  for(CreditCard C:ccList){
		  if(C.getCardNum()==cardNum){
			  x=C;
			  
		  }
		  
	  }
	  
	return x;
}


public void SelectItem(Catalogue cat, String itemName,int quantity){	//Method to Select Item from Catalogue
	Item chosenItem=cat.searchProduct(itemName);
	//update quantity
	if(userCart.searchItem(itemName)!=null){
		if(userCart.searchItem(itemName).Name.equalsIgnoreCase(itemName)){
		userCart.searchItem(itemName).updateQuantity(quantity);
		}
	}
	chosenItem.updateTotalPrice(quantity);	
	userCart.addItem(chosenItem);
}


public void Checkout(BankGateway bg){			//Checkout Method 
	userCart.viewItem();
	userCart.findTotalPrice();
	System.out.println("total Price:"+userCart.totalPrice);
	//System.out.println(bg.verifyWithBank(this.searchCard(123), userCart.totalPrice));
	DisplayPaymentStatus(bg.verifyWithBank(this.searchCard(123), userCart.totalPrice));	
}


public void DisplayPaymentStatus(int flag){		//Method to show Payment Status
	  if (flag==0){
			System.out.println("Payment Success");
	  }
	  else if(flag==1){
			System.out.println("Insufficient Balance");
	  }
	  else{
			System.out.println("enter valid card details");
	  }
}

//Getter Setter Method for Name
public String getName() {	
	return name;
}

public void setName(String name) {
	this.name = name;
}

//Getter Setter Method for UserId
public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	userId = userId;
}

//Getter Setter Method for password
public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}


@Override
public String toString() {
	return "User [name=" + name + ", Password=" + Password + ", userId=" + userId + "]";
}




}
