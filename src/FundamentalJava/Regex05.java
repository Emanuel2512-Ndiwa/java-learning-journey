package Liburan;


import javax.swing.JOptionPane;


public class No04D {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, args, "Program Hapus Karakter", JOptionPane.INFORMATION_MESSAGE);
        String kalimat = "<html lang=\"id\">\r\n" + //
                "<head>\r\n" + //
                "<meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
                + //
                "<title>Contoh Halaman Web</title>\r\n" + //
                "</head>\r\n" + //
                "<body> <header> <h1>Selamat Datang di Situs Kami!</h1> </header>\r\n" + //
                "<main> <p>Ini adalah paragraf pertama dari halaman web contoh ini. HTML\r\n" + //
                "adalah bahasa yang digunakan untuk membuat struktur halaman web.</p>\r\n" + //
                "<p>Anda bisa belajar lebih lanjut tentang HTML di <a\r\n" + //
                "href=\"https://www.htmlschools.com\"\r\n" + //
                "target=\"_blank\">HTMLSchools</a>.</p> </main>\r\n" + //
                "<footer> <p> 2024 Contoh Halaman Web. Semua hak cipta dilindungi.</p>\r\n" + //
                "</footer>\r\n" + //
                "</body>\r\n" + //
                "</html>                                 ";//membuat variabel kalimat yang berisi string html
                String hapus=kalimat.replaceAll("<[^>]*>","");//menggunakan replaceAll untuk menghapus semua tag html 
                JOptionPane.showMessageDialog(null, "Program Hapus Karakter\n\n" + hapus, "Program Eman", JOptionPane.INFORMATION_MESSAGE);//menampilkan output

    }

}
