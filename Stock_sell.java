package Array;

public class Stock_sell {
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int buyprice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                max = Math.max(max, profit);
            } else {
                buyprice = prices[i];
            }
        }
        System.out.println(max);
    }
}