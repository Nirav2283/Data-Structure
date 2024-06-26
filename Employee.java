import java.util.*;
class Employee_Detail{
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;

    public void Employee_Detail(int Employee_ID , String Name , String Designation , double salary){
        this.Employee_ID = Employee_ID;
        this.Name = Name;
        this.Designation = Designation;
        this.Salary = salary;
    }

    public void printDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
         this.Employee_ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of employee: ");
         this.Name = sc.nextLine();
        System.out.println("Enter a designation: ");
        this.Designation = sc.nextLine();
        System.out.println("enter the salary: ");
        this.Salary = sc.nextDouble();

        System.out.println("ID is: "+this.Employee_ID);
        System.out.println("Name is: "+this.Name);
        System.out.println("Designation is: "+this.Designation);
        System.out.println("Salary of the Employee is: "+this.Salary);
    }

}
public class Employee {
    public static void main(String[] args) {
        
        

        Employee_Detail e = new Employee_Detail();
        e.printDetail();

    }
}
