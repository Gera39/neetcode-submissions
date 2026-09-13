class Solution {
    public boolean isPalindrome(String s) {
        String resultado = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] palabraLista = resultado.toCharArray();
        int segundoPointer = palabraLista.length - 1;
        for(int  i = 0;  i < palabraLista.length; i++){
            if(palabraLista[i] != palabraLista[segundoPointer] ){
                return false;
            }
            segundoPointer--;
        }
        return true;
    }
}
