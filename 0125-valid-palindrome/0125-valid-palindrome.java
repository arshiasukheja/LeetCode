class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb= new StringBuilder();
        
        for (char ch : s.toCharArray()){
            if (Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        s=sb.toString(); 
        int l=0;
        int r=s.length()-1;

       while (l<=r){
    
        if (s.charAt(l)!=s.charAt(r)){
            return false;
        }
            l++;
            r--;
       }
       
     return true;  
    }
}