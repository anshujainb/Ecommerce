import java.util.HashSet;
import java.util.Set;

public class Account {
int accountNum;
String name;
int balance;
int cardNum;

Set <CreditCard>CreditCardList=new HashSet<>();

public Account(int accountNum, String name, int balance,int cardNum) {	//constructor
	
	this.accountNum = accountNum;
	this.name = name;
	this.balance = balance;
	this.cardNum=cardNum;
}


public void addCreditCard(int cardNum, String name, String BankName){		//method to add CreditCard to user account's cardList
	CreditCard C= new CreditCard(cardNum,name,BankName);
	CreditCardList.add(C);
}

public void viewCard(){		//method to view from account's cardList
	for(CreditCard C:CreditCardList){
		System.out.println(C);
	}
}


public CreditCard searchCard(int cardNum){	//method to search from account's cardList
	//System.out.println(cardNum);
	
	 CreditCard x=null;
	  for(CreditCard C:CreditCardList){
		  System.out.println(C);
		  if(C.getCardNum()==cardNum){
			  x=C;
		  }  
	  }
	return x;
}

public void Withdraw(int amount){	//method to withdraw amount from account
	balance-=amount;
}


@Override
public String toString() {
	return "Account [accountNum=" + accountNum + ", name=" + name + ", balance=" + balance + ", cardNum=" + cardNum
			+ "]";
}

}
