import java.util.HashMap;
import java.util.Map;

public class Address {
	
		int sector;
		String area;
		String name;
		int distance;
		int price;
		int distFactor;
		int shippingPrice;
		int baseFare;
		HashMap<Integer, Integer> sectorPrice = new HashMap<Integer, Integer>();
		
			
		
		public Address(String name,String area,int sector,int distance){
			this.name=name;
			this.area=area;
			this.sector=sector;
			this.distance=distance;
		}
		
		void loadData(){
			setDistFactor(2);
			sectorPrice.put(4,10);
			sectorPrice.put(8, 20);
			sectorPrice.put(3,30);
			sectorPrice.put(13,50);
		}
		void calShippingPrice(){
			//System.out.println(sectorPrice.containsKey(sector));
			if (sectorPrice.containsKey(sector)==true){
				baseFare=sectorPrice.get(sector);
				shippingPrice=distance*distFactor+baseFare;
			}
			else{
				System.out.println("sector not available");
			}
			
			System.out.println("shipping price:"+shippingPrice);
		}
		
		public int getDistFactor() {
			return distFactor;
		}
		public void setDistFactor(int distFactor) {
			this.distFactor = distFactor;
		}
		
		
		
		
		
}
