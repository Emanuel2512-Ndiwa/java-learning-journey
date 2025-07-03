package Liburan;

import java.util.Scanner;

public class BilPrima {

    // Scanner sebaiknya dideklarasikan di sini jika mau dipakai di banyak method
    // atau di dalam main dan dioper ke method.
    // Untuk latihan ini, kita pindahkan ke dalam metode.

    // Metode ini dibuat static agar bisa langsung dipanggil dari main.
    private static void cekBilanganPrima() { // Mengubah nama agar lebih deskriptif dan static
        Scanner input = new Scanner(System.in); // Deklarasi Scanner di dalam metode

        System.out.println("=================================");
        System.out.println();
        System.out.print("Masukan Bilangan\t:");
        int angka = input.nextInt();

        boolean adalahPrima = true; // Inisialisasi 'adalahPrima' di sini, sebelum loop

        if (angka <= 1) { // Tangani kasus khusus 0 dan 1
            adalahPrima = false; // 0 dan 1 bukan prima
        } else {
            // Loop untuk mencari pembagi
            // Kita hanya perlu cek sampai Math.sqrt(angka) untuk efisiensi,
            // tapi a < angka juga tidak salah untuk latihan.
            for (int a = 2; a < angka; a++) {
                if (angka % a == 0) { // Jika ditemukan pembagi
                    adalahPrima = false; // Ubah flag menjadi false
                    break;             // Langsung keluar dari loop karena sudah pasti bukan prima
                }
                // HAPUS System.out.println di dalam else block loop ini!
                // Jangan cetak apapun di sini.
            }
        }

        // Kunci: Cetak hasil AKHIR setelah loop selesai (atau kasus <= 1)
        if (adalahPrima) { // Periksa nilai akhir dari flag
            System.out.println(angka + " adalah Bilangan Prima.");
        } else {
            System.out.println(angka + " bukan Bilangan Prima.");
        }

        input.close(); // Tutup Scanner setelah semua input selesai
    }

    public static void main(String[] args) {
        System.out.println(); // Untuk spasi awal

        // Panggil metode static secara langsung
        cekBilanganPrima();
    }
}