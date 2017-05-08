
public class CreditCard {
	private int cardNum;
	private String name;
	public String BankName;
	
	
	public CreditCard(int cardNum, String name,String BankName){	//Constructor
		this.cardNum=cardNum;
		this.name= name;
		this.BankName=BankName;
	}
	
//Getter Setter Method for card number
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
//Getter Setter Method for Bank Name
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	
//Getter Setter Method for  Name on card		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "CreditCard [cardNum=" + cardNum + ", name=" + name + ",BankName=" +BankName+"]";
	}
}
