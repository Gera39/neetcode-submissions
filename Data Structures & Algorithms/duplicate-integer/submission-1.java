class Solution {
    public boolean hasDuplicate(int[] nums) {
        int actualValue = 0;
        List<Integer> numeros = new ArrayList<>();
        for(int n : nums){
            if(numeros.contains(n)) return true;
            numeros.add(n);
        }
        return false; 
    }
}