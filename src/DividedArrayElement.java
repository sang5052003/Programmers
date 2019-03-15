import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
* 나누어 떨어지는 숫자 배열
* https://programmers.co.kr/learn/courses/30/lessons/12910?language=java
 * */
public class DividedArrayElement {

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> integerList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                integerList.add(arr[i]);
            }
        }
        if(integerList.isEmpty()) return new int[] {-1};
        Collections.sort(integerList);
        answer = integerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static int[] solution2(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int checker = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                if(answer[i] < arr[i]) {
                    answer[i] = arr[i];
                } else {
                    for(int j = i - 1; j >= 0; j--) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

            } else {
                checker++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int arr[] = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(solution(arr, 5));
    }
}
