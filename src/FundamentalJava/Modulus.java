package FundamentalJava;

public class Modulus {

    static void tebakAngka(int angka) {//modulus atau sisa bagi untuk mencari bilangan ganjil dan genap
        if (angka % 2 == 0) {//jika angka yang di masukan itu dibagi dengan 2 tidak ada sisa maka itu adalah angka genap
            //misalnya angka yang di input itu adalah 4 
            //maka 4/2 = 2 tidak ada sisa kan maka program akan mencetak tulisan di layar Angka Genap 
            System.out.println("Angka Genap");
        } else {//jika dibagi dengan angka dua dan masih ada sisa maka akan mencetak tulisan angka ganjil
            //misalnya 5/2 = 2,555   karena ada nilai koma di belakangnya ini yang di namakan ada sisa 
            //karena jika kita bulatkan hasilnya adalah 2 .pokoknya angka yang jika di bagi dengan 2 hasilnya itu ada koma dibelakangnya itu dinamakan ada sisa 

            System.out.println("Angka Ganjil");
        }
    }

    public static void main(String[] args) {
        tebakAngka(7);  // Contoh penggunaan mehtod static
    }
}
