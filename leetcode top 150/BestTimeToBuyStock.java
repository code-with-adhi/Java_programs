public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int res = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length -1; i++ ){
            if (prices[i] < min ){
                min = prices[i];
            }
            else if(prices[i]>min){
                res = prices[i] - min;
            }
        }

        return res;

    }

}
