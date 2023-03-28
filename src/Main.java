public class Main {
    public static void main(String[] args) {
        GryffindorStudents harry = new GryffindorStudents("Гарри Поттер", 99, 40, 65, 78, 99);
        GryffindorStudents hermiona = new GryffindorStudents("Гермиона Грейнджер", 88, 56, 23, 46, 67);
        GryffindorStudents rohn = new GryffindorStudents("Рон Уизли", 33, 22, 46, 12, 56);
        SlyzerynStudents draco = new SlyzerynStudents("Драко Малфой", 55, 44, 44, 66, 55, 65, 23);
        SlyzerynStudents grakham = new SlyzerynStudents("Грэхэм Монтегю", 23, 32, 56, 23, 21, 31, 12);
        SlyzerynStudents greghory = new SlyzerynStudents("Грегори Гойл", 12, 14, 26, 17, 19, 24, 14);
        HufflepuffStudents zakharia = new HufflepuffStudents("Захария Смит", 14, 9, 14, 13, 25);
        HufflepuffStudents sedric = new HufflepuffStudents("Седрик Диггори", 56, 51, 46, 67, 82);
        RavenclawStudents chzhou = new RavenclawStudents("Чжоу Чанг", 34, 23, 45, 56, 67, 12);
        RavenclawStudents padme = new RavenclawStudents("Падма Патил", 32, 26, 37, 75, 68, 29);
        RavenclawStudents marcus = new RavenclawStudents("Маркус Белби", 12, 23, 28, 83, 72, 34);

        harry.print();
        rohn.print();
        hermiona.print();
        draco.print();
        grakham.print();
        greghory.print();
        zakharia.print();
        sedric.print();
        chzhou.print();
        padme.print();
        marcus.print();

        harry.compareHogwartsStudents(hermiona);
        System.out.println();
        rohn.compareHogwartsStudents(zakharia);
        System.out.println();
        draco.compareHogwartsStudents(sedric);
        System.out.println();
        harry.compareGryffindor(rohn);
        System.out.println();
        sedric.compareHufflepuff(zakharia);
    }
}