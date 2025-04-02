import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Angela", "angelaruiz@example.com", 32, 50000);
        Employee employee2 = new Employee("Joaquin", "jojo@example.com", 29, 50000);
        Intern employee3 = new Intern("Jose", "jpaez@example.com", 31, 30000);
        Employee employee4 = new Employee("María", "mlopez@example.com", 37, 25000);
        Employee employee5 = new Employee("Ana", "email@example.com", 19, 80000);
        Intern employee6 = new Intern("Gabriel", "email@example.com", 25, 17000);
        Employee employee7 = new Employee("Guillermo", "email@example.com", 50, 90000);
        Employee employee8 = new Employee("Sergio", "emailo@example.com", 33, 85000);
        Employee employee9 = new Employee("Antonio", "email@example.com", 37, 35000);
        Employee employee10 = new Employee("Juan", "email@example.com", 27, 22000);


        try {
            FileWriter employeesData = new FileWriter("employees.txt");
            employeesData.write("Empleado 1: nombre " + employee1.getName() + ", email " + employee1.getEmail() + ", edad " + employee1.getAge() + ", salario " + employee1.getSalary()+"\n");
            employeesData.write("Empleado 2: nombre " + employee2.getName() + ", email " + employee2.getEmail() + ", edad " + employee2.getAge() + ", salario " + employee2.getSalary()+"\n");
            employeesData.write("Empleado 3: nombre " + employee3.getName() + ", email " + employee3.getEmail() + ", edad " + employee3.getAge() + ", salario " + employee3.getSalary()+"\n");
            employeesData.write("Empleado 4: nombre " + employee4.getName() + ", email " + employee4.getEmail() + ", edad " + employee4.getAge() + ", salario " + employee4.getSalary()+"\n");
            employeesData.write("Empleado 5: nombre " + employee5.getName() + ", email " + employee5.getEmail() + ", edad " + employee5.getAge() + ", salario " + employee5.getSalary()+"\n");
            employeesData.write("Empleado 6: nombre " + employee6.getName() + ", email " + employee6.getEmail() + ", edad " + employee6.getAge() + ", salario " + employee6.getSalary()+"\n");
            employeesData.write("Empleado 7: nombre " + employee7.getName() + ", email " + employee7.getEmail() + ", edad " + employee7.getAge() + ", salario " + employee7.getSalary()+"\n");
            employeesData.write("Empleado 8: nombre " + employee8.getName() + ", email " + employee8.getEmail() + ", edad " + employee8.getAge() + ", salario " + employee8.getSalary()+"\n");
            employeesData.write("Empleado 9: nombre " + employee9.getName() + ", email " + employee9.getEmail() + ", edad " + employee9.getAge() + ", salario " + employee9.getSalary()+"\n");
            employeesData.write("Empleado 10: nombre " + employee10.getName() + ", email " + employee10.getEmail() + ", edad " + employee10.getAge() + ", salario " + employee10.getSalary()+"\n");

            employeesData.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException error) {
            System.out.println("An error occurred.");
        }


       /* System.out.println("Empleado 1: nombre " + employee1.getName() + ", email " + employee1.getEmail() + ", edad " + employee1.getAge() + ", salario " + employee1.getSalary());
        System.out.println("Empleado 2: nombre " + employee2.getName() + ", email " + employee2.getEmail() + ", edad " + employee2.getAge() + ", salario " + employee2.getSalary());
        System.out.println("Empleado 6: nombre " + employee6.getName() + ", email " + employee6.getEmail() + ", edad " + employee6.getAge() + ", salario " + employee6.getSalary()); */

    }
}
