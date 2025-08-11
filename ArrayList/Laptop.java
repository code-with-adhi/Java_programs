package ArrayList;

public class Laptop implements Comparable<Laptop>{
	String brand;
	double price;
	int ram;
	@Override
	public int compareTo(Laptop o) {
		return this.ram-o.ram;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	public Laptop(String brand, double price, int ram) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	
	
	

}
