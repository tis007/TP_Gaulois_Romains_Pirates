public class Gaulois extends Humains implements SeBattre{
private String metier;
    public Gaulois(int force, String nom, String metier) {
        super(force, nom);
        this.metier = metier;
    }

    public String getMetier() {
        return metier;
    }
}
