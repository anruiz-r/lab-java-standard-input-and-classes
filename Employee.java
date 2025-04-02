public class Employee {
    private String name;
    private String email;
    private int age;
    private int salary;

    public Employee(String name, String email, int age, int salary) {
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Intern extends Employee {

    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, salary);
        setSalaryLimit(salary);
    }

    public void setSalaryLimit(int salary) {
        if (salary > 20000) {
            super.setSalary(20000);
            System.out.println("Lo siento becario, no puedes cobrar tanta pasta todavía. Salario de "+ this.getName() +" ajustado al limite.");
        } else {
            super.setSalary(salary);
        }

    }
}
