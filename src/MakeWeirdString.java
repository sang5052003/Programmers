import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
* 이상한 문자 만들기
* https://programmers.co.kr/learn/courses/30/lessons/12930
* */

public class MakeWeirdString {

    public static String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s.split("");
        String curStr = "";
        boolean isOdd = true;
        for(int i = 0; i < strings.length; i++) {
            if(!strings[i].equals(" ")) {
                if(isOdd ) {
                    curStr = strings[i].toUpperCase();
                    isOdd = false;
                } else {
                    curStr = strings[i].toLowerCase();
                    isOdd = true;
                }
            } else {
                curStr = strings[i];
                isOdd = true;
            }
            stringBuilder.append(curStr);
        }
        return stringBuilder.toString();
    }

    public static String solution2(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();
        System.out.println(solution2(s));
    }

    // CoNnEcTeD To ThE TaRgEt Vm
}
