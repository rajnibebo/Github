package holdingobjects;

import java.util.*;
class ListIteration {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		for(int i = 0 ; i< 10 ; i++) {
			ints.add(i);
		}
		
		ListIterator<Integer> it = ints.listIterator();
		while(it.hasNext()) {
			System.out.println("Previous Index : "+it.previousIndex()+", Value : "+it.next()+", Next Index : "+it.nextIndex());
		}
		
		System.out.println();
		// Move Backwards
		while(it.hasPrevious()) {
			System.out.println("Previous Index : "+it.previousIndex()+", Value : "+it.previous()+", Next Index : "+it.nextIndex());
		// here we can add into second list in reverse order
		}
		System.out.println();
		it = ints.listIterator(3);
		while(it.hasNext()) {
			System.out.println(" Value : "+it.next());
			it.set(3);
		}
		
		System.out.println(ints);
	}
}