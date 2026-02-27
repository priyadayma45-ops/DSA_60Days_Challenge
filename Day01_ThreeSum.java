import java.util.*;

public class Day01_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) k--;
                else if (sum < 0) j++;
                else {
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                    while (j < k && nums[j] == nums[j-1]) j++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Day01_ThreeSum sol = new Day01_ThreeSum();
        System.out.println(sol.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
