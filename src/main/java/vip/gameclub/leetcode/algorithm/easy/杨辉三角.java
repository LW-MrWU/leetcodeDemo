package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/3 16:24
 */
public class 杨辉三角 {
    @Test
    public void test(){
        //List<List<Integer>> lists = generate(1);
        List<Integer> lists = getRow(3);
        System.out.println(lists);
    }

    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>(Arrays.asList(Arrays.asList(1)));
        List<List<Integer>> lists = generate(--numRows);
        List<Integer> list = lists.get(lists.size()-1);
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        for (int i=1; i<list.size(); i++){
            newList.add(list.get(i-1)+list.get(i));
        }
        newList.add(1);
        lists.add(newList);
        return lists;
    }


    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 1) return new ArrayList<>(Arrays.asList(1));
        List<Integer> list = getRow(--rowIndex);

        int pre = list.get(0);
        for (int i=1; i<=list.size(); i++){
            if(i == list.size()){
                list.add(1);
                break;
            }
            int a = list.get(i);
            list.set(i, a+pre);
            pre = a;
        }
        return list;
    }
}
