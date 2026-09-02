class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numeros = new HashSet<>();
        for(int n : nums){
            if(!numeros.add(n)){
                return true;
            }
        }
        return false;
    }
}