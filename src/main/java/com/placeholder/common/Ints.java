package com.placeholder.common;

import java.util.ArrayList;

/**
 * Created by yuxiangque on 2016/3/14.
 */
public class Ints {
    public static ArrayList<Integer> asList(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(i, nums[i]);
        }
        return list;
    }
}
