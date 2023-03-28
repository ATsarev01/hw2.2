public abstract class HogwartsStudents {
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudents(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    private int baseAbility() {
        return magic + transgression;

    }

    public abstract int ability();

    public abstract String facultyName();

    public void compareHogwartsStudents(HogwartsStudents hogwartsStudents) {
        int ability1 = baseAbility();
        int ability2 = hogwartsStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент " + getName() + " обладает бОльшей силой магии, чем студент "
                    + hogwartsStudents.getName() + " (" + ability1 + ":" + ability2 + ")");
        } else if (ability2 > ability1) {
            System.out.printf("Студент " + hogwartsStudents.getName() + " обладает бОльшей силой магии, чем студент "
                    + getName() + " (" + ability2 + ":" + ability1 + ")");
        }else {
            System.out.printf("Студент " + hogwartsStudents.getName() + " такой же по силе магии, как и студент "
                    + getName() + " (" + ability2 + ":" + ability1 + ")");

        }
    }

    protected void compare(HogwartsStudents hogwartsStudents) {
        int ability1 = ability();
        int ability2 = hogwartsStudents.ability();
        if (ability1 > ability2) {
            System.out.print(facultyName()+ " " + getName() + " лучше, чем " + facultyName() + " "
                    + hogwartsStudents.getName() + " (" + ability1 + ":" + ability2 + ")");
        } else if (ability2 > ability1) {
            System.out.print(facultyName() + " " + hogwartsStudents.getName() + " лучше, чем " + facultyName() + " "
                    + getName() + " (" + ability2 + ":" + ability1 + ")");
        } else {
            System.out.print(facultyName()+ " " + hogwartsStudents.getName() + " такой же, как и " + facultyName() + " "
                    + getName() + " (" + ability2 + ":" + ability1 + ")");

        }
    }

    public String toString() {
        return String.format("Студент " + name + "; сила магии: " + magic + "; сила трансгрессии: " + transgression);
    }

    public void print() {
        System.out.println(toString());
    }
}
