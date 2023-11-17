import java.util.ArrayList;

public class Vaisseau extends RegroupementHumain{

    public Vaisseau(Humains chef) {
        super(chef);
    }

    @Override
    public ArrayList<Humains> justLesBagarreurs() {
        ArrayList<Humains> bagarreurs = new ArrayList<Humains>();
        for (Humains p : this.getLeRegroupement()) {
            if (!(((Pirates) p).getRang().equalsIgnoreCase("Capitaine"))) {
                bagarreurs.add(p);
            }
        }
        return bagarreurs;
    }


    @Override
    public String seRencontrer(Humains h1, Humains h2) {
        return "AOY, je suis " + h1.getNom() + "\n AOY" + h1.getNom() + ", moi c’est " + h2.getNom();
    }

}
