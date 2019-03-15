import java.util.Scanner;
/*
*가운데 글자 가져오기
* https://programmers.co.kr/learn/courses/30/lessons/12903
* */

public class MiddleStringPick {

    public static String solution(String s) {
        int len = s.length();
        int idx = len / 2;
        String answer = "";
        if(len % 2 == 0) {
            answer = String.valueOf(s.charAt(idx - 1)) + String.valueOf(s.charAt(idx));
        } else {
            answer = String.valueOf(s.charAt(idx));
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();
        System.out.println(solution(s));
    }
}
