package FundamentalJava;

public class FizzBuzz {

    private static void MetodeFizz() {

        System.out.println();//untuk menciptakan jarak dari top terminal sehingga tidak rapat 

        for (int i = 1; i <= 100; i++) {//looping ini untuk menciptakan angka yang dimulai dari 1-100 

            if (i % 3 == 0 && i % 5 == 0) {//kondisi percabangan jika angkanya itu adalah kelipatan 3 dan kelipatan 5 
                //maka program akan mengeluarkan output berupa tulisan Fizz
                System.out.println("\t" + "Fizz");

            } else if (i % 3 == 0) {//jika angka adalah kelipatan 3 maka program akan mencetak tulisan Buzz
                System.out.println("\t" + "Buzz");

            } else if (i % 5 == 0) {//jika angka adalah kelipatan 5 maka program akan mencetak tulisan FizzBuzz 
                System.out.println("\t" + "FizzBuzz");
            } else {//jika bukan angka kelipatan 3,5 dan buka keduanya maka cetak angka nya dan tidak mencetak tulisan apapun
                System.out.println("\t" + i);

            }

        }

    }

    public static void main(String[] args) {
        MetodeFizz();
        //karena methodnya static kita bisa langsung panggil menggunakan nama methodnya 

    }
