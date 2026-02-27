public class Day01_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int n : nums)
            if (k == 0 || n != nums[k-1])
                nums[k++] = n;
        return k;
    }
    public static void main(String[] args) {
        Day01_RemoveDuplicates sol = new Day01_RemoveDuplicates();
        int[] nums = {1,1,2,2,3,3,4};
        int k = sol.removeDuplicates(nums);
        for (int i = 0; i < k; i++) System.out.print(nums[i] + " ");
        // Output: 1 2 3 4
    }
}
