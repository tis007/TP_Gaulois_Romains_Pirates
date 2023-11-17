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
}
