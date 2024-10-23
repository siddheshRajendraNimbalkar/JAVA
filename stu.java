import java.util.*;
class Student{
    String name;
    int rolno;
    Student(String name,int rolno){
        this.name = name;
        this.rolno = rolno;

        System.out.println(name+" "+rolno);
    }
}
public class stu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Students:");
        int n = sc.nextInt();

        Student student[] = new Student[n];
        sc.nextLine();
        for(int i = 0;i<n;i++){
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("RollNo: ");
            int rollno = sc.nextInt();
            sc.nextLine();
            student[i] = new Student(name, rollno);
        }
    }
}