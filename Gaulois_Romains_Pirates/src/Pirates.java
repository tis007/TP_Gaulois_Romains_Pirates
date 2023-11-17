public class Pirates extends Humains implements SeBattre{
    private String rang;
    private int forceCombat;
    private int niveauEbriete;
    public Pirates(int force, String nom, String rang) {
        super(force, nom);
        this.rang = rang;
        this.forceCombat = force;
        this.niveauEbriete = 0;
    }

    public String getRang() {
        return rang;
    }

    @Override
    public void seBattre(SeBattre h) {

    }

    @Override
    public void setForceCombat(int forceDuCombat) {

    }

    @Override
    public int getForceCombat() {
        return forceCombat;
    }

    public void setNiveauEbriete(int niveauEbriete) {
        this.niveauEbriete = niveauEbriete;
    }

    public void boire(int puissanceRhum){
        this.setNiveauEbriete(niveauEbriete + puissanceRhum);
    }
}
