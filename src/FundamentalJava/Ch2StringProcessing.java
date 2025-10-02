package FundamentalJava;

import javax.swing.JOptionPane;

public class Ch2StringProcessing {
    public static void main(String[] args) {
        String fullName,firstName,lastName,space;
        fullName = new String("Decafe Latte");
        space = new String("");
        firstName = fullName.substring(fullName.indexOf(space));
        lastName =fullName.substring(fullName.indexOf(space)+1,fullName.length());

        JOptionPane.showMessageDialog(null, "Full Name\t:"+fullName);
        JOptionPane.showMessageDialog(null, "Firts Name\t:"+firstName);
        JOptionPane.showMessageDialog(null, "Last Name\t:"+lastName);
        JOptionPane.showMessageDialog(null, "You Last Name has\t"+lastName.length()+"Characters");
    }
}
