package selenium_class;

import java.util.ArrayList;
import java.util.TreeSet;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Gold");
		a.add("Platinum");
		a.add("Diamond");
		a.add("Silver");
		System.out.println(a);
		Thread.sleep(2000);
		TreeSet<String> t=new TreeSet<String>(a);
		System.out.println(t);
	}

}
