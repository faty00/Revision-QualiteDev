//
// Utilisation nominale des classes td3.Buffer, Killring et td3.Editor
//
////////////////////////////////////////////////////////////////

import fr.einfolearning.tp2.metiers.EmacsKillRing;
import fr.einfolearning.tp2.metiers.TextBuffer;
import fr.einfolearning.tp2.metiers.TextEditor;
import fr.einfolearning.tp2.metiers.exceptions.EmacsKillRingOverflowException;

public class App {

    public static void main(String[] args) throws EmacsKillRingOverflowException {

        // Test du buffer
        TextBuffer tb= new TextBuffer("mon texte buffer");

        String str = tb.toString();
        System.out.println("mon buffer initial: "+ str);

        int size = tb.maxP();
        System.out.println("la taille du buffer : " + size);

        tb.ins("premier ", 4 );
        System.out.println("mon buffer apres insertion: "+ tb.toString());

        tb.del(4, 11);
        System.out.println("mon buffer apres suppression: "+ tb.toString());

        tb.ins("deuxieme ", 4 );
        System.out.println("mon buffer apres reinsertion: "+ tb.toString());

        String extract = tb.substr(4, 12 );
        System.out.println("extrait de mon buffer : "+ extract);



        //test d'emacs
        EmacsKillRing emcs = new EmacsKillRing();
        emcs.add("mon emacs");

        String string = emcs.toString();
        System.out.println(string);

        boolean bool = emcs.isEmpty();
        System.out.println(bool);

        System.out.println(emcs.currentElt());
        emcs.add("mon deuxieme emacs");


        System.out.println(emcs.currentElt());
        emcs.rotateFwd();
        System.out.println(emcs.currentElt());

    }
}
