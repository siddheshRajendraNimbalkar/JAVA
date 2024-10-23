public class primary{
    public static void main(String[] args) {
        int[] a ={1,3,9,4,19,-1};
        System.out.println(" PRIMARY CODE RUNING");
        for(int i = 0;i<a.length;i++){
            int count = 0;
            if(a[i] < 0){
                System.out.println(a[i]+" NUMBER MUST BE POSITIVE");
            }else{
                for(int j = 1;j<=a[i];j++){
                    if(a[i]%j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.println(a[i]+" at position "+i+" is primary number");
                }
            }
        }
    }
}