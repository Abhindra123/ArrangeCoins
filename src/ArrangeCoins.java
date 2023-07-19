import java.util.Scanner;

public class ArrangeCoins {
    public static int arrangeCoins(int num){
        int row=1;
        int count=0;
        while(num>row){
            num=num-row;
            row++;
            count=count+1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int val=arrangeCoins(num);
        System.out.println("The value is  "+val);
    }
}