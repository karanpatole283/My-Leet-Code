class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int x= nums.length/2;
        // return nums[x];

        int count = 0;
        int candidate = 0;
        for(int num : nums)
        {
            if(count == 0)
            {
                candidate = num;
            }
            if(num == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return candidate;
    }
}