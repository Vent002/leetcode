package cn.hsmxg1204.learnday59;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @Author gxming
 * @Description List 列表在保留顺序的前提下去掉重复的值
 * @CreateTime 2022-03-04 14:29
 */
public class removeDuplicateElement {
    public static void removeDuplicateElement(List list){
        TreeSet treeSet = new TreeSet();
        for (Object obj : list){
            treeSet.add(obj);
        }
        treeSet.forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("4");
        list.add("4");
        list.add("2");

        list.add("2");
        list.add("3");
        removeDuplicateElement(list);
    }
}
