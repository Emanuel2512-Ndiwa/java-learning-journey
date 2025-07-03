package Liburan;

import java.util.Scanner;

public class Bintang {

    static void metodeBintang() {
        Scanner input = new Scanner(System.in); // Deklarasi Scanner di dalam metode

        System.out.print("\tMasukan Angka\t=");
        int angka = input.nextInt(); // 'angka' adalah tinggi segitiga

        // Loop Luar: Mengontrol jumlah BARIS
        // Dimulai dari 'angka' dan turun hingga 1

        for (int i = angka; i >= 1; i--) { // 'i' merepresentasikan jumlah bintang di baris ini
            // Loop Dalam: Mengontrol jumlah BINTANG di setiap BARIS
            // Mencetak bintang sebanyak nilai 'i' saat ini
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Cetak bintang di baris yang sama
            }
            System.out.println(); // Pindah ke baris baru setelah semua bintang untuk baris 'i' tercetak
        }

        input.close(); // Penting: Tutup Scanner setelah selesai digunakan
    }

    public static void main(String[] args) {
        metodeBintang(); // Panggil metode untuk menjalankan program
    }
}