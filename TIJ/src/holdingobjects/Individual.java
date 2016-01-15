package holdingobjects;

class Individual {

	private String name;
	private static int counter = 0;
	private final int id = counter++;
	Individual(String name) {
		this.name = name;
	}
	
	Individual() {
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return getClass().getName()+":"+id;
	}
}

class Person extends Individual {
	Person(String name) {
		super(name);
	}
}

class Pet extends Individual {
	Pet(String name) {
		super(name);
	}
	
	Pet() {
		super();
	}
}

class Dog extends Pet {
	Dog(String name) {
		super(name);
	}
	
	Dog() {
		super();
	}
}

class Mutt extends Pet {
	Mutt(String name) {
		super(name);
	}
	Mutt() {
		super();
	}
}

class Cat extends Pet {
	Cat(String name) {
		super(name);
	}
	
	Cat() {
		super();
	}
}

class EgyptiMau extends Cat {
	EgyptiMau (String name) {
		super(name);
	}
	
	EgyptiMau() {
		super();
	}
}

class Manx extends Cat {
	Manx(String name) {
		super(name);
	}
	
	Manx() {
		super();
	}
}

class Cymric extends Manx {
	Cymric(String name) {
		super(name);
	}
	
	Cymric() {
		super();
	}
}

class Rodent extends Pet {
	Rodent(String name) {
		super(name);
	}
	
	Rodent() {
		super();
	}
}

class Rat extends Rodent {
	Rat(String name) {
		super(name);
	}
	
	Rat() {
		super();
	}
}

class Mouse extends Rodent {
	Mouse(String name) {
		super(name);
	}
	
	Mouse() {
		super();
	}
}

class Hamster extends Rodent {
	Hamster(String name) {
		super(name);
	}
	
	Hamster() {
		super();
	}
}
