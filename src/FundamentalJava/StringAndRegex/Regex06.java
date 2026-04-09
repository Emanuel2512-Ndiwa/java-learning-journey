package FundamentalJava;

import javax.swing.*;

public class Regex06 {
      //membuat variabel STOP,JAVA dan INVALID dengan tipe datanya String 
    //serta acses modifier dari keempat tipe data ini adalah private yang artinya variabel ini hanay bisa di akses 
    //dari dalam kelas tmepat variabel aini di buat dan static ini menyatakan bahwa variabel ini milikny akelas bnukan miliknya object
    //dan final menunjukan nilai variabel yang sudah kita buat itu tidka dapoat di ubah lagi setelah di deklarasikan 
    private static final String STOP = "STOP";
    private static final String JAVA = "Input Sesuai Kriteria";
    private static final String INVALID = "Input Tidak Sesuai Kriteria";
    private static final String VALID = "^[a-zA-Z]+$";//menggunakan reguler expression untuk mengecek apakah inputan sesuai kriteria yaitu hanya huruf besar atau kecil

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, args, "Progam Seleksi Huruf", JOptionPane.PLAIN_MESSAGE);
        int lanjut = JOptionPane.showConfirmDialog(null, args, "Apakah Ingin Lanjutkan", JOptionPane.YES_NO_OPTION);
        if (lanjut == JOptionPane.YES_OPTION) {//jika user memilih ya maka program akan lanjut
            String jawab = JOptionPane.showInputDialog(args, "Masukan Huruf Besar Atau Kecil");
            String rply;//membuat veriabel string baru untuk menyimpan output dari proses perulangan while
            while(true){//membuat perulangan while yang akan terus berjalan sampai user memasukan kata STOP
                if(jawab.toUpperCase().equals(STOP)){//menggunakan toUpperCase agar outputnya hanya dalam bentuk huruf kapital
                    break;//memberhentikan perulangan
                }
                if(jawab.matches(VALID)){//menggunakan matches agar outputnya hanya berupa true/false
                    rply = JAVA;//mengisi variabel rply dengan konstanta variabel JAVA
                }else{
                    rply = INVALID;//mengisi variabel rply dengan konstanta variabel INVALID
                }
                JOptionPane.showMessageDialog(null, rply);//menampilkan output dari variabel rply
                lanjut = JOptionPane.showConfirmDialog(null, args, "Apakah Ingin Lanjutkan", JOptionPane.YES_NO_OPTION);
                if(lanjut == JOptionPane.NO_OPTION){//jika user memilih ya maka program akan lanjut
                    break;//memberhentikan perulangan
                }
                jawab = JOptionPane.showInputDialog(args, "Masukan Huruf Besar Atau Kecil");//meminta user memasukan ulang angka
            }
        }else{
            JOptionPane.showMessageDialog(null, args,"Progrma Selesai", JOptionPane.PLAIN_MESSAGE);//menampilkan output dari variabel rply
        }

    }
}
