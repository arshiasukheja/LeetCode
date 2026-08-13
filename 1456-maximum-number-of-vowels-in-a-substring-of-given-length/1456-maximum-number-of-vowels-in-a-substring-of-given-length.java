class Solution {

    boolean isVowel(char c){
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int l=0;
        int count=0;

        for (int r=0; r<k; r++){
            char ch=s.charAt(r);
            if (isVowel(ch)){
                count++;
            }
        }

    int maxCount=count;


        for (int r=k; r<s.length(); r++){
            if (isVowel(s.charAt(r))) count++;
            if (isVowel(s.charAt(l))) count--;
            l++;
            maxCount=Math.max(maxCount,count);
        }

return maxCount;
    }
}