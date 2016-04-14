package com.placeholder.leetcode.segment_tree;

import com.placeholder.common.SegmentTree2d;

/**
 * https://leetcode.com/problems/range-sum-query-2d-mutable/
 *
 * @author yuxiangque
 * @version 2016/4/14
 */
public class _308RangeSumQuery2Mutable {


    public class NumArray {

        SegmentTree2d segmentTree;

        public NumArray(int[][] nums) {
            if (nums == null || nums.length == 0)
                return;
            segmentTree = new SegmentTree2d(nums);
        }

        void update(int i, int j, int val) {
            if (segmentTree == null)
                return;
            segmentTree.update(i, j, val);
        }

        // [i,j]
        public int sumRange(int i1, int j1, int i2, int j2) {
            if (segmentTree == null)
                return 0;
            return segmentTree.sum(i1, j1, i2, j2);
        }
    }
}
