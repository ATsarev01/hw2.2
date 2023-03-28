public class RavenclawStudents extends HogwartsStudents{
    private int cleverness;
    private int wisdom;
    private int wit;
    private  int creativity;

    public RavenclawStudents(String name, int magic, int transgression,
                             int cleverness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int ability() {
        return wisdom + wit + creativity + cleverness;
    }

    @Override
    public String facultyName() {
        return "когтевранец";
    }
    public void compareRavenclaw(RavenclawStudents ravenclawStudents) {
        compare(ravenclawStudents);
    }
    public String toString() {
        return String.format(super.toString() + "; ум: " + cleverness + "; мудрость: " + wisdom + "; остроумие: " + wit + "; остроумие: " + creativity);
    }
}
