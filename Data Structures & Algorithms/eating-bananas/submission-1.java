class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int izq = 1;
        int der = 0; 
        for (int pila: piles){
            der = Math.max(der,pila);
        }

        int respuesta = der; 

        while(izq <= der){
            int k = izq + (der - izq) / 2;
            long horas = 0;
            for(int pila : piles){
                horas += (pila + k - 1) / k;
            }
            if(horas <= h ){
                respuesta = k;
                der = k - 1;
            }else {
                izq =  k + 1;
            }
        }
        return respuesta;
    }

}
