class Solution {

    boolean canEatAll(int[] piles, int mid, int h) {
        long actualHours = 0;

        for (int x : piles) {
            actualHours += x / mid;

            if (x % mid != 0) {
                actualHours++;
            }
        }

        return actualHours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = 0;

        // Find maximum pile
        for (int x : piles) {
            r = Math.max(r, x);
        }

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (canEatAll(piles, mid, h)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}