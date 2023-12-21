/*
Öğrenci Not Sistemi
 */
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "555");
        Teacher t2 = new Teacher(" Graham Bell", "FZK", "23525");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course bio = new Course("Biyoloji", "101", "BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih,fizik,bio);
        s1.addBulkExamNote(100,100,50,80,80,80);

        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih,fizik,bio);
        s2.addBulkExamNote(90,80,50,70,70,70);
        s2.isPass();


    }
}