class Solution {

    public void backtrack(int[] nums, List<List<Integer>>result, List<Integer> current, int index){
        if (current.size()==nums.length){
            result.add(new ArrayList<Integer>(current));
            return;
        }

        for (int i=index; i<nums.length; i++){
            if (current.contains(nums[i])){
                       continue;
            }
            current.add(nums[i]);
            backtrack(nums, result, current, index);
            current.remove(current.size()-1);
        }
    }




    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int index=0;

        backtrack (nums, result,current, index);
        return result ;
    }
}