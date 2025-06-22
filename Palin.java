import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 

        while(sc.hasNext()) { //입력이 있는 동안
            String str = sc.nextLine();
            boolean chk = true; //체크하기 위한 boolean chk
            if (str.equals("0")) { //만약 str이 0이면 탈출
                break;
            }
            else {
                for(int i = 0; i < str.length()/2; i++) {
                    if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                        chk = false;
                    }
                }
                if(chk) {
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }
        }
    }
}
