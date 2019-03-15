import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest {

    public static int big(int a, int b) {
        int n = 0;
        if(a > b) {
            n = 1;
        } else if(a < b) {
            n = -1;
        }
        return n;
    }

    public static int[] solution(int[] answers) {

        if(answers.length == 0) return new int[] {1, 2, 3};

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int scoreA = 0, scoreB = 0, scoreC = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == a[i % a.length]) scoreA++;
            if(answers[i] == b[i % b.length]) scoreB++;
            if(answers[i] == c[i % c.length]) scoreC++;
        }

        int[] temp = {scoreA, scoreB, scoreC};
        Arrays.sort(temp);
        int max = temp[2];
        int len = 0;
        for(int i = temp.length - 1; i >= 0; i--) {
            if(temp[i] == max) len++;
        }
        int[] answer = new int[len];
        for(int i = 0; i < answer.length; i++) {
            if(scoreA == max) {
                answer[i] = 1;
                scoreA = -1;
                continue;
            }

            if(scoreB == max) {
                answer[i] = 2;
                scoreB = -1;
                continue;
            }

            if(scoreC == max) {
                answer[i] = 3;
                scoreC = -1;
                continue;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(solution(arr));
    }

}
