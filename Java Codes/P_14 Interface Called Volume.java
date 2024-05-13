interface Volume{
	double pi = 3.14;
	double calVolume(double radius, double height);
}

class Cylinder implements Volume{
	public double calVolume(double radius, double height){
		return (pi * radius * radius * height);
	}
}

class Cone implements Volume{
	public double calVolume(double radius, double height){
		return ((1.0/3.0) * pi * radius * radius * height);
	}
}

class Main{
	public static void main(String[] args){
		Cylinder ob1 = new Cylinder();
		Cone ob2 = new Cone();
		double cylVol = ob1.calVolume(5.0, 7.8);
		double conVol = ob2.calVolume(3.0, 8.7);
	}	
}