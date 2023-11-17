public class Romains extends Humains implements SeBattre {
    private Grade grade;
    public Romains(int force, String nom, Grade grade){
        super(force, nom);
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }
}
