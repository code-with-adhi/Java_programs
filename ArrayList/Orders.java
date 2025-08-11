package ArrayList;
import java.util.ArrayList;

public class Orders {
	int orderID;
	String customerName;
	int totalAmount;
	public Orders(int orderID, String customerName, int totalAmount) {
		this.orderID = orderID;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", customerName=" + customerName + ", totalAmount=" + totalAmount + "]";
	}
	public static void main(String[] args) {
		ArrayList<Orders> al = new ArrayList<Orders>();
		al.add(new Orders(101,"AAA",530));
		al.add(new Orders(102,"BBB",3421));
		al.add(new Orders(103,"CCC",210));
		al.add(new Orders(104,"DDD",192));
		al.add(new Orders(105,"EEE",542));
		
		
		ArrayList<Orders> al1 = new ArrayList<Orders>();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).totalAmount<500)
				al1.add(al.get(i));
		}
		if(al.removeAll(al1))
			System.out.println(al);
		
	}
	
	
	

}
