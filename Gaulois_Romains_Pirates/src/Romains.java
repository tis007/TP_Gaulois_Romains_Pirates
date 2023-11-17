import java.util.Random;

public class Romains extends Humains implements SeBattre {
    private Grade grade;
    private int forceCombat;
    public Romains(int force, String nom, Grade grade){
        super(force, nom);
        this.grade = grade;

    }
    public Romains(String nom, Grade grade){
        this(Humains.getRdm().nextInt(6-1)+1, nom, grade);

    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public void seBattre(SeBattre h) {
        //TODO : Implementer
    }

    @Override
    public void setForceCombat(int forceDuCombat) {
        this.forceCombat = forceDuCombat;

    }

    @Override
    public int getForceCombat() {
        return forceCombat;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , grade: " + grade;
    }
}
