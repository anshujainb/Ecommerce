

import java.util.HashSet;
import java.util.Set;

public class Ecommerce {
	
int flag=0;

 public Set <User>userList=new HashSet<>();

 

 public void addUser(String name, int userId, String password){ // method to add user to uerList
		User user1= new User(name,userId,password);
		userList.add(user1);
		
 }
 
 
 public void removeUser(String username){	//method to remove user from userList
		userList.remove(searchUser(username));
 }

 public void viewUser(){	//method to view all user
		for(User U:userList){
			System.out.println(U);
		}
 }
		
 public User searchUser(String userForSearch){	//method to search Item from ItemList
			  User x=null;
			  for(User U:userList){
				  if(U.name.equalsIgnoreCase(userForSearch)){
					  x=U;
				  }  
			  }
			return x;
 }
 


 
 public static void main(String[] args) {
	//Temporary adding accounts to bank from here
	 Bank SBI= new Bank("SBI",1);
	 SBI.addAccount(1234,"Riya",10000,123);
	 SBI.addAccount(1234,"Anshu",10000,586);
	 
	 // paymet gateway
	 BankGateway paymentGateway = new BankGateway();
	 paymentGateway.addBank(SBI);
	 
	 // add users and cards
	 Ecommerce ecom= new Ecommerce();
	 ecom.addUser("riya", 1, "abc");
	 ecom.searchUser("riya").addCard(123, "riya","SBI");	 
	 
	 ecom.addUser("Anshu", 2, "abc");
	 ecom.searchUser("Anshu").addCard(586, "Anshu","SBI");
	 
	 
	 //catalog and temp add items
	 Catalogue cat= new Catalogue();
	 cat.addproduct(1, "fan",1000);
	 cat.addproduct(2, "fridge",2000);
	 
	 // adding items to cart and checkout
	 ecom.searchUser("riya").SelectItem(cat,"fan", 4);
	 ecom.searchUser("riya").SelectItem(cat,"fan", 4);
	 ecom.searchUser("riya").SelectItem(cat,"fridge", 5);
	 ecom.searchUser("riya").Checkout(paymentGateway);
	 
	 //BankRef= SBI;
	 
	 
	 
	 
}
 
}
