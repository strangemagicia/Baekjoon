import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[105];
        int ans = -1;
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        //brute force
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                  //복잡도 O(n^3)
                    if (i == j || j == k || k == i) {
                        continue;
                    }
                    
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= M) {
                        ans = Math.max(ans, sum);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
