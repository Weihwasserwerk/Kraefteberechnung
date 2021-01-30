package gruppenarbeit.ausgabe;

import gruppenarbeit.statischesSystem.Kragtraeger;

import java.io.File;
import java.io.IOException;


//used for end result; no write access to objects, just reading
public class Bericht {

    public Bericht(Kragtraeger k) {
        try {
            File txt = new File("bericht.txt");
            if (!txt.createNewFile()) {
                txt.delete();
                txt.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
