import java.util.*;

/*
 *  K번째수
 *  https://programmers.co.kr/learn/courses/30/lessons/42748
 * */
public class KthNumer {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] row = {};
        int startIdx = 0, endIdx = 0, idx = 0;
        List<Integer> integerList = new ArrayList<>();
        for(int i = 0; i < commands.length; i++) {
            row = commands[i];
            startIdx = row[0];
            endIdx = row[1];
            idx = row[2];
            for(int j = startIdx - 1; j < endIdx; j++) {
                integerList.add(array[j]);
            }
            Collections.sort(integerList);
            answer[i] = integerList.get(idx - 1);
            integerList.clear();
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = new int[][] {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        System.out.println(solution(arr, arr2));
    }
}
