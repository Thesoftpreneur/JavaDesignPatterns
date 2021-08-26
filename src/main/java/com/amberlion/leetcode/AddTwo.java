package com.amberlion.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddTwo {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length - 1; i++){
            for(int j = i + 1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[2];
    }
    public static int[] twoSumWithHashMaps(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && i != map.get(target - nums[i])){
                return new int[] {i, map.get(target-nums[i])};
            }
        }
        return new int[2];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumWithHashMaps(new int[]{8, 4, 4, 3, 6, 3}, 8)));
//        Map<String, Integer> map = new HashMap<>();
//        map.put("jeden", 1);
//        map.put("dwa", 2);
//        map.put("trzy", 3);
//        System.out.println(map.get("trzy"));
    }
}
