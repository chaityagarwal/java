class Cone {
    double radius;
    double height;

    Cone(double r, double h){
        radius = r;
        height = h;
    }

    Cone(){
        radius = 1.0;
        height = 1.0;
    }

    void volume(){
        double vol = (1.0/3.0) * 3.14 * radius * radius * height;
        System.out.println("Volume of cone is: " + vol);
    }

    public static void main(String[] args) {
        if(args.length == 2){
            double r = Double.parseDouble(args[0]);
            double h = Double.parseDouble(args[1]);
            Cone c1 = new Cone(r,h);
            c1.volume();
        }

        else{
            Cone c2 = new Cone();
            c2.volume();
        }
    }
}