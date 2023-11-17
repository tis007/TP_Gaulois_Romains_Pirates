import java.util.Random;

public abstract class Humains {
    private int force;
    private String nom;




    public Humains(int force, String nom) {
        this.force = force;
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public String getNom() {
        return nom;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public static Random getRdm() {
        return new Random();
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " : force: " + force +
                ", nom: " + nom ;
    }
}
