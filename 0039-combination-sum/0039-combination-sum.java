class Solution {

    public void backtrack(int[] candidates, int target, int idx ,List<List<Integer>> result, List<Integer> current ,int sum ){

        if (sum==target){
            result.add(new ArrayList<Integer>(current));
            return;
        }

        if (sum>target) return;

        for (int i=idx ; i<candidates.length; i++){
            sum+=candidates[i];
            current.add(candidates[i]);
            backtrack(candidates, target, i,result, current, sum);
            
            sum-=candidates[i];
            current.remove(current.size()-1);
        }

    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> current= new ArrayList<>();

        int sum=0;
        int idx=0;
        backtrack(candidates, target,idx, result,current , sum);
        return result;
        
    }
}