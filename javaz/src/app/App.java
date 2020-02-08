package app;

public class App {
    public static void main(String[] args) throws Exception {

        // invoke printNumbers method
        App app = new App();

        app.printNumbers();

    }

    public void printNumbers() {

        for (int i = 100; i > 0; i--) {

            // if number divided by 5
            if (i%5 == 0) {
                System.out.println("Agile");
            }

            // if number divided by 3
            if (i%3 == 0) {
                System.out.println("Software");
            }

            // if number divided by 3 and 5
            if (i%5 == 0 && i%3 == 0) {
                System.out.println("Testing");
            }

            // if not divided, print number
            else {
                System.out.println(i);
            }
        }
    }
}