package FundamentalJava;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class DateExample {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date();
        sdf = new SimpleDateFormat();
        JOptionPane.showMessageDialog(null, "Today is"+sdf.format(today));
    }

}
