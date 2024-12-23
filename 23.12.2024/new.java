import java.util.Scanner;
public class arr {
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        int score[] = new int[5];
        for(i=0;i<5;i++){
            score[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println(score[i]);
        }



    }
    
}
