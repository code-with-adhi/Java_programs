package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class LaptopDriver {
	public static void main(String[] args) {
		ArrayList<Laptop> al = new ArrayList<Laptop>();
		al.add(new Laptop("Dell",200001,32));
		al.add(new Laptop("HP",1,2));
		al.add(new Laptop("Mac",11,0));
		al.add(new Laptop("Acer",65475,16));
		al.add(new Laptop("Lenovo",46232,8));
		
		Collections.sort(al);
		System.out.println(al);
		
	}

}
