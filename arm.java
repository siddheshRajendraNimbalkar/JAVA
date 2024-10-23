import java.util.*;

class Prin{
    void Prin(String str){
        System.out.println(str);
    }
}

public class arm{

    void arm(int n){
        int temp = n;
        int a = 0;
        int sum = 0;
        while (n>=a) {
            a = n%10;
            n = n/10;
            sum += a*a*a;
        }
        sum += n*n*n;
        if(sum == temp){
            System.out.println("It is Armstrong Number");
        }else{
            System.out.println("It is not Armstrong Number");
        }
    }

    public static void main(String[] args){
        Prin prin = new Prin();
        prin.Prin("HELLO");
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        System.out.println("Your Enter Element is "+ele);
        arm armm = new arm();
        armm.arm(ele);
    }
}