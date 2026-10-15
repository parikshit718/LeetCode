class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount<5) return 100;
 if(purchaseAmount>=5 && purchaseAmount<=10) return 90;
 else return 100-((purchaseAmount+5)/10)*10;       
    }
}