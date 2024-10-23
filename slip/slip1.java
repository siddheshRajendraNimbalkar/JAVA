import java.util.*;

abstract class Staff{
    protected int id;
    protected String name;

    public Staff(String name,int id){
        this.name = name;
        this.id = id;
    }
    public abstract void display();
}

class OfficeStaff extends Staff{
    String dept;
    public OfficeStaff(String dept,String name,int id){
        super(name,id);
        this.dept=dept;
    }
    public void display(){
        System.out.println("ID: "+id+" NAME: "+name+" DEPERTMENT "+dept);
    }
}

public class slip1 {
    public static void main(String[] args) {
        System.out.println("SLIP-1 QUESTION 2");
        System.out.println("Enter the NUMBER of Staff Want to Enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OfficeStaff[] os = new OfficeStaff[n];
        for(int i=0;i<n;i++){
            System.out.println("ENTER THE DETAIL OF "+(i+1)+" EMPLOY");
            System.out.println("EHTER EMPLOYEE OF ID");
            int id = sc.nextInt();
            System.out.println("EHTER NAME of EMPLOYEE");
            String name = sc.next();
            System.out.println("EHTER DEPARTMENT NAME");
            String dep = sc.next();
            os[i] = new OfficeStaff(dep, name, id);
        }
        System.out.println("DISPLAY STAFF:::");
        for(int i = 0;i<n;i++){
            os[i].display();
        }
    } 
}
