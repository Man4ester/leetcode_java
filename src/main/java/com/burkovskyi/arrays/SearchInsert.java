package com.burkovskyi.arrays;

/**
 * created by Oleksandr Burkovskyi on 2019-11-14.
 */
public class SearchInsert {

    public static void main(String[] args) {

        SearchInsert searchInsert = new SearchInsert();
        int[] a = new int[] {1, 3, 5, 6};
        System.out.println(searchInsert.searchInsert(a, 7));
    }


    public int searchInsert(int[] nums, int target) {

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int num = nums[i];

            if (num == target || target < num) {
                return i;
            }

            if (i == len - 1 && target > num) {
                return i + 1;

            }
        }
        return 0;
    }

}
