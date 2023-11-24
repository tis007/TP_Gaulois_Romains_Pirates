public class Gaulois extends Humains implements SeBattre, Comparable<Gaulois> {
    private String metier;
    private int forceCombat;

    public Gaulois(int force, String nom, String metier) {
        super(force, nom);
        this.metier = metier;
        this.forceCombat = force;
    }

    public Gaulois(String nom, String metier) {
        this(1, nom, metier);
        if (nom.equals("Obelix")) {
            this.setForce(15);
        }
    }

    public String getMetier() {
        return metier;
    }

    public void boirePopo(int puissancePopo) {
        if (this.forceCombat <=5) {
            this.setForceCombat(this.getForce() + puissancePopo);
        }
    }

    @Override
    public void seBattre(SeBattre h) {
        h.setForceCombat(h.getForceCombat() + (this.getForceCombat() / 6));
    }

    @Override
    public String toString() {
        return super.toString() +
                " metier='" + metier;
    }

    public int getForceCombat() {
        return forceCombat;
    }

    public void setForceCombat(int forceCombat) {
        this.forceCombat = forceCombat;
    }


    @Override
    public int compareTo(Gaulois g) {
        if (!(this.getForce() == g.getForce())){
            return Integer.compare(this.getForce(), g.getForce());
        }
        if (!(this.getNom().compareTo(g.getNom()) == 0)) {
            return this.getNom().compareTo(g.getNom());
        }
        return this.getMetier().compareTo(g.getMetier());
    }
}
