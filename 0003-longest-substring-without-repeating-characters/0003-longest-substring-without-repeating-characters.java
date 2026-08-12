class Solution {
    public int lengthOfLongestSubstring(String s) {
        int output=0;
        int l=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int r=0; r<s.length(); r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while (map.get(ch)>1){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }

            int temp=r-l+1;
            output=Math.max(temp,output);

        }

        return output;

    }
}