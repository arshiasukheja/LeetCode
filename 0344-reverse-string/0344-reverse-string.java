class Solution {

    public void reverse(char[] s , int l, int r){
         if (l>r) return ;
          
            char ch=s[l];
            s[l]=s[r];
            s[r]=ch;
            reverse ( s , ++l ,--r);
       
    }
        
    


    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
       
        reverse(s,l,r);     


    }
}
