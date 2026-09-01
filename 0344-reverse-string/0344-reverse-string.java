class Solution {

    public void swapChar(char[] s , int i, int j){
        if (i>=j) return;
         char ch=s[i];
            s[i]=s[j];
            s[j]=ch;
         swapChar(s,++i,--j);

    }

    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
       
        swapChar(s,i,j);

      

    }
}