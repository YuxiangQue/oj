package com.placeholder.jianzhioffer;

/**
 * Created by yuxiangque on 2016/3/18.
 */
public class _10NumOf1 {
    public int NumberOf1(int n) {
        int num = 0;
        while (n != 0) {
            n = n & (n - 1);
            ++num;
        }
        return num;
    }
}
