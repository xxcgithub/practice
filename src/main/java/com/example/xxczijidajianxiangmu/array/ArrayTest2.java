package com.example.xxczijidajianxiangmu.array;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/18
 * Time: 9:28
 */

//这里写一个二分查找下标算法练习
public class ArrayTest2 {

    //首先有个数组
    int[] ints = new int[]{1,2,3,4,5,6,7,8,9};
    //初始位置
    int open = 0;
    // close
    int close = ints.length-1;
    //mid
    int mid = (open+close)/2;
    //定义一个下标
    int index = -1;

    public int getIndex2 (int element){
        while (true){
            if (open >= close){
                return index;
            }
            if (ints[mid] == element){
                index = mid;
                //return index;
                break;
            }else {
                if (ints[mid] > element){
                    close = mid-1;
                }else if (ints[mid] < element){
                    open = mid+1;
                }
                mid = (open+close)/2;
            }
        }
        return index;
    }
}
