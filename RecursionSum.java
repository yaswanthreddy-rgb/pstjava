import java.util.Scanner;

public class RecursionSumofnumbers {
    static int Sumofnumbers(int n){
        if(n==0)
            return 0;
        return n+Sumofnumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int result=Sumofnumbers(n);
        System.out.println(result);
    }
}
