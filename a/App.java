package a;
public class App {
    public static void main(String[] arg) {
        Solution s=new Solution();
        int[] a=new int[4];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        System.out.println(s.twoSum(a,4)[1]);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}