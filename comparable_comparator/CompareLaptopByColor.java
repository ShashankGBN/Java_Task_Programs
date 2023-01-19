package comparable_comparator;

//============================COMPARATOR=========================

import java.util.Comparator;

public class CompareLaptopByColor implements Comparator<Laptop>
{
	public int compare(Laptop l1, Laptop l2)
	{
		return l1.color.compareTo(l2.color);
	}	
}
