class NumberPrinter extends Thread {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                // For the second thread, sleep for 1000ms when value is 6
                if (Thread.currentThread().getName().equals("Thread-1") && i == 6) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            for (int i = start; i >= end; i--) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class TwoThreadsExample {
    public static void main(String[] args) {
        NumberPrinter thread1 = new NumberPrinter(1, 10);
        NumberPrinter thread2 = new NumberPrinter(10, 1);

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();
    }
}