class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int total = n1 + n2, mid = total / 2;

        int i = 0, j = 0, count = 0;
        int prev = 0, curr = 0;

        while (count <= mid) {
            prev = curr;
            if (i < n1 && (j >= n2 || nums1[i] < nums2[j])) {
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }
            count++;
        }

        return (total % 2 == 0) ? (prev + curr) / 2.0 : curr;
    }
}
