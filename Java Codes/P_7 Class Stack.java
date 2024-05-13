import java.util.Scanner;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to the stack.");
        } else {
            System.out.println("Stack overflow! Cannot push " + value + ".");
        }
    }

    public void pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack.");
        } else {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
        }
    }

    public void peek() {
        if (top >= 0) {
            System.out.println("Top element of the stack: " + stackArray[top]);
        } else {
            System.out.println("Stack is empty. Cannot peek.");
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

public class StackExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack myStack = new Stack(5);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to push:");
                    int pushValue = scanner.nextInt();
                    myStack.push(pushValue);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.peek();
                    break;
                case 4:
                    myStack.display();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
