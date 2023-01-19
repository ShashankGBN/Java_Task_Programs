package comparable_comparator;

//======================COMPARABLE====================

import java.util.ArrayList;
import java.util.Collections;

public class MobileMain {

	public static void main(String[] args) 
	{
		ArrayList<Mobile> ar = new ArrayList<Mobile>();
		ar.add(new Mobile("oppo", 30000, "yellow"));
		ar.add(new Mobile("samsung", 15000, "black"));
		ar.add(new Mobile("apple", 45000, "red"));
		ar.add(new Mobile("vivo", 20000, "blue"));
		
		
		Collections.sort(ar);
		
		System.out.println(ar);
	}

}
