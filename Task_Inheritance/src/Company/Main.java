package Company;

public class Main {
    public static void main(String[] args) {

        Employee sarah = new Employee("Sarah", "Cyber risk", 3500);

        Manager jaber = new Manager("Jaber", "Accounting", 10000, 20);

        Intern dhari = new Intern("Dhari", "Digital innovation", 250, "Aum");

        SalesPerson abdulaziz = new SalesPerson("Abdulaziz AlDuhayem", "Branches", 2000, 10000);

        Director jassim = new Director("Jassim", "IT Service Desk", 15000, 30000);

        Engineer mohad = new Engineer("Mohammed", "Cyber security", 1500, "Pen testing",
                new String[] { "Web development", "CEH", "Security +" });



        System.out.println(sarah);

        System.out.println(jaber);

        System.out.println(dhari);

        System.out.println(abdulaziz);

        System.out.println(jassim);

        System.out.println(mohad);
    }
}