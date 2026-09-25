class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] letras1 = new int[26];
        int[] letras2 = new int[26];

        // Contamos las letras de s1
        for (char c : s1.toCharArray()) {
            letras1[c - 'a']++;
        }

        // Primera ventana de s2
        for (int i = 0; i < s1.length(); i++) {
            letras2[s2.charAt(i) - 'a']++;
        }

        int i = 0;
        int j = s1.length();

        while (j < s2.length()) {

            if (Arrays.equals(letras1, letras2)) {
                return true;
            }

            // Sacamos la letra izquierda
            letras2[s2.charAt(i) - 'a']--;

            // Metemos la letra derecha
            letras2[s2.charAt(j) - 'a']++;

            i++;
            j++;
        }

        return Arrays.equals(letras1, letras2);
    }
}