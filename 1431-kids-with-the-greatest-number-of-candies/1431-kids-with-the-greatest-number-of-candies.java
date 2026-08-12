class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        // max element 
        int maxElem=0;
        for (int i=0; i<candies.length; i++){
            if (candies[i]>maxElem){
                maxElem=candies[i];
            }
        }


        for (int i=0 ; i<candies.length; i++){
            if (candies[i]+extraCandies >= maxElem){
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}