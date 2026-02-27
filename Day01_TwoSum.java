// Day01_TwoSum.java
import java.util.HashMap;

public class Day01_TwoSum {

    // Efficient O(n) solution using HashMap
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        // If no solution found, return empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        Day01_TwoSum sol = new Day01_TwoSum();
        
        // Example test case
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}