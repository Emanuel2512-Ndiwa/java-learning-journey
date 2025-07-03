package Liburan;

public class No03 {

    public static void main(String args[]) {
        // Membuat variabel baru string dan mengisikannya
        String firstString = "Every day is sunday";
        String secondString = "Vini pergi ke pasar 3 jam lalu, bersama4 temannya";

        // Mencetak string asli
        System.out.printf("Original String 1: %s\n", firstString);

        // Menggantikan kata "day" dengan "weekthere" dalam string firstString
        // \bday\b adalah pola regular expression yang digunakan untuk mencocokkan kata "day" 
        firstString = firstString.replaceAll("\\bday\\b", "weekthere");
        System.out.printf("Original string 1 become : %s\n", firstString);

        // Mencetak string asli
        System.out.printf("Original String 2: %s\n", secondString);

        // Menggantikan karakter "a" dengan "o" dalam string secondString
        // [a] adalah pola regular expression yang digunakan untuk mencocokkan karakter "a"
        secondString = secondString.replaceAll("[a]", "o");
        System.out.printf("Original string 2 become : %s\n", secondString);

        // Menggantikan setiap kata dengan "word" dalam string firstString
        // \\w+ adalah pola regular expression yang digunakan untuk mencocokkan satu atau lebih karakter word
        System.out.printf("Every word replaced by \"word\": %s\n\n", firstString.replaceAll("\\w+", "word"));

        // Menggantikan kemunculan pertama karakter digit dengan "digit" dalam string secondString
        // \\d adalah pola regular expression yang digunakan untuk mencocokkan karakter digit
        secondString = secondString.replaceFirst("\\d", "digit");
        System.out.printf("?? %s\n", secondString);

        // Membagi string secondString menjadi array substring berdasarkan koma diikuti oleh nol atau lebih spasi
        // ,\\s* adalah pola regular expression yang digunakan untuk mencocokkan koma diikuti oleh nol atau lebih spasi
        String[] results = secondString.split(",\\s*");
        String output = "String split at commas: [";
        for (String string : results) {
            // Melakukan loop pada array results dan mengassign nilai setiap elemen ke variabel string
            output += "\"" + string + "\", ";
        }
        System.out.println("Hasil split : " + output);
        output = output.substring(0, output.length() - 2) + "]";
        System.out.println(output);
    }
}