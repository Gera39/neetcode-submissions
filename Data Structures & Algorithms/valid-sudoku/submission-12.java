class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> vistos = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char numero = board[i][j];

                // Si la casilla está vacía (tiene un punto), la ignoramos
                if (numero != '.') {
                    
                    // Intentamos agregar el número a la fila, columna y bloque 3x3
                    // .add() devuelve false si la cadena YA EXISTE en el HashSet
                    if (!vistos.add(numero + " en fila " + i) ||
                        !vistos.add(numero + " en col " + j) ||
                        !vistos.add(numero + " en bloque " + (i / 3) + "-" + (j / 3))) {
                        
                        return false; // Se detectó un duplicado
                    }
                }
            }
        }

        return true; // Todo es válido
    }
}