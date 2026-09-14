class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] resultado = new int[2];

        int i = 0;
        int k = numbers.length - 1;

        while (i < k) {

            int suma = numbers[i] + numbers[k];

            if (suma == target) {
                resultado[0] = i + 1;
                resultado[1] = k + 1;
                return resultado;
            }

            if (suma > target) {
                k--;
            } else {
                i++;
            }
        }

        return resultado;
    }
}