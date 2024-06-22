class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num % 2;
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
        }
        return count;
    }
}
