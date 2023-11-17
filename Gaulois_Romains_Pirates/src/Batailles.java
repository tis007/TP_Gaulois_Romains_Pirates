import java.util.ArrayList;

public class Batailles {
    private Village village;
    private Camp camp;

    public Batailles(Village village, Camp camp) {
        this.village = village;
        this.camp = camp;
    }

    public void faireUneBatailleStrategie2(){

    }

    public void faireUneBatailleStrategie1(){
        ArrayList<Humains> lesBagarreursGaulois = village.justLesBagarreurs();
        camp.romainGetCombatForce();
        ArrayList<Humains> lesBagarreursRomains = camp.justLesBagarreurs();

        while (!lesBagarreursRomains.isEmpty()) {
            village.distributionPotion();
            for (int i = lesBagarreursRomains.size() - 1; i >= 0; i--) {
                for (int j = lesBagarreursGaulois.size() - 1; j >= 0; j--) {
                    if (((Gaulois) lesBagarreursGaulois.get(j)).getForceCombat() > 5) {
                        ((Gaulois) lesBagarreursGaulois.get(j)).seBattre((SeBattre) lesBagarreursRomains.get(i));
                    }
                }
            }
            for (int i = lesBagarreursRomains.size() - 1; i >= 0; i--) {
                if (((Romains) lesBagarreursRomains.get(i)).getForceCombat() <= 0) {
                    lesBagarreursRomains.remove(i);
                }
            }
            System.out.println("\n" + lesBagarreursGaulois);
            System.out.println(lesBagarreursRomains);
        }
        System.out.println("\n \n" + lesBagarreursGaulois );
        System.out.println(lesBagarreursRomains);
    }
}
