package Liburan;

import java.util.*;

public class No02 {
    public static void main(String args[]) {
        char charArray[] = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };// Membuat array char yang berisi beberapa
                                                                           // karakter
        // yang kita simpan di dalam chararray ini
        String s = new String("hello");// membuat object string dan mengisikan parameternya

        String s1 = new String();// Mmembuat object string s1 tanpa menggunakan konstruktor yang ada parameternya
        String s2 = new String(s);// membuat object string s2 dan mengisikan nilai di parameter konstruktor string
                                  // ini dengan
        // object dari string s
        String s3 = new String(charArray);// Membuat object String S3 dan mengisikan nilai dari parameter konstruktor
                                          // string ini
        // menggunakan array karakter yang variabelnya bernama charrarray
        String s4 = new String(charArray, 6, 3);// Kitra membuat object dari kelas string dan menggunakan konstruktor
        // untuk mengambnil nilai dari array char yang berisi karakter dengan ketentuan
        // kita mengambil data yang ada di dalam
        // array char ini dimulai dari index ke 6 dan hanya akan mengambil 3 karakter
        // saja yang di mualai dari index ke 6 ini
        System.out.println("s1 = " + s1);// Menvetak nilai dari object s1
        System.out.println("s2 = " + s2);// mecetak nilai dari object s2
        System.out.println("s3 = " + s3);// mencetak nilai dari object s3
        System.out.println("s4 = " + s4);// mencetak nilai dari object s4

        // lalu di dalam program ini kita menggunakan percabangan if else untuk
        // memeriksa
        // nilai dari obejct kelas string apaklahj sesuai dengan dugaan kita
        // berdasarkanlogika pemograman yang kita buat
        if (s.equals("hello"))// menggunakan equals unruk memperhatikan apakah nilai yang kita masukan
                              // merupakan huruf
            // besar semua atau hururf kecil semua
            System.out.println("s is equals as \"hello\"");
        else
            System.out.println("s is not equals as \"hello\"");

        if (s.equalsIgnoreCase("HELLO"))
            System.out.println("s is equals as \"hello\"");
        else
            System.out.println("s is not equals as \"hello\"");
        if (s3.contains("day"))
            System.out.println("s3 contains \"day\"");
        else
            System.out.println("s3 do not contains \"day\"");
        String s5 = s.concat(" " + s3);
        System.out.println(s5);

        String s6 = s5.replaceAll("hello", "happy");
        System.out.println(s6);

        String[] s7 = new String[3]; // membuat array of object dari kelas string dengan nama variabelnya s7
        // dan panajang dari arraynya adalah 3 yang artinya variabel s& dappat menampung
        // 3 object dari kelas String
        s7 = s6.split(" ");// memanggil method split pada object s6 dan memasukkan parameter yang
                           // diinginkan
        // method split digunakan untuk membagi string menjadi array of string
        // berdasarkan karakter tertentu kalau di sini kita menggunakan karakter spasi "   " 
        for (int i = 0; i < s7.length; i++)
            System.out.println(s7[i]);

        StringTokenizer tokens = new StringTokenizer(s6);// Kelas yang digunakan untuk membagi string menjadi token-token
        System.out.println("Number of Token =" + tokens.countTokens());

        while (tokens.hasMoreTokens())
            System.out.println(tokens.nextToken());
    }

}
