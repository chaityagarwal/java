class Fibonacci
{
    int size;

    Fibonacci(int n)
    {
        size = n;
    }
    
    public void generateSeries()
    {
        int f1 = 0, f2 = 1;
        for(int i = 0; i< size; i++)
        {
            System.out.print(f1 + " ");
            int temp = f1;
            f1 = f2;
            f2 = f1 + temp;
        }
    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        Fibonacci fibo = new Fibonacci(n);
        fibo.generateSeries();
    }
}