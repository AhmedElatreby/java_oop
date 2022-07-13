public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jon", 24, 25000.0, "London");
        Employee e2 = new Employee("Mark", 50, 50000.0, "London");

        e2.salaryRaise();

        System.out.println("Employee 2 has salary raised: " + e2.salary);
        System.out.println("Employee 1 did not have salary raised: " + e1.salary);

        e1.setName("Ahmed");
        e1.setAge(41);
        e1.setSalary(41000.0);
        e1.setLocation("London");

        System.out.println("Employee name " +e1.getName());
        System.out.println("Employee age " +e1.getAge());
        System.out.println("Employee salary " + e1.getSalary());
        System.out.println("Employee location " + e1.getLocation());
    }
}


