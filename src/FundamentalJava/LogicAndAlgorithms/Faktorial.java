package FundamentalJava;

import java.util.Scanner;

public class Faktorial {

    static void bilFaktorial() {
        Scanner input = new Scanner(System.in);

        boolean jawaban = true;

        while (jawaban) {// Loping ini untuk mengulang program faktorial yang dimana looping ini akan terus berjalan selama nilainya true
            //nilai true ini kita simpan di sebuah variabel yang namanya jawaban,lalu variabel ini kita set nilai defultnya adalah true 
            //lalu kita akan meminta user untuk memasukan nilai boolean baru jika yang diinput adalah ya/true maka parogram akan meminta user memasukan ulang angka  
            //yang akan di cari nilai faktorialnya,jika user input t/flase maka program akan berhenti  
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
                /*ini adalah inputan yang kita cari dari user nilai while akan berubah di sini  */
                System.out.println("Silahakn Lanjutkan");
            } else if (jawab.equalsIgnoreCase("T")) {
                jawaban = false;//ini jika user input T atau tidak nilainya itu adalah false dan program akan berhenti 

            }
        }
        input.close();

    }

    public static void main(String[] args) {
        System.out.println("\n\n\t\tFaktorial\n\n");
        bilFaktorial();

    }

}
