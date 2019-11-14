package com.burkovskyi.arrays;

import java.util.HashSet;

import java.util.Set;

/**
 * created by Oleksandr Burkovskyi on 2019-11-14.
 */
public class RemoveDuplicates {


    public static void main(String[] arr){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] intArray = new int[]{-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates.removeDuplicates(intArray));
    }

    public int removeDuplicates(int[] nums) {

        int index = 0;
        Set<Integer> outPut = new HashSet<Integer>();
        for (Integer n: nums){
            if (!outPut.contains(n)){
                nums[index++] = n;
                outPut.add(n);
            }
        }

        return index;
    }

}
