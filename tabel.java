public class tabel {
    public static void main(String[] args){
        int i = 1;
        while (i <= 15) {
            System.out.println("Tabel Of "+i);
            for(int j=1;j<11;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
            System.out.println();
            i++;
        }
    }
}
