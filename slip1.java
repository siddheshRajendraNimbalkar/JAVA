import java.util.*;

abstract class Staff{
    protected int id;
    protected String name;

    public Staff(int id,String name){
        this.id = id;
        this.name = name;
    }

    public abstract void display();
}

class OfficeStaff extends Staff{
    private String dep;

    public OfficeStaff(int id,String name,String dep){
        super(id, name);
        this.dep = dep;
    }

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dep);
    }
}

public class slip1 {
    public static void main(String[] args) {
        
        System.out.println("HELLO FROM MAIN");
        OfficeStaff[] obj = new OfficeStaff[2];
        for(int i = 0;i<2;i++){
            obj[i] = new OfficeStaff(2, "om", "cs");
        }
        for(int i = 0;i<2;i++){
            obj[i].display();
        }
    }
}
