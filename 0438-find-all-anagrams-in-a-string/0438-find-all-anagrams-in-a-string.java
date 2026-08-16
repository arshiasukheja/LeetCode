class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result= new ArrayList<>();
        
        HashMap<Character,Integer>anagram=new HashMap<>();
        for (char ch:p.toCharArray()){
             anagram.put(ch, anagram.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character,Integer>map=new HashMap<>();
        int l=0;
        for (int r=0;r<s.length(); r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            if (r-l+1 > p.length()){
                 map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                 if (map.get(s.charAt(l))==0){
                     map.remove(s.charAt(l)); 
                 }
                l++;
            }

            if (r-l+1==p.length()){
                if (anagram.equals(map)){
                    result.add(l);
                }
            }
        }


            
        
return result;
    }
}