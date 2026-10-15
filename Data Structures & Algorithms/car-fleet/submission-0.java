


class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // Guardamos posición y velocidad de cada carro
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Ordenamos de la posición más cercana al destino
        // a la más lejana
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int pos = cars[i][0];
            int vel = cars[i][1];

            // Tiempo necesario para llegar al destino
            double time = (double) (target - pos) / vel;

            // Si tarda más que la flota de adelante,
            // no logra alcanzarla: crea una nueva flota.
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

            // Si time <= stack.peek(), se une a la flota
            // de adelante y no agregamos nada al Stack.
        }

        return stack.size();
    }
}
