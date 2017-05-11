package problem1.solution1;

/**
 * Created by adela on 17-5-10.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String [] args){
        int[] result=new Solution().twoSum(new int[]{2, 7, 11, 15},9);
        for(int i=0;i<result.length;i++)
            System.out.println(result[i]);
    }

}

