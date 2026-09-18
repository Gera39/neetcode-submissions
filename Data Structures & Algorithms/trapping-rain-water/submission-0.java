class Solution {
    public int trap(int[] height) {
        // Dos punteros i y j 
        if (height == null || height.length < 3) {
            return 0;
        }
        
        int left = 0;                          // Puntero izquierdo
        int right = height.length - 1;         // Puntero derecho
        int maxLeft = 0;                       // Máximo visto desde la izquierda
        int maxRight = 0;                      // Máximo visto desde la derecha
        int water = 0;                         // Agua total atrapada
        
        // Mientras los punteros no se crucen
        while (left < right) {
            // Si la altura izquierda es menor
            if (height[left] < height[right]) {
                // Si es mayor o igual al máximo anterior, actualiza
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    // Si no, acumula agua
                    water += maxLeft - height[left];
                }
                left++;  // Avanza puntero izquierdo
            } 
            // Si la altura derecha es menor o igual
            else {
                // Si es mayor o igual al máximo anterior, actualiza
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    // Si no, acumula agua
                    water += maxRight - height[right];
                }
                right--;  // Retrocede puntero derecho
            }
        }
        
        return water;
    }
}