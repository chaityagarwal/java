class Volume
{
    public void result(int l, int w, int h)
    {
        System.out.println("Rectangular box volume");
        int vol = l*w*h;
        System.out.println("volume = " + vol);
    }

    public void result(int r, int h)   
    {
        System.out.println("Cylinder volume");
        double vol = 3.14*r*r*h;
        System.out.println("volume = " + vol);
    }
    public void result(int a)
    {
        System.out.println("Cuber box volume"); 
        int vol = a*a*a;
        System.out.println("volume = " + vol);
    }
    public static void main(String[] args)
    {
        Volume vol = new Volume();
        vol.result(15,10,5);
        vol.result(15,10);
        vol.result(15);
    }
}

