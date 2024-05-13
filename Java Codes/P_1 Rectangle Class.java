class Rectangle{
public static void main(String[] args){
int l = Integer.parseInt(args[0]);
int w = Integer.parseInt(args[1]);
int area = l*w;
int perimeter = 2*(l+w);
System.out.println("Area is " + area);
System.out.println("Perimeter is " + perimeter);
}}