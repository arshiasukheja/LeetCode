class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet <Integer> setA=  new HashSet<>();
        HashSet <Integer> setB=  new HashSet<>();

        for (int i=0; i<nums1.length; i++){
            setA.add(nums1[i]);
        }
        for (int i=0; i<nums2.length; i++){
            setB.add(nums2[i]);
        }

        List<Integer> listA=new ArrayList<>();
        List<Integer> listB=new ArrayList<>();


        for (int num: setB){
            if (!setA.contains(num)){
                listA.add(num);
            }
        }
        for (int num: setA){
            if (!setB.contains(num)){
                listB.add(num);
            }
        }
        
        List<List<Integer>>result=new ArrayList<>();
        result.add(listB);
        result.add(listA);
  
        return result;

    }
}