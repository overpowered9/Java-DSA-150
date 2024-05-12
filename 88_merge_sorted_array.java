class Solution {
    public static void main(String[] args) {
        int [] nums1={1,2,3,4,5};
        int [] nums2={5,6,7,8};
        Solution solution = new Solution();
        solution.merge(nums1,    nums1.length, nums2, nums2.length);

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        System.err.println(nums1);
    }
}