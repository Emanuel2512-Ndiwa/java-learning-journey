package Liburan;

import javax.swing.JOptionPane;
//disini saya mengimport Joption 
//agar tampilan outputnya lebih menarik

public class Regex04 {
    //membuat variabel STOP,JAVA dan INVALID dengan tipe datanya String 
    //serta acses modifier dari keempat tipe data ini adalah private yang artinya variabel ini hanay bisa di akses 
    //dari dalam kelas tmepat variabel aini di buat dan static ini menyatakan bahwa variabel ini milikny akelas bnukan miliknya object
    //dan final menunjukan nilai variabel yang sudah kita buat itu tidka dapoat di ubah lagi setelah di deklarasikan 
    private static final String STOP = "STOP";
    private static final String JAVA = "VALID JAVA IDENTIFIER";
    private static final String INVALID = "NOT A VALID JAVA IDENTIFIER";

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Program Hitung Karakter Angka");
        String angka = JOptionPane.showInputDialog(null, "Masukan Angka", "Input Angka", JOptionPane.QUESTION_MESSAGE);
        //Membuat variabel baru angka bertipe string untuk menyimpan nilai inputan dari user 
        //lalu kita mnenggunakan perulangan while yang dimana program akan terus berjalan dan meminta inputan user meemasukan angka
        //dan program ini hanya akan berhenti jika user memasukan kalimat STOP
        while (true) {
            //di dalam looping while ini kita menggunakan percabangna if else yang bertujuan untuk memeriksa 
            //inputan yabng di mawsukan user itu apa 
            if (angka.toUpperCase().equals(STOP)) {//menggunakan toUppercase untuk memastikan bahwa yang di input semuanya emnggunakan huruf besar 
                //dan equals untuk memastikan apakah yang diinput ini sama identik kalimatnya dengan yang sudah kita sediakan di variabel STOP 
                break;//untuk memberhentikan program 
            }

            if (angka.length() >= 5 && angka.length() <= 10) {//menggunakan lenght untuk mengetahui panjang dari  stringnya itu berapa 
                if (angka.matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(null, JAVA);
                } else {
                    JOptionPane.showMessageDialog(null, INVALID);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Angka harus memiliki panjang antara 5 sampai 10 digit");
            }

            angka = JOptionPane.showInputDialog(null, "Masukan Angka", "Input Angka", JOptionPane.QUESTION_MESSAGE);
        }
    }
}