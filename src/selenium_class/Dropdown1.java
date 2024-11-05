package selenium_class;

import java.util.ArrayList;
import java.util.TreeSet;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		TreeSet<String> t=new TreeSet<String>();
		t.add("Gold");
		t.add("Platinum");
		t.add("Diamond");
		t.add("Silver");
		System.out.println(t);
		Thread.sleep(2000);
		ArrayList<String> a=new ArrayList<String>(t);
		System.out.println(a);
	}

}
