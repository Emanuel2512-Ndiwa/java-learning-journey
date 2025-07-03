package Liburan;

public class FizzBuzz {

    private static void MetodeFizz() {

        System.out.println();

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("\t" + "Fizz");

            } else if (i % 3 == 0) {
                System.out.println("\t" + "Buzz");

            } else if (i % 5 == 0) {
                System.out.println("\t" + "FizzBuzz");
            } else {
                System.out.println("\t" + i);

            }

        }

    }

    public static void main(String[] args) {
        MetodeFizz();
    }

}
