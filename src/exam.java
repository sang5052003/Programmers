import java.util.Scanner;

public class exam {

    String[] arr = {"A", "B", "C", "D", "E"};
    String[] sel = new String[5];
    boolean[] visit = new boolean[5];
    int count = 0;

    public void perm(int n, int r, int k) {

        if(k == r) {
            count++;
            print_arr(sel);
            return;
        }

        for(int i = 0; i < n; i++) {
            if(visit[i] == true) continue;

            visit[i] = true;
            sel[k] = arr[i];
            perm(n, r, k + 1);
            visit[i] = false;
        }
    }

    public void perm2(int k, int n) {

        if(k == n) {
            count++;
            print_arr(sel);
            return;
        }

        for(int i = 0; i < n; i++) {
            sel[k] = arr[i];
            swap(0, i);
            perm2(k + 1, n);
            swap(0, i);
        }
    }

    private void swap(int n, int n1) {
        String temp = arr[n];
        arr[n] = arr[n1];
        arr[n1] = temp;
    }

    private void print_arr(String[] sel) {
        for(int i = 0; i < sel.length; i++) {
            if(sel[i] != null) System.out.print(sel[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        exam exam = new exam();
        /*exam.perm(3, 3, 0);
        System.out.println(exam.count);*/
        exam.perm2(0, 3);

    }
}
