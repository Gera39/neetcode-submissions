class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Evitar duplicados del primer número
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int suma = nums[i] + nums[j] + nums[k];

                if (suma < 0) {
                    j++;
                } 
                else if (suma > 0) {
                    k--;
                } 
                else {
                    // Encontramos un triplete
                    result.add(Arrays.asList(
                        nums[i],
                        nums[j],
                        nums[k]
                    ));

                    j++;
                    k--;

                    // Evitar duplicados
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return result;
    }
}