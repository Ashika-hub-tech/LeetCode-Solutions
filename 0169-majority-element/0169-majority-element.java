class Solution {
    public int majorityElement(int[] nums) {
         int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set new candidate
            }
            if (num == candidate) {
                count++; // Increment count if same as candidate
            } else {
                count--; // Decrement count otherwise
            }
        }

        return candidate;
    }
}