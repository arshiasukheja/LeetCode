class Solution {

    public void backtrack(int n, int k ,int i,List<List<Integer>>result, List<Integer>current ){
        if (current.size()==k){
            result.add(new ArrayList<Integer>(current));
            return;
        }

        for (int idx=i; idx<=n; idx++){
            current.add(idx);
            backtrack(n, k ,idx+1, result, current);
            current.remove(current.size()-1);
          
        }
    }


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        int i=1;

        backtrack(n,k,i,result,current);
        return result;
    }
}