package PlayGround;
import java.util.*;

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id,String name,double salary){

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void print(){
        System.out.println(id+" "+name+" "+salary);
    }

}

class Sorting implements Comparator<Employee>{

    public int compare(Employee x,Employee y){

        if(x.getSalary()==y.getSalary()){
            return x.getName().compareTo(y.getName());
        }

        return Double.compare(y.getSalary(),x.getSalary());
    }
}

public class EmployeeSort {
    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0;i<n;i++){

            int id = scan.nextInt();
            String name = scan.next();
            double salary = scan.nextDouble();
            Employee emp = new Employee(id,name,salary);

            employee.add(emp);
        }

        Comparator<Employee> comp = new Sorting();
        employee.sort(comp);

        for(Employee emp:employee){

            emp.print();
        }


    }
}
