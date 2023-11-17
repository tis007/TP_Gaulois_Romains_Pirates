import java.util.ArrayList;

public class Camp extends RegroupementHumain {

    public Camp(Humains chef) {
        super(chef);
    }



    @Override
    public String seRencontrer(Humains h1, Humains h2) {
        return null;
        //TODO : TO IMPLEMENT
    }

    public ArrayList<Humains> justLesBagarreurs() {
        ArrayList<Humains> bagarreurs = new ArrayList<Humains>();
        for (Humains r : this.getLeRegroupement()) {
            if (!((Romains) r).getGrade().equals(Grade.CHEF)) {
                bagarreurs.add(r);
            }
        }
        return bagarreurs;
    }


    public void addGaulois(Romains r) {
        if (!r.getGrade().equals(Grade.CHEF)){
            this.addHumain(r);
        } else {
            throw new IllegalArgumentException("Can't have 2 chef in a Camp");
        }
    }

}
