package problem1.solution2;

import java.util.HashMap;

/**
 * Created by adela on 17-5-10.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
        }



        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String [] args){
        int[] result=new Solution().twoSum(new int[]{2, 7, 11, 15},9);
        for(int i:result)
            System.out.println(i);
    }

}

