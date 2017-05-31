package com.happ.happ.util

/**
 * 717219917@qq.com  2017/5/31 16:24
 */

object Apo {

    //o(lgN)二分查找 nums要求有序
    fun binarySearchFind(nums: IntArray, des: Int): Int {
        val length = nums.size
        var low = 0
        var high = length - 1
        while (low <= high) {
            val mid = (low + high) / 2
            if (nums[mid] == des) {
                return mid
            } else if (nums[mid] < des) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        return -1
    }


    //给定一个单调不降的数组，查找大于des条件的最小的数
    fun binarySearchMinFind(nums: IntArray, des: Int): Int {
        val length = nums.size
        var low = 0
        var high = length - 1
        var mid: Int
        while (low < high) {
            mid = (low + high) / 2
            if (nums[mid] <= des) {
                low = mid + 1
            } else {
                high = mid
            }
        }
        if (nums[high] > des) return high
        return -1
    }

    //给定一个单调不降的数组，查找小于des条件的最大的数
    fun binarySearchMaxFind(nums: IntArray, des: Int): Int {
        val length = nums.size
        var low = 0
        var high = length - 1
        var mid: Int
        val result = -1
        while (low < high) {
            mid = low + (high - low + 1) / 2
            if (nums[mid] < des) {
                low = mid
            } else {
                high = mid - 1
            }
        }
        if (nums[low] < des) return low
        return -1
    }


}
