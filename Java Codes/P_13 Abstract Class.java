abstract class Person{
	abstract void read();
	abstract void print();
}

class Students extends Person{
	String name;
	int age;
	int id;

	void read(){
		name = "Priyam Pal";
		age = 21;
		id = 05;
	}
	void print(){
		System.out.println("Students details: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("ID: " + id);
	}
}

class Teachers extends Person{
	String name;
	int age;
	int id;

	void read(){
		name = "Shampa Sengupta";
		age = 49;
		id = 321;
	}
	void print(){
		System.out.println("Teachers details: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("ID: " + id);
	}
}

class Details{
	public static void main(String[] args){
		Students ob1 = new Students();
		Teachers ob2 = new Teachers();
		ob1.read();
		ob1.print();
		ob2.read();
		ob2.print();
	}
}