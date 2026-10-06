import java.util.*;

class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;
        long[] sum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

        Deque<Integer> dq = new ArrayDeque<>();
        int ans = n + 1;

        for (int i = 0; i <= n; i++) {
            while (!dq.isEmpty() &&
                   sum[i] - sum[dq.peekFirst()] >= k) {

                ans = Math.min(ans, i - dq.pollFirst());
            }
            while (!dq.isEmpty() &&
                   sum[i] <= sum[dq.peekLast()]) {

                dq.pollLast();
            }

            dq.addLast(i);
        }

        return ans == n + 1 ? -1 : ans;
    }
}