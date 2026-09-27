class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        int[] frecuencia = new int[128];

        // Guardamos cuántas veces necesitamos cada carácter de t
        for (char c : t.toCharArray()) {
            frecuencia[c]++;
        }

        int i = 0;
        int j = 0;

        int necesarios = t.length();
        int inicio = 0;
        int longitudMinima = Integer.MAX_VALUE;

        while (j < s.length()) {

            char actual = s.charAt(j);

            // Si todavía necesitábamos este carácter
            if (frecuencia[actual] > 0) {
                necesarios--;
            }

            frecuencia[actual]--;
            j++;

            // Ya tenemos todos los caracteres de t
            while (necesarios == 0) {

                // ¿Esta ventana es la más pequeña?
                if (j - i < longitudMinima) {
                    longitudMinima = j - i;
                    inicio = i;
                }

                char izquierda = s.charAt(i);

                frecuencia[izquierda]++;

                // Al quitarlo, volvemos a necesitar este carácter
                if (frecuencia[izquierda] > 0) {
                    necesarios++;
                }

                i++;
            }
        }

        if (longitudMinima == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(inicio, inicio + longitudMinima);
    }
}