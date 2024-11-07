class Solution {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(nums);
        return i;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int i= removeElement(nums,2);
        System.out.println(i);
    }
}