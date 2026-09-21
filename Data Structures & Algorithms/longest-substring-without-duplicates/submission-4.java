class Solution {
    public int lengthOfLongestSubstring(String s) {
        int cantidad = 0;
        int j = 0;

        boolean[] vistos = new boolean[128];

        for (int i = 0; i < s.length(); i++) {

            while (vistos[s.charAt(i)]) {
                vistos[s.charAt(j)] = false;
                j++;
            }

            vistos[s.charAt(i)] = true;

            cantidad = Math.max(cantidad, i - j + 1);
        }

        return cantidad;
    }
}