class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> pila = new ArrayDeque<>();
        for(int n : result){
            n = 0;
        }

        for(int i = 0; i < temperatures.length; i++){
           while(!pila.isEmpty() && temperatures[i] > temperatures[pila.peek()] ){

                int indiceAnte = pila.pop();
                result[indiceAnte] = i - indiceAnte;
           }
            pila.push(i);
        }

        return result;
    }
}
