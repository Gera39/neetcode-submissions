class Solution {
    public int characterReplacement(String s, int k) {

        int[] frecuencia = new int[26];

        int i = 0;
        int maxFrecuencia = 0;
        int resultado = 0;

        for (int j = 0; j < s.length(); j++) {

            // Contamos el carácter que acaba de entrar
            frecuencia[s.charAt(j) - 'A']++;

            // La frecuencia más grande dentro de la ventana
            maxFrecuencia = Math.max(
                maxFrecuencia,
                frecuencia[s.charAt(j) - 'A']
            );

            // Tamaño actual de la ventana
            int ventana = j - i + 1;

            // ¿Cuántos cambios necesitamos?
            int cambios = ventana - maxFrecuencia;

            // Si necesitamos más cambios de los permitidos,
            // hacemos la ventana más pequeña
            if (cambios > k) {
                frecuencia[s.charAt(i) - 'A']--;
                i++;
            }

            // Guardamos la ventana más grande encontrada
            resultado = Math.max(resultado, j - i + 1);
        }

        return resultado;
    }
}