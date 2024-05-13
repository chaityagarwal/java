class Dimension{
	double area(){
		return 0.0; //Default
	}
}

class Rectangle extends Dimension{
	double length;
	double wedth;
	Rectangle(double l, double w){
		length = l;
		wedth = w;
	}
	double area(){
		return (length*wedth);
	}
}

class Triangle extends Dimension{
	double height;
	double brace;
	Triangle(double h, double b){
		height = h;
		brace = b;
	}
	double area(){
		return (height*brace);
	}
}

class Geometry_11{
	public static void main(String[] args){
		Rectangle re = new Rectangle(10.0, 7.0);
		Triangle tr = new Triangle(9.0, 6.0);
		System.out.println("Area of Rectangle: " + re.area());
		System.out.println("Area of Triangle: " + tr.area());
	}
}