import java.util.Scanner;
class Student_Detail{
    int Enrollment_no;
    String name;
    int sem;
    double cpi;

    public void Student_Detail(int Enrollment_no , String name , int sem , double cpi){
        this.Enrollment_no = Enrollment_no;
        this.name = name;
        this.sem = sem;
        this.cpi = cpi;

    }
    public void printStudentDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the student: ");
         this.Enrollment_no = sc.nextInt();
        System.out.println("Enter name of student: ");
         this.name = sc.nextLine();
        System.out.println("Enter the sem: ");
        this.sem = sc.nextInt();
        System.out.println("enter the cpi: ");
        this.cpi = sc.nextDouble();

    }

}
public class Student {
    public static void main(String [] args){
        Student_Detail[] s = new Student_Detail[5];
        for(int i = 0 ; i < 5 ; i++){
            s[i] = new Student_Detail();
            s[i].printStudentDetail();
        }

    }
}
