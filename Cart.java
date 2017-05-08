import java.util.ArrayList;

public class Cart {
	
	int totalPrice;		//totalPrice for all Selected Item From Cart's ItemList
	public ArrayList <Item>itemList=new ArrayList<>();	//List for Selected Item by User
	
	public void addItem(Item I){	// method to add item to itemList
		itemList.add(I);
	}

	public void removeItem(String ItemForSearch){	// method to remove item from itemList
		itemList.remove(searchItem(ItemForSearch));
	}

	public void viewItem(){  // // method to view all Items
		for(Item I:itemList){
			System.out.println(I);
		}
	}

	public Item searchItem(String itemForSearch){	//method to search Item from ItemList
		  Item x=null;
		  for(Item I:itemList){
			  if(I.Name.equalsIgnoreCase(itemForSearch)){
				  x=I;
			  }  
		  }
		return x;
	}
	
	public void findTotalPrice(){	//Method to find TotalPrice
		  for(Item var: itemList){
			  totalPrice+= var.price;		  
			 // var.DisplayItem();
		  }
		  
		  setTotalPrice(totalPrice);
		   
	  }
	
	//Getter Setter Method for total price  
	  public int getTotalPrice() {
			return totalPrice;
	  }
	  
	  public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
	  }
	
	  
	
}
