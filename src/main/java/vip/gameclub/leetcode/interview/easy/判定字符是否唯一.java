package vip.gameclub.leetcode.interview.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/2 17:20
 */
public class 判定字符是否唯一 {
    @Test
    public void test(){
        System.out.println(isUnique("abc"));
    }

    public boolean isUnique(String astr) {
        List<Character> list = new ArrayList<>();
        for (int i=0; i<astr.length(); i++){
            if(list.contains(astr.charAt(i))){
                return false;
            }
            list.add(astr.charAt(i));
        }
        return true;
    }

    public boolean isUnique2(String astr) {
        for (int i=0; i<astr.length(); i++){
            for (int j=i+1; j<astr.length(); j++){
                if(astr.charAt(i) == astr.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
