package FundamentalJava;

import javax.swing.JOptionPane;

public class Ch2Monogram {
    public static void main(String[] args) {
        String name,first,middle,last,space,monogram;
        space=" ";

        //input full name
        name=JOptionPane.showInputDialog(null,"Enter You Full Naame\t(First,Middle,Last)");
        //extract first middle last
        first =name.substring(name.indexOf(space));
        last=name.substring(name.indexOf(space),name.length());
        //compute the monogram

        middle=" ";
        monogram=first.substring(0,1)+middle.substring(0,1)+last.substring(0,1);

        //output Result
        JOptionPane.showMessageDialog(null,"Your Monogram Is"+monogram);


    }
}
