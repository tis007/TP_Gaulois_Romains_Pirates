import java.util.ArrayList;
import java.util.Random;

public class Druide extends Gaulois {
    private int maxPuissance;
    private int minPuissance;

    public Druide(int force, String nom, String metier, int maxPuissance, int minPuissance) {
        super(force, nom, metier);
        this.maxPuissance = maxPuissance;
        this.minPuissance = minPuissance;

    }

    public void distributionPopo(Village v) {
        Random rdm = new Random();
        int puissancePopo = rdm.nextInt(maxPuissance + 1 - minPuissance) + minPuissance;

        for (Humains g : v.justLesBagarreurs()) {
            if (this.getForce() <= 5 && !this.getMetier().equals("CHEF")&& !(g instanceof Druide)) {
                ((Gaulois) g).boirePopo(puissancePopo);
            }
        }


    }

    @Override
    public String toString() {
        return super.toString() +
                " maxPuissance=" + maxPuissance +
                ", minPuissance=" + minPuissance ;
    }
}
