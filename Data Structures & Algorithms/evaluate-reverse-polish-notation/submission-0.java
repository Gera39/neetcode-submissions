

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> numeros = new ArrayDeque<>();

        for (String t : tokens) {
            switch (t) {
                case "+" -> {
                    int b = numeros.pop();
                    int a = numeros.pop();
                    numeros.push(a + b);
                }
                case "-" -> {
                    int b = numeros.pop();
                    int a = numeros.pop();
                    numeros.push(a - b);
                }
                case "*" -> {
                    int b = numeros.pop();
                    int a = numeros.pop();
                    numeros.push(a * b);
                }
                case "/" -> {
                    int b = numeros.pop();
                    int a = numeros.pop();
                    numeros.push(a / b);
                }
                default -> numeros.push(Integer.parseInt(t));
            }
        }

        return numeros.pop();
    }
}
