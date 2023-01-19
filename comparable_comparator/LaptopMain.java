package comparable_comparator;

//=================COMPARATOR======================

import java.util.ArrayList;
import java.util.Collections;

public class LaptopMain 
{

	public static void main(String[] args) 
	{
		ArrayList<Laptop> ar = new ArrayList<Laptop>();
		ar.add(new Laptop("acer", "black", 45000));
		ar.add(new Laptop("apple", "white", 75000));
		ar.add(new Laptop("dell", "black", 35000));
		ar.add(new Laptop("hp", "silver", 55000));
		
		Collections.sort(ar);
		System.out.println("Sorting based on brand");
		for(Laptop l : ar)
		{
			System.out.println(l);
		}
		
		System.out.println("Sorting based on color");
		Collections.sort(ar, new CompareLaptopByColor());
		for(Laptop l : ar)
		{
			System.out.println(l);
		}
		
		System.out.println("Sorting based on Ram");
		Collections.sort(ar, new CompareLaptopByRam());
		for(Laptop l : ar)
		{
			System.out.println(l);
		}
		
	}

}
