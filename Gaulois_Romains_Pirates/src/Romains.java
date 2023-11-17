import java.util.Random;

public class Romains extends Humains implements SeBattre {
    private Grade grade;
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
}
