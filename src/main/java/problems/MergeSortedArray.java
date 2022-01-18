package problems;

public class MergeSortedArray {

    public static void makeCopy(int[] nums1, int[] source, int len) {
        for(int i=0; i<len ;i++) {
            nums1[i] = source[i];
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int resInd = 0;
        int mInd = 0;
        int nInd = 0;
        if(m == 0) {
            makeCopy(nums1, nums2, n);
            return;
        } if (n==0) {
            return;
        }
        if(m>0 && n>0) {
            for(int i=0; i<m+n ;i++) {
                if(mInd<m && nInd<n) {
                    if(nums1[mInd] <= nums2[nInd]) {
                        res[resInd] = nums1[mInd++];
                    } else {
                        res[resInd] = nums2[nInd++];
                    }
                } else {
                    if(nInd >= n) {
                        res[resInd] = nums1[mInd++];
                    } else {
                        res[resInd] = nums2[nInd++];
                    }
                }
                resInd++;
            }
        }
        makeCopy(nums1, res, m+n); //will modify reference of nums1
    }
    public static void main(String[] args) {
        int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};
        int m = 1;
        int n = 5;
        merge(nums1, m, nums2, n);
    }
}
