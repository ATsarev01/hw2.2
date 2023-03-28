public class HufflepuffStudents extends HogwartsStudents{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return diligence + honesty + loyalty;
    }

    @Override
    public String facultyName() {
        return "пуффендуец";
    }
    public void compareHufflepuff(HufflepuffStudents hufflepuffStudents) {
        compare(hufflepuffStudents);
    }
    public String toString() {
        return String.format(super.toString() + "; трудолюбивость: " + diligence + "; верность: " + loyalty + "; честность: " + honesty);
    }
}
