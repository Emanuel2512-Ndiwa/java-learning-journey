package Liburan;

public class Modulus {

    static void tebakAngka(int angka) {
        if (angka % 2 == 0) {
            System.out.println("Angka Genap");
        } else {
            System.out.println("Angka Ganjil");
        }
    }

    public static void main(String[] args) {
        tebakAngka(7);  // Contoh penggunaan
    }
}
