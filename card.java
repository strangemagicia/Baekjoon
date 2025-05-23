import java.util.Queue;  //Queue class 사용
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i=1; i<N+1; i++) { //1 ~ N까지 q에 넣기
            q.offer(i);
        }
       while(q.size()>1) {
            q.remove();  //맨 처음 카드를 버리고
            int tmp = q.poll();  //그 다음 장을 버리고
            q.offer(tmp);  //맨 밑에 집어넣는다
            }
        System.out.println(q.peek());  //q 반환
    }
}
