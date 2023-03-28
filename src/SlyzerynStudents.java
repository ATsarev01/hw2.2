public class SlyzerynStudents extends HogwartsStudents {
    private int curring;
    private int determination;
    private int ambitions;
    private int ingenuity;
    private int thirstForPower;

    public SlyzerynStudents(String name, int magic, int transgression,
                            int curring, int determination, int ambitions, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.curring = curring;
        this.determination = determination;
        this.ambitions = ambitions;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCurring() {
        return curring;
    }

    public void setCurring(int curring) {
        this.curring = curring;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int ability() {
        return curring + ingenuity + thirstForPower + determination + ambitions;
    }

    @Override
    public String facultyName() {
        return "слизеринец";
    }

    public void compareSlyzeryne(SlyzerynStudents slyzerynStudents ) {
        compare(slyzerynStudents);
    }

    public String toString() {
        return String.format(super.toString() + "; хитрость: " + curring + "; решительность: " + determination + "; находчивость: " + ingenuity + "; амбициозность: " + ambitions + "; жажда власти: " + thirstForPower);
    }

}
