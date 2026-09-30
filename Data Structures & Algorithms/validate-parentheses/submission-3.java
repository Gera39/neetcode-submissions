class Solution {
    public boolean isValid(String s) {

        Stack<Character> pila = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } 
            else {

                if (pila.empty()) {
                    return false;
                }

                char ultimo = pila.peek();

                if ((c == ')' && ultimo == '(') ||
                    (c == ']' && ultimo == '[') ||
                    (c == '}' && ultimo == '{')) {

                    pila.pop();

                } else {
                    return false;
                }
            }
        }

        return pila.empty();
    }
}