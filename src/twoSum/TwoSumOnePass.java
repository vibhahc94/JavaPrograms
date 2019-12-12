/* Question:
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

/* Solution:
* While iterating,check if the current element's complement(target - arr[i]) is present in the HashMap, if not present add the element
* and its index as [Key,Value] pair to the HashMap.Else if it is present, first index would be value of element's complement,
 * second index would be i*/

package twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOnePass {
    static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] res;
        res = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                res[0]= map.get(target - nums[i]);
                res[1]= i;
            }
            else
            {
                    map.put(nums[i],i);
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int nums[] = {2,4,8,9,3};
        int target = 5;
        int[] indices = twoSum(nums,target);

       System.out.println("Indices :: " +indices[0] +" "+ indices[1]);

    }
}
