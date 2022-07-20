package recursion;

public class Problem82612 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long result = solution(price, money, count);

        System.out.println(result);


    }

    public static long solution(int price, int money, int count) {

        long totalValue = countSum(price, count);

        long answer = totalValue - money;

        return answer > 0 ? answer : 0;
    }
    public static long countSum(int price, int count) {
        return count == 1 ? price : price * count + countSum(price, count - 1);
    }

}
