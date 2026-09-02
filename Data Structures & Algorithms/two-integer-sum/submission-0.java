class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numeros  = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numeros.containsKey(complement)){
                return new int[]{numeros.get(complement),i};
            }
            numeros.put(nums[i],i);
        } 
        return new int[]{};
    }
}
