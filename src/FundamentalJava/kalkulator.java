package Liburan;

import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("----- Kalkulator Sederhana ----");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukan Nama \t:");
        String nama = input.next();

        System.out.println("\tHalo Selamat Datang\t" + nama + "\tDi Kalkulator Mini");
        System.out.println("\t\tSelamat Mencoba");
        System.out.println("\t=============================");
        System.out.print("\tMasukan Angka ke-1\t=");
        int angka1 = input.nextInt();

        System.out.print("\tMasukan Angka ke-2\t=");
        int angka2 = input.nextInt();

        System.out.println("\tpilih operasi\t:");
        System.out.println("\t*");
        System.out.println("\t/");
        System.out.println("\t+");
        System.out.println("\t-");
        System.out.print("\tPilihan\t=");
        String pilih = input.next();

        int total = 0;
        if (pilih.equalsIgnoreCase("*")) {
            total = angka1 * angka2;
            System.out.println("\tIni\t" + nama + "\thasil perkalian Mu\t=" + total);

        } else if (pilih.equalsIgnoreCase("/")) {
            if (angka2 != 0) { 
                total = angka1 / angka2;
                System.out.println("\tIni\t" + nama + "\thasil pembagian Mu\t=" + total);
            } else {
                System.out.println("\t" + nama + "\t: Tidak bisa melakukan pembagian dengan nol!");
            }

        } else if (pilih.equalsIgnoreCase("+")) {
            total = angka1 + angka2;
            System.out.println("\tIni\t" + nama + "\thasil penjumlahan Mu\t=" + total);

        } else if (pilih.equalsIgnoreCase("-")) {
            total = angka1 - angka2;
            System.out.println("\tIni\t" + nama + "\thasil pengurangan Mu\t=" + total);

        } else {
            System.out.println("\t" + nama + "\t Opsi Yang DI Pilih Tidak Tersedia");
        }
        System.out.println("\t=============================");
        input.close();
    }

}
