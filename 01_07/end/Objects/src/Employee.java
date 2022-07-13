public class Employee {
    public Employee e1;
    String name;
    int age;
    double salary;
    String location;

    Employee(String name, int age, double salary, String location){
        this.name = name;
        this. age = age;
        this. salary = salary;
        this. location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void salaryRaise(){
        this.salary = this.salary * 1.2;
    }
}
