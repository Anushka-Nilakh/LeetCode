class Solution {
    public int thirdMax(int[] nums) {

        // Maximum
        int maximum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maximum) {
                maximum = nums[i];
            }
        }

        // Second maximum
        int secondMax = 0;
        boolean foundSecond = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != maximum) {

                if (!foundSecond || nums[i] > secondMax) {
                    secondMax = nums[i];
                    foundSecond = true;
                }
            }
        }

        // If second maximum doesn't exist
        if (!foundSecond) {
            return maximum;
        }

        // Third maximum
        int thirdMax = 0;
        boolean foundThird = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != maximum && nums[i] != secondMax) {

                if (!foundThird || nums[i] > thirdMax) {
                    thirdMax = nums[i];
                    foundThird = true;
                }
            }
        }

        // If third maximum doesn't exist
        if (!foundThird) {
            return maximum;
        }

        return thirdMax;
    }
}