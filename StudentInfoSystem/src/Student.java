public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stdNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stdNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3 , int oralnote1, int oralnote2, int oralnote3) {
        if (note1 >= 0 && note1 <= 100 && oralnote1>=0 && oralnote1<=100) {
            c1.note = (int) ((note1 * 0.8) + (oralnote1 * 0.2));
        }
        if (note2 >= 0 && note2 <= 100 && oralnote2>=0 && oralnote1<=100) {
            c2.note = (int) ((note2 * 0.8) + (oralnote2 * 0.2));
        }
        if (note3 >= 0 && note3 <= 100 && oralnote3>=0 && oralnote3<=100 ) {
            c3.note = (int) ((note3 * 0.8) + (oralnote3 * 0.2));
        }
        printNote();
    }



    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        System.out.println("Ortalamanaız : " + this.avarage);
        if (this.avarage > 55) {
            System.out.println("Sınıfı geçtiniz tebrikler");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println("---------------------");
        System.out.println(c1.name + " notu : " + c1.note);
        System.out.println(c2.name + " notu : " + c2.note);
        System.out.println(c3.name + " notu : " + c3.note);
    }

}
