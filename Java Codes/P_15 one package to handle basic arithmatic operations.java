Arithmetic.java:
public class Arithmetic{
    public void add(int a, int b){
        System.out.println("Addition: " + (a+b));
    }
    public void subtract(int a, int b){
        System.out.println("Subtraction: " + (a-b));
    }
    public void multiply(int a, int b){
        System.out.println("Multiplication: " + (a*b));
    }
    public void divide(int a, int b){
        if(b!=0){
            System.out.println("Division: " + (double)(a / b));
        }
        else{
            System.out.println("Error! Division by zero is not allowed");
        }
    }
}
Main.java:
import arithm.*;

public class Main {
    public static void main(String[] args) {
        Arithmetic ob = new Arithmetic();
        ob.add(10, 20);
        ob.subtract(35, 7);
        ob.multiply(4, 8);
        ob.divide(64, 8);

    }
}
