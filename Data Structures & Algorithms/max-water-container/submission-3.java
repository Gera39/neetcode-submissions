class Solution {
    public int maxArea(int[] heights) {
        int cantidadAgua = 0; // 8 ,  
        int i = 0; // 1 , 7 
        int j = heights.length-1; // 6

        while(i < j){
            cantidadAgua = Math.max(cantidadAgua,( j - i)  * (Math.min(heights[i] , heights[j])));
            if(heights[i] < heights[j]){
                i++;
            }else  {
                j--;
            }
            
        }
        return cantidadAgua; 
    }
}
