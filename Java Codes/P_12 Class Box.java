class Box{
	double length, wedth, height;
	Box(double l, double w, double h, double h){
		length = l;
		wedth = w;
		height = h;
	}
	double volume(){
		return (length * wedth * height);
	}
}

class BoxWeight extends Box{
	double weight;
	BoxWeight(double l, double w, double h, double h, double wt){
		super(l,w,h);
		weight = wt;
	} 
}

class Shipment extends BoxWedth{
	double costpervol, costperwt;
	Shipment(double l, double w, double h, double h, double wt, double cpv, double cpw){
		super(l,w,h,wt);
		costpervol = cpv;
		costperwt = cpw;
	}
	void calculateCost(){
		double vol = super.volume();
		double volcost = vol*costpervol;
		double wtcost = weight*costperwt;
		System.out.println("Cost acc volume: "+ volcost);
		System.out.println("Cost acc weight: "+ wtcost);
	}
}

class ShipmentCost{
	public static void main(String[] args){
		Shipment ship = new Shipment(10.0, 7.0, 9.0, 45.0, 10.0, 12.0);
		ship.calculateCost();
	}
}