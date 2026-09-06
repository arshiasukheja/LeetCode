class Solution {

    public void backtrack(int[] nums , int i, List<List<Integer>> result , List<Integer> current){

        if (i==nums.length){
            result.add(new ArrayList<Integer>(current));
            return;
        }

        current.add(nums[i]);
        backtrack(nums, i+1, result,current);

        current.remove(current.size()-1);
        while (i+1 < nums.length && nums[i]==nums[i+1]){
            i++;
        }
        backtrack(nums, i+1 , result, current);

    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        int index=0;

        backtrack (nums, index, result, current);
        return result;
    }
}