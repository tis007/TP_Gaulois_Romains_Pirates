import java.security.Guard;
import java.util.List;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Romains CaiusObtus = new Romains("Caius Obtus", Grade.CHEF);
        Romains Brutus = new Romains("Brutus ", Grade.CENTURION);
        Romains Briseradius = new Romains("Briseradius", Grade.SOLDAT);
        Romains CaligulaMinus = new Romains("CaligulaMinus", Grade.SOLDAT);
        Romains Chorus = new Romains("Chorus", Grade.CENTURION);
        Romains Milexcus = new Romains("Milexcus", Grade.SOLDAT);

        Gaulois Abraracourcix = new Gaulois("Abraracourcix", "CHEF");
        Gaulois Agecanonix = new Gaulois(" Agecanonix", "RETAITE");
        Gaulois Assurancetourix = new Gaulois("  Assurancetourix", "BARDE");
        Gaulois Bonemine = new Gaulois("Bonemine", "FEMME DU CHEF");
        Gaulois Asterix = new Gaulois("Astérix", "HEROS");
        Gaulois Obelix = new Gaulois("Obélix", "TAILLEUR DE MENHIR");
        Gaulois Cetautomatix = new Gaulois("Cétautomatix", "FORGERON");
        Gaulois Tragicomix = new Gaulois("Tragicomix", "BEAU GOSSE");
        Gaulois Ordralbabetix = new Gaulois("Ordralbabétix ", "POISSONIER");
        Gaulois Falbala = new Gaulois("Falbala", "FIANCEE");

        Druide Panoramix = new Druide(1, "Panoramix", "DRUIDE", 65, 30);

        Village LesIrreductibles = new Village(Abraracourcix);
        LesIrreductibles.addGaulois(Agecanonix);
        LesIrreductibles.addGaulois(Assurancetourix);
        LesIrreductibles.addGaulois(Bonemine);
        LesIrreductibles.addGaulois(Asterix);
        LesIrreductibles.addGaulois(Obelix);
        LesIrreductibles.addGaulois(Cetautomatix);
        LesIrreductibles.addGaulois(Tragicomix);
        LesIrreductibles.addGaulois(Ordralbabetix);
        LesIrreductibles.addGaulois(Falbala);
        LesIrreductibles.addGaulois(Panoramix);


        System.out.println(LesIrreductibles.seRencontrer(Agecanonix, Cetautomatix));

Camp Babaorum = new Camp(CaiusObtus);
Babaorum.addRomain(Brutus);
Babaorum.addRomain(Briseradius);
Babaorum.addRomain(CaligulaMinus);
Babaorum.addRomain(Chorus);
Babaorum.addRomain(Milexcus);
System.out.println(Babaorum.seRencontrer(Brutus, Milexcus));
System.out.println(Babaorum.seRencontrer(Milexcus, Brutus));


    }


}