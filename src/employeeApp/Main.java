package employeeApp;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {
        Healthplan frontend = new Healthplan(1, "LOW", Plan.LOW);
        Healthplan backend = new Healthplan(2, "MID", Plan.MID);
        Healthplan fullstack = new Healthplan(3, "HIGH", Plan.HIGH);

        String[] healthplans = new String[5];
        healthplans[0] = frontend.getName();
        healthplans[1] = backend.getName();
        healthplans[2] = fullstack.getName();

        Employee emra = new Employee(12345, "Emra Catal", "emracatal@gmail.com", "Pass123", healthplans);
        emra.addHealthplan(3, "ADV");
        System.out.println(Arrays.toString(emra.getHealthplans()));

        System.out.println("*********************");
        Company workintech = new Company(1,"workintech",1000000,
                new String[] {"emra","ayse",null});
        workintech.addEmployee(1,"osman");
        workintech.addEmployee(2,"osman");
        System.out.println(Arrays.toString(workintech.getDeveloperNames()));}

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
