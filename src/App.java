import java.util.ArrayList;

public class App {
    ArrayList<Employee> employees = new ArrayList<>();
    public void run(){

        initApp();
        printEmployees();
        employees.get(0).greeting();
        employees.get(2).greeting();

    }

    public void initApp(){
        Address a1 = new Address("Gatan", "435","Staden");
        Address a2 = new Address("Gatan2", "43566","Staden2");


        Employee e1 = new Employee();
        e1.setSalary(1000);
        e1.setName("Holy");


        System.out.println("Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSalary());
        System.out.println("Age: "+e1.age); // Age coming from constructor


        Employee e2 = new Employee("Bill", 100000, 23, a1); // Second Constructor in action
        Employee e3 = new Employee("Tanvir", 100000, 45, a2); // Second Constructor in action
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());

        Employee e4 = new Employee();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
    }

    public void printEMployee2(){
        //Same as printEmployees() function below
        employees.forEach(e-> System.out.println(e));
    }
    public void printEmployees(){
        for (Employee kanellbulle : employees){
            System.out.println(" " + kanellbulle);

        }
    }
}
