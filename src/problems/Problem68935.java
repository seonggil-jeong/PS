package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem68935 {
    public static void main(String[] args) {
        int n = 45;
        int answer = solution(n);

        System.out.println(answer);

    }


    public static int solution(int n) {
            String a = "";

            while(n > 0){
                a = (n % 3) + a;
                n /= 3;
            }
            a = new StringBuilder(a).reverse().toString();

            return Integer.parseInt(a,3);

    }
}
