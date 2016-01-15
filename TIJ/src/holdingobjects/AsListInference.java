package holdingobjects;
import java.util.*;
/** 
*	author Rajni
*
**/
class Snow {
	public String toString() {
		return "Snow";
	}
}
class Powder extends Snow {
	public String toString() {
		return "Powder";
	}
}
class Light extends Powder {
	public String toString() {
		return "Light";
	}
}
class Heavy extends Powder {
	public String toString() {
		return "Heavy";
	}
}
class Crusty extends Snow {
	public String toString() {
		return "Crusty";
	}
}
class Slush extends Snow {
	public String toString() {
		return "Slush";
	}
}

class AsListInference {
	public static void main (String[] args) {
		List<Snow> list = Arrays.asList(new Crusty(), new Slush(),new Powder());
		System.out.println("List Got is "+list);
		// if your jdk version is 8 , then following lines will compile but not otherwise
		List<Snow> anotherList = Arrays.asList(new Light(),new Heavy());
		System.out.println("Another list received is : "+anotherList);
		
		List<Snow> thirdList = new ArrayList<Snow>();
		Collections.addAll(thirdList,new Light(),new Heavy());
	}
}