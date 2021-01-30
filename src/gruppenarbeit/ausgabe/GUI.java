package gruppenarbeit.ausgabe;

import javax.swing.*;
import gruppenarbeit.statischesSystem.Kragtraeger;

public class GUI {
     //required parameters for GUI
    //why does the main function so many things???
    public static void main(String[] args) {
        double _p, _l, _xa;
        //new lab();
        //calculate button --> check if everythings all right

        //test variables
        _p = 10;
        _l = 20;
        _xa = 30;
        Kragtraeger k = new Kragtraeger(_l, _p, _xa);
        //new Bericht(k);
        System.out.println(k.get_mMax());

    }
    //GUI Methods
    public GUI(){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

    }








    //setter with filter
    //input --> check --> tmp
}
