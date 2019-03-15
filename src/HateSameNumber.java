import java.util.*;
/*
*  같은 숫자는 싫어
*
* */
public class HateSameNumber {


    public static int[] solution(int[] arr) {

        List<Integer> integerList = new ArrayList<>();
        int cur = -1;
        int[] answer = {};
        for(int i = 0; i < arr.length; i++) {
            if(cur != arr[i]) {
                integerList.add(arr[i]);
            }
            cur = arr[i];
        }
        answer = integerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(solution(arr));
    }
}
