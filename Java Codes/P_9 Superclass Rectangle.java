class Rectangle
{
	double length;
	double wedth;

	Rectangle(double l, double w)
	{
		length = l;
		wedth = w;
	}

	double area()
	{
		return (length * wedth);
	}
}

class RectBox extends Rectangle
{
	double height;

	RectBox(double l, double w, double h)
	{
		super(l, w);
		height = h;
	}

	double volume()
	{
		return (length * wedth * height);
	}
}

class Geometry
{
	public static void main(String[] args)
	{
		RectBox ob = new RectBox(10.0, 7.0, 12.0);
		double area = ob.area();
		double volume = ob.volume();
		System.out.println("Area = "+ area);
		System.out.println("Volume = "+ volume);
	}
}