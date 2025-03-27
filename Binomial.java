import java.util.Scanner;

public class Main {
    public static int Fact(int n) {  //재귀함수(팩토리얼)
        if (n <= 1) {
             return 1;
        }    
        else {
             return n * Fact(n-1);
        }
      }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int res = 0;
        
        res = Fact(N)/(Fact(K)*Fact(N-K));  //n!/n!(n-r)! 공식
        
        System.out.println(res);
    }
}
