import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int score[] = new int[N];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        float re[] = new float[N];
        for (int i =0; i <score.length; i++) {
            re[i] = (float)score[i]/max*100;
        }
        float count  = 0;
        for (int i =0; i < score.length; i++) {
            count += re[i];
        }
        System.out.println((float)(count/N));
    }
}
