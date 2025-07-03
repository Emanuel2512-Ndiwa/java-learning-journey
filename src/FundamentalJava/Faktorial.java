package Liburan;

import java.util.Scanner;

public class Faktorial {

    static void bilFaktorial() {
        Scanner input = new Scanner(System.in);

        boolean jawaban = true;

        while (jawaban) {
            System.out.print("\tMasukan Angka\t=");
            long N = input.nextLong();
            long hasilFaktorial = 1;
            if (N == 0) {
                System.out.print("," + "1");
            } else {
                for (int i = 1; i <= N; i++) {
                    hasilFaktorial = hasilFaktorial * i;

                }
                System.out.print("\tHasil Faktorial\t=" + hasilFaktorial);
            }
            System.out.println();
            System.out.print("Apakah Ingin Cari Tau Lagi ? Y/N ");
            String jawab = input.next();

            if (jawab.equalsIgnoreCase("Y")) {
                System.out.println("Silahakn Lanjutkan");
            } else if (jawab.equalsIgnoreCase("N")) {
                jawaban = false;

            }
        }
        input.close();

    }

    public static void main(String[] args) {
        System.out.println("\n\n\t\tFaktorial\n\n");
        bilFaktorial();

    }

}
