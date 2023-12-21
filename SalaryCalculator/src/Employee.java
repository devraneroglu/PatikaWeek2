import java.time.LocalDate;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int currentYear;
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        LocalDate currentDate = LocalDate.now();
        this.currentYear = currentDate.getYear();
    }

    double tax() {                  //Eğer maaş 1000'den büyükse, maaşın %3'ü kadar vergi uygulanır.
        if (salary > 1000.0) {
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    double bonus() {                         // Eğer haftalık çalışma saati 40'tan fazlaysa, fazla çalışma saatleri üzerinden bonus hesaplanır.
        if (workHours > 40) {
            return (workHours - 40) * 30.0;
        } else {
            return 0.0; // Bonus yok
        }
    }

    double raiseSalary() {                                   //Çalışanın işe alındığı yıla bağlı olarak farklı oranlarda maaş artışı uygulanır.
        if ((this.currentYear - this.hireYear) > 19) {
            return this.salary * 0.15;
        } else if ((this.currentYear - this.hireYear) > 9 && (this.currentYear - this.hireYear) < 20) {
            return this.salary * 0.1;
        } else if ((this.currentYear - this.hireYear) < 10) {
            return this.salary * 0.05;
        } else {
            return this.salary;
        }
    }

    public String toString() {                                         //Çalışanın adı, maaşı, çalışma saati, vergi, bonus, maaş artışı ve toplam maaşı içeren bir metin döndürür.
        double totalSalary = salary - tax() + bonus() + raiseSalary();
        return "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma saati : " + workHours +
                "\nBaşlangıç yıl : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (totalSalary - raiseSalary()) +
                "\nToplam Maaş : " + totalSalary;

    }

}
