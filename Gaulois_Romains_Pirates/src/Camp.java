import java.util.ArrayList;

public class Camp extends RegroupementHumain {

    public Camp(Humains chef) {
        super(chef);
    }



    @Override
    public String seRencontrer(Humains h1, Humains h2) {
        if (((Romains) h1).getGrade().compareTo(((Romains) h2).getGrade()) > 0) {
            return seSaluer((Romains) h1, (Romains) h2);
        } else if (((Romains) h1).getGrade().compareTo(((Romains) h2).getGrade()) < 0) {
            return seSaluer((Romains) h2, (Romains) h1);
        } else {
            return seSaluer((Romains) h2, (Romains) h1) + "\n" + seSaluer((Romains) h1, (Romains) h2);
        }

    }

    public String seSaluer(Romains r1, Romains r2) {
        return "Je te salue " + r1.getGrade()  + ", " + r1.getNom() + ", je suis " + r2.getNom();
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


    public void addRomain(Romains r) {
        if (!r.getGrade().equals(Grade.CHEF)){
            this.addHumain(r);
        } else {
            throw new IllegalArgumentException("Can't have 2 chef in a Camp");
        }
    }

}
