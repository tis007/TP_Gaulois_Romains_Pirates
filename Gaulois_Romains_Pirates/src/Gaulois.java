public class Gaulois extends Humains implements SeBattre{
private String metier;
    public Gaulois(int force, String nom, String metier) {
        super(force, nom);
        this.metier = metier;
    }
public Gaulois(String nom, String metier){
        this(1, nom, metier);
        if(nom.equals("Obelix")){
            this.setForce(15);
        }
}
    public String getMetier() {
        return metier;
    }

    public void boirePopo(int puissancePopo){
        this.setForce(this.getForce()+puissancePopo);
    }

    @Override
    public void seBattre(SeBattre h) {
        //TODO : Implementer
    }

    @Override
    public String toString() {
        return super.toString() +
                " metier='" + metier ;
    }
}
