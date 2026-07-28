class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int n:nums){
            int i = 0;
            for(int n1:nums){
                if(n1 == n){
                    i++;
                }
                if(i>1){
                    return true;
                }
            }
        }
        return false;
    }
}