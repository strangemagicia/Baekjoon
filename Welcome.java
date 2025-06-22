import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //참가자 수 N
        int Arr[] = new int[6]; //티셔츠 사이즈별 신청자의 수를 저장하기 위한 배열 만들기
        for (int i = 0; i < 6; i++) {
            Arr[i] = sc.nextInt(); //배열에 저장
        }
        int t = sc.nextInt(); //티셔츠 수 T
        int p = sc.nextInt(); //펜의 묶음 수 P
        int a = 0; //티셔츠 묶음 수 정답 a
        for (int i = 0; i < 6; i++) {
            a += Arr[i] / t; //각 티셔츠별 수를 T로 나눈 몪을 a에 더하기
            if (Arr[i] % t != 0) {
                a++; //나누어떨어지지 않을 때 a+1
            }
        }
        System.out.println(a);
        System.out.println((n/p) + " " +(n%p)); //p자루씩 최대 몇 묶음인지
    }
}
