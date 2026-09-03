class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          // 1. Contar cuántas veces aparece cada número
        HashMap<Integer, Integer> frecuencia = new HashMap<>();

        for (int num : nums) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        // 2. Crear buckets donde el índice representa la frecuencia
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int num : frecuencia.keySet()) {
            int cantidad = frecuencia.get(num);

            if (buckets[cantidad] == null) {
                buckets[cantidad] = new ArrayList<>();
            }

            buckets[cantidad].add(num);
        }

        // 3. Sacar los k elementos con mayor frecuencia
        int[] result = new int[k];
        int indice = 0;

        for (int i = buckets.length - 1; i >= 0 && indice < k; i--) {

            if (buckets[i] != null) {

                for (int num : buckets[i]) {
                    result[indice] = num;
                    indice++;

                    if (indice == k) {
                        break;
                    }
                }
            }
        }

        return result;
        
    }
}
