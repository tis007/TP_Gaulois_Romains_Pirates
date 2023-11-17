import java.util.ArrayList;
import java.util.Arrays;

public class Village extends RegroupementHumain {

    public Village(Humains chef) {
        super(chef);
        addGaulois((Gaulois) chef);
    }

    @Override
    public String seRencontrer(Humains h1, Humains h2) {
        return "Bonjour, je suis " + h1.getNom() + "\n Bonjour " + h1.getNom() + ", moi c’est " + h2.getNom();
    }

    @Override
    public ArrayList<Humains> justLesBagarreurs() {
        ArrayList<Humains> bagarreurs = new ArrayList<Humains>();
        for (Humains g : this.getLeRegroupement()) {
            if (!(((Gaulois) g).getMetier().equalsIgnoreCase("Chef") || ((Gaulois) g) instanceof Druide)) {
                bagarreurs.add(g);
            }
        }
        return bagarreurs;
    }

    public void distributionPotion() {
        for (Humains h : this.getLeRegroupement()){
            if (h instanceof Druide) {
                ((Druide) h ).distributionPopo(this);
            }
        }
    }

    public void addGaulois(Gaulois g) {
        if (!g.getMetier().equalsIgnoreCase("CHEF")) {
            this.addHumain(g);
        } else {
            throw new IllegalArgumentException("Can't have 2 chef in a Village");
        }
    }


}
