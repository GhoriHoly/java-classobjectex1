public class Employee {
    private String name;

    public int age;
    private int salary;
    private Address address;

    public Employee(){
        this.name  = "No name";
        this.salary = 100;
        this.age = 39;
    }

    public Employee(String name, int salary){
        this.name = name;
        this.salary= salary;
    }

    public Employee(String name, int salary,int age, Address address){
        this.name = name;
        this.salary= salary;
        this.age = age;
        this.address = address;
    }


    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setName(String name){
        if(!name.equals("")){
           this.name = name;
        }
    }

    public String getName(){
        return this.name;
    }
    public void greeting(){
        if(this.address!=null){
            System.out.println("Hej, jag bor på " + this.address.getCity());
        }else{
            System.out.println("I have no home");

        }
    }

    public String toString(){
        return "name: " + name + " Salary: " + salary + " Age: " + age+ " " + address;
    }

}
