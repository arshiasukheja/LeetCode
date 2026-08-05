class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        if (x==0) return true;
        int num=x; 
        int reversed=0;
   
        while (x>0){
            int lastDigit=x%10;
            reversed=reversed*10+lastDigit;
              x=x/10;
            
        }

        if (reversed==num){
            return true;
        } else {
            return false;
        }
        

    }
}