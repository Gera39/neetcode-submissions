class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0; 
        for(int  i = 0; i <= heights.length; i++){
            int currentHeigth = (i == heights.length) 
            ? 0
            : heights[i];

            while(!stack.isEmpty() && currentHeigth < heights[stack.peek()]){
                int heigth = heights[stack.pop()]; 
                int width; 
                if(stack.isEmpty()){
                    width = i; 
                }else{
                    width = i - stack.peek() - 1;
                }                
                int area = heigth * width; 
                maxArea = Math.max(maxArea, area);
            } 

            if(i < heights.length){
                stack.push(i);
            }
        }
        
        return maxArea;
    }
}
