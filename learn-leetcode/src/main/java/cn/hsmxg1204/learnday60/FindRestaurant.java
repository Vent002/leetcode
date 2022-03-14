package cn.hsmxg1204.learnday60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author gxming
 * @Description 599. 两个列表的最小索引总和
 * @CreateTime 2022-03-14 09:53
 */
public class FindRestaurant {
    public static String[] findRestaurant(String[] list1,String[] list2){
        ArrayList result = new ArrayList<String>();
        int curIndex = 0;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if(list1[i].equals(list2[j])){
                    if(curIndex == 0 && result.size() == 0) {
                        result.add(list1[i]);
                        curIndex = i + j;
                    }else{
                        if(i+j < curIndex){
                            result.clear();
                            result.add(list1[i]);
                        }else if(i + j == curIndex){
                            result.add(list1[i]);
                        }
                    }
                }
            }
        }

        return  (String[]) result.toArray(new String[result.size()]);
    }

    public static String[] findRestaurantByHashTable(String[] list1,String[] list2){
        HashMap<String, Integer> index = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            index.put(list1[i],i);
        }
        ArrayList<String> result = new ArrayList<>();
        int max_index = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if(index.containsKey(list2[i])){
                int j = index.get(list2[i]);
                if(max_index > i + j){
                    result.clear();
                    result.add(list2[i]);
                    max_index = i + j;
                }else if(i + j == max_index){
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
//        System.out.println(Arrays.toString(findRestaurant(list1, list2)));

        String[] list3 = {"Shogun", "KFC", "Burger King", "Tapioca Express"};
        String[] list4 = {"KFC", "Shogun", "Burger King"};

//        System.out.println(Arrays.toString(findRestaurant(list3, list4)));

        String[] list5 = {"k","KFC"};
        String[] list6 = {"k","KFC"};
        long l = System.currentTimeMillis();
        System.out.println(Arrays.toString(findRestaurant(list5, list6)));
        System.out.println(System.currentTimeMillis() - l);

        long l2 = System.currentTimeMillis();
        System.out.println(Arrays.toString(findRestaurantByHashTable(list5, list6)));
        System.out.println(System.currentTimeMillis() - l2);
    }
}
