// Day01_MaxArea.java
public class Day01_MaxArea {

    // Two-pointer approach - O(n) time, O(1) space
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            maxWater = Math.max(maxWater, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        Day01_MaxArea sol = new Day01_MaxArea();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = sol.maxArea(height);
        System.out.println("Maximum water area: " + result); //output:49
    }
}
