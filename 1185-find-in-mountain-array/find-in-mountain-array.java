/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 

class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        // Step 1: Find peak index
        int start = 0;
        int end = n - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        int peak = start;

        // Step 2: Search in increasing part
        start = 0;
        end = peak;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int value = mountainArr.get(mid);

            if (value == target) {
                return mid;
            }
            else if (value < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // Step 3: Search in decreasing part
        start = peak + 1;
        end = n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int value = mountainArr.get(mid);

            if (value == target) {
                return mid;
            }
            else if (value < target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
