class Calculator
{
    public static void Addition(int a,int b)
    {
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
    }

    public static void Subtraction(int a,int b)
    {
        int sub = a - b;
        System.out.println("Subtraction of two numbers is: " + sub);
    }

    public static void Multiplication(int a,int b)
    {
        int mult = a * b;
        System.out.println("Product of two numbers is: " + mult);
    }

    public static void Division(int a,int b)
    {
        int div = a / b;
        System.out.println("Division of two numbers is: " + div);
    }
    
    public static void main(String args[])
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Calculator cal = new Calculator();
        cal.Addition(x, y);
        cal.Subtraction(x, y);
        cal.Multiplication(x, y);
        cal.Division(x, y);

    }
}