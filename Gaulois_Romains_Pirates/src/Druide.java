public class Druide extends Gaulois{
    private int maxPuissance;
    private int minPuissance;

    public Druide(int force, String nom, String metier, int maxPuissance, int minPuissance) {
        super(force, nom, metier);
        this.maxPuissance = maxPuissance;
        this.minPuissance = minPuissance;
    }

}
