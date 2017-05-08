
public interface BankOperation {
	
	public int verifyCardDetail(CreditCard card, int price);//int cardNumber, String name, int price
	public void withDraw(Account account, int amount);
	public void Displaybalance();
	
	
}
