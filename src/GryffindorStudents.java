import java.security.PublicKey;

public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudents(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery;
    }

    @Override
    public String facultyName() {
        return "гриффиндорец";
    }

    public void compareGryffindor(GryffindorStudents gryffindorStudents) {
        compare(gryffindorStudents);
    }
    public String toString() {
        return String.format(super.toString() + "; благородство: " + nobility + "; честь: " + honor + "; храбрость: " + bravery);
    }

}
