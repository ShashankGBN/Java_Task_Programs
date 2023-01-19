package comparable_comparator;

//==================COMPARABLE=========================

public class Mobile implements Comparable<Mobile>
{
	private String brand;
	private int price;
	private String color;
	
	Mobile(String brand, int price, String color)
	{
		this.brand=brand;
		this.price=price;
		this.setColor(color);
	}
	
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}

	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}

	public String getColor()
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	@Override
	public String toString() 
	{
		return "Mobile [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Mobile m) 
	{
		if(this.getPrice()>m.price)
			return 1;
		else if(this.getPrice()<m.price)
			return -1;
		else
			return 0;
	}
}
