class NegativeResultException extends Exception {
    public NegativeResultException(String message) {
        super(message);
    }
}

class Test {
    public static int performSubtraction(int num1, int num2) throws NegativeResultException {
        if (num1 < num2) {
            throw new NegativeResultException("Subtraction would result in a negative number");
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        try {
            int result = performSubtraction(5, 10);
            System.out.println("Result: " + result);
        } catch (NegativeResultException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
