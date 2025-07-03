package Liburan;

import java.util.Scanner;

public class bintangKanan {

    static void metodeBintang() {
        Scanner input = new Scanner(System.in);

        System.out.print("\tMasukan Tinggi Segitiga\t=");
        int tinggi = input.nextInt(); // Misal: tinggi = 5

        // Loop Luar: Mengontrol BARIS
        // 'a' akan berjalan dari 1 hingga 'tinggi' (1, 2, 3, 4, 5)
        for (int a = 1; a <= tinggi; a++) {

            // Loop Dalam PERTAMA: Untuk SPASI
            // 'b' akan mencetak spasi sebanyak (tinggi - a)
            // Contoh:
            // Jika a=1 (baris 1): b dari 1 sampai (5-1)=4 -> cetak 4 spasi
            // Jika a=2 (baris 2): b dari 1 sampai (5-2)=3 -> cetak 3 spasi
            // ...
            // Jika a=5 (baris 5): b dari 1 sampai (5-5)=0 -> cetak 0 spasi
            for (int b = 1; b <= (tinggi - a); b++) {
                System.out.print(" "); // Cetak satu spasi
            }

            // Loop Dalam KEDUA: Untuk BINTANG
            // 'c' akan mencetak bintang sebanyak 'a' (nomor baris)
            // Contoh:
            // Jika a=1 (baris 1): c dari 1 sampai 1 -> cetak 1 bintang
            // Jika a=2 (baris 2): c dari 1 sampai 2 -> cetak 2 bintang
            // ...
            // Jika a=5 (baris 5): c dari 1 sampai 5 -> cetak 5 bintang
            for (int c = 1; c <= a; c++) { // <-- PERBAIKI KONDISI INI
                System.out.print("*");
            }

            System.out.println(); // Pindah ke baris baru setelah spasi dan bintang tercetak untuk baris ini
        }

        input.close(); // Tutup scanner
    }

    public static void main(String[] args) {
        metodeBintang();
    }
}
