package FundamentalJava;
import javax.swing.JOptionPane;
public class Regex03 {
      //membuat variabel STOP,JAVA dan INVALID dengan tipe datanya String 
    //serta acses modifier dari keempat tipe data ini adalah private yang artinya variabel ini hanya bisa di akses 
    //dari dalam kelas tmepat variabel aini di buat dan static ini menyatakan bahwa variabel ini milikny akelas bnukan miliknya object
    //dan final menunjukan nilai variabel yang sudah kita buat itu tidka dapoat di ubah lagi setelah di deklarasikan 
    private static final String STOP ="STOP";
    private static final String JAVA ="Digit Angka Memenuhi Kriteria";
    private static final String INVALID = "Digit Angka Tidak Memenuhi Kriteria";
    private static final String VALID = "^[0-9][A-Z][a-zA-Z]{5,}[*#]$";

    public static void main(String[] args) {
        String kata = JOptionPane.showInputDialog(args,"Masukan Angka Minimal Huruf Besar Kecil 8 Karakter");
        String rply;//membuat veriabel string baru untuk menyimpan output dari proses perulangan while
        
        while (true){
            if (kata.toUpperCase().equals(STOP)){
                //menggunakan toUpperCase agar outputnya hanya dalam bentuk huruf kapital
                break;
            }
            if (kata.matches(VALID)){
                //menggunakan matches agar outputnya hanya berupa true/false
                rply = JAVA;//mengisi variabel rply dengan konstanta variabel JAVA
            } else{
                rply = INVALID;//mengisi variabel rply dengan konstanta variabel INVALID
            }
            JOptionPane.showMessageDialog(null,rply);
            kata = JOptionPane.showInputDialog(args,"Masukan String"); 
            //meminta user memasukan ulang angka  
   
        }
        


    }
    
}
