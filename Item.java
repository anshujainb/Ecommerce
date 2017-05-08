import java.util.ArrayList;

public class Item {
	int Id;
	String Name;
	int quantity;
	int unitPrice;
	int price;
	int discount;
	float avgRating;
	int numOfReviews;
	int ratingCount;

	
	public ArrayList<Review>reviewList=new ArrayList<>();
	
	
	public Item(int id, String name, int unitPrice) {	//constructor 
		super();
		Id = id;
		Name = name;
		this.unitPrice = unitPrice;
		//this.price=this.quantity*this.unitPrice;
	}
	
	
	
	public void updateTotalPrice(int quantity){		//update totalPrice
		setPrice(quantity*unitPrice);
	}
	
	public void updateQuantity(int itemQuantity){	//updating quantity
		quantity=quantity+itemQuantity;
		setQuantity(quantity);
	}

//Getter Setter Method for Quantity	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
//Getter Setter Method for	Name

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

//Getter Setter Method for Price
	
	public int getUnitPrice() {		//Method for UnitPrice
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {	//Method for UnitPrice
		this.unitPrice = unitPrice;
	}

	public int getPrice() {		//Method for Price as per Quantity
		return price;
	}

	public void setPrice(int price) {	//Method for Price as per Quantity
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Item [Id=" + Id + ", Name=" + Name + ", unitPrice=" + unitPrice +  "]";
	}

}
