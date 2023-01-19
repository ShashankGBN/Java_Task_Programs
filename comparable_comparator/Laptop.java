package comparable_comparator;

//=====================COMPARATOR====================

public class Laptop implements Comparable<Laptop>
{
	String brand;
	String color;
    int ram;
	
	Laptop(String brand, String color, int ram)
	{
		this.brand=brand;
		this.color=color;
		this.ram=ram;
	}
	
	public String toString()
	{
		return "Laptop [ brand- "+brand+" , color- "+color+" , ram-"+ram+" ]";
	}
	
	public int compareTo(Laptop lp)
	{
		return this.brand.compareTo(brand);
	}
}
