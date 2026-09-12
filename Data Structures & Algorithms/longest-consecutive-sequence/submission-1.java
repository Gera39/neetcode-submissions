class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> listado = new HashSet<>();

        // 1. Guardamos los números sin duplicados
        for (int n : nums) {
            listado.add(n);
        }

        int mayorSecuencia = 0;

        // 2. Revisamos cada número
        for (int numero : listado) {

            // Si NO existe el anterior, este número es el inicio
            // de una nueva secuencia
            if (!listado.contains(numero - 1)) {

                int actual = numero;
                int tamaño = 1;

                // 3. Mientras exista el siguiente número,
                // seguimos avanzando
                while (listado.contains(actual + 1)) {
                    actual++;
                    tamaño++;
                }

                // 4. Guardamos la secuencia más grande
                mayorSecuencia = Math.max(mayorSecuencia, tamaño);
            }
        }

        return mayorSecuencia;
    }
}