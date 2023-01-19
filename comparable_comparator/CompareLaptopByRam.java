package comparable_comparator;

//=====================COMPARATOR=====================

import java.util.Comparator;

public class CompareLaptopByRam implements Comparator<Laptop>
{

	@Override
	public int compare(Laptop l1, Laptop l2) 
	{
		if(l1.ram>l2.ram)
			return 1;
		else if(l1.ram<l2.ram)		
			return -1;
		else
			return 0;
		
	}

}
