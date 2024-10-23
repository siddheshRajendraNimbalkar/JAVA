import java.util.*;

class CricketPlayer{
    String name;
    int NOI;
    int NN;
    int TR;
    double BA;

    public CricketPlayer(String name,int NOI,int NN,int TR){
        this.name = name;
        this.NOI=NOI;
        this.NN = NN;
        this.TR = TR;
        this.BA = CricketPlayer.avg(NOI,NN,TR);
    }

    public static double avg(int NOI,int NN,int TR){
        int noOut = NOI - NN; 
        return noOut == 0 ? TR : TR/noOut;
    }

    public static void sort(CricketPlayer[] player,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(player[j].BA > player[j+1].BA){
                    CricketPlayer temp = player[j];
                    player[j] = player[j+1];
                    player[j+1] = temp;
                }
            }
        }
    }

    public void display(){
        System.out.println("Name "+name+" No. of Innings "+NOI+" NOT OUT "+NN+" TOTAL RUN "+TR+" BATING AVG "+BA);
    }

}

public class slip2 {
    
    public static void main(String[] args) {
        
        System.out.println("SLIP-2 QUESTION 2");
        System.out.println("Enter the NUMBER of Player's");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CricketPlayer[] player = new CricketPlayer[n];

        for(int i=0;i<n;i++){
            System.out.println("ENTER THE DETAIL OF "+(i+1)+" PLAYER");
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("No. of Innings: ");
            int NOI = sc.nextInt();
            System.out.println("No. of Time not out: ");
            int NN = sc.nextInt();
            System.out.println("No. of Total Run: ");
            int TR = sc.nextInt();
            player[i] = new CricketPlayer(name, NOI, NN, TR);
        }

        CricketPlayer.sort(player,n);
        System.out.println("DISPLAY STAFF:::");
        for(int i = 0;i<n;i++){
            player[i].display();
        }
        
    }
    
}
