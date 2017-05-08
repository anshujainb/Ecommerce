import java.util.HashSet;
import java.util.Set;

public class BankGateway {
	String userMsg;
	int	bankFlag;
	Set<Bank>BankList=new HashSet<>();
	

	public BankGateway(){};
	
	
	public void addBank(Bank B){ // method to add user to uerList
		BankList.add(B);
	}
	
	public Bank searchBank(String bankForSearch){	//method to search Item from ItemList
		  Bank x=null;
		  for(Bank B:BankList){
			  if(B.Name.equalsIgnoreCase(bankForSearch)){
				  x=B;
			  }  
		  }
		return x;
}
	public void removeBank(String name){ // method to add user to uerList
		BankList.remove(name);
	}

	public int verifyWithBank(CreditCard card, int totalPrice){		//Method to send card details to bank to verify
		String Bankname=card.getBankName();
	
		return searchBank(Bankname).verifyCardDetail(card, totalPrice);		
	}
	
	
	
	
}
