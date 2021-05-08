package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();

        // java 8 lambda

        // () -> {}

        Runnable runnable1 = () -> {
            System.out.println("Inside runnable 2");
            System.out.println("Inside runnable 2.1");
        };

        new Thread(runnable1).start();

        new Thread(() -> { System.out.println("Inside runnable 3"); }).start();
    }
}
