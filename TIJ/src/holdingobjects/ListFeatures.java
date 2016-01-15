package holdingobjects;
import java.util.*;

public class ListFeatures {
	public static void main(String[] args) {
		Random random = new Random(47);
		List<Pet> pets = new ArrayList<Pet>(7);
		System.out.println("1 : "+pets);
		Hamster h = new Hamster();
		pets.add(h);
		System.out.println("2 : "+pets);
		System.out.println("3 : "+pets.contains(h));
		
		pets.remove(h);
		//Pet p = pets.get(2);
		//System.out.println("4 : "+pets.indexOf(p));
		
		Cymric c = new Cymric();
		pets.add(c);
		
		Cymric c1 = c;
		pets.add(c1);
		
		System.out.println("5 : "+pets.remove(c));
		
		System.out.println("6 : "+pets);
		pets.add(new Mouse());
		System.out.println("7 : "+pets);
		pets.add(new Cat());
		//Collections.sort(pets);
		System.out.println("8 : "+pets);
		
		List<Pet> copy = new ArrayList<Pet>(pets);
		pets.removeAll(copy);
		System.out.println("9 : "+pets);
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(10);
		ints.add(2);
		ints.add(4);
		ints.add(3);
		System.out.println("1 : "+ints.remove(4)+" : "+ ints); //  always takes index if not given as new
		
	}
}