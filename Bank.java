import java.util.HashSet;
import java.util.Set;

public class Bank implements BankOperation {

	
	String Name;
	int ID;	
	
Set<Account>acctList=new HashSet<>();

	public Bank(String name, int iD) {	//constructor
	
		Name = name;
		ID = iD;
	}

	
	public void addAccount(int accountNum, String name, int balance,int cardNum){ //method to add account to list
		Account Acct= new Account(accountNum,name,balance,cardNum);
		acctList.add(Acct);
	}
	
	public void viewAccount(){	//method to view account from list
		for(Account A:acctList){
			System.out.println(A);
		}
	}
	

	public Account searchAccount(int cardNum){	//method to search account from list
		//System.out.println(cardNum);
		
		 Account x=null;
		  for(Account R:acctList){
			  if(R.cardNum==cardNum){
				  x=R;
			  }  
		  }
		return x;
	}
		
	@Override
	public int verifyCardDetail(CreditCard card,int totalPrice) {	//method to verify card detail
		//
		
		Account acct= searchAccount(card.getCardNum());
		
		if (card.getCardNum()==acct.cardNum && card.getName().equalsIgnoreCase(acct.name)){
	
			if (acct.balance>=totalPrice){
				
				acct.Withdraw(totalPrice);
				return 0;
				
			}
			else{
				
				return 1;
			}
		}
		
		else{
			
			return 2;
		}
		
	}
	
	
	public void DisplayBank(){		//method for testing 
		System.out.println(this.Name);
		
	}
	
	
	@Override
	public String toString() {
		return "Bank [Name=" + Name + ", Balance="  + "]";
	}

// methods of interface
	@Override
	public void withDraw(Account account, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Displaybalance() {
		// TODO Auto-generated method stub
		
	}

	
}
