class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] result = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        int left = 0;
        int right = 0;
        int resultIndex = 0;

        while (right < nums.length) {

            // Quitar elementos menores que nums[right]
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[right]) {
                deque.removeLast();
            }

            deque.addLast(right);

            // Si el elemento de enfrente ya salió de la ventana
            if (deque.getFirst() < left) {
                deque.removeFirst();
            }

            // Cuando tenemos una ventana de tamaño k
            if (right - left + 1 == k) {

                result[resultIndex] = nums[deque.getFirst()];
                resultIndex++;

                left++;
            }

            right++;
        }

        return result;
    }
}