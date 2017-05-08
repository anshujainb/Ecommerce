import java.util.HashSet;
import java.util.Set;

public class Catalogue {

String Name;


public Set <Item>productList=new HashSet<>();


public void addproduct(int id, String name, int unitPrice){	// method to add item to itemList
	Item item= new Item(id,name,unitPrice);
	productList.add(item);
}

public void removeProduct(String ItemForSearch){	// method to remove item from itemList
	productList.remove(searchProduct(ItemForSearch));
}

public void viewProduct(){  // // method to view all Items
	for(Item I:productList){
		System.out.println(I);
	}
}

public Item searchProduct(String itemForSearch){	//method to search Item from ItemList
	  Item x=null;
	  for(Item I:productList){
		  if(I.Name.equalsIgnoreCase(itemForSearch)){
			  x=I;
		  }  
	  }
	return x;
}




}
