package cn.hsmxg1204;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * TODO
 *
 * @author gxming
 * @description map的四种遍历方式
 * @date 2021-06-26 11:19
 */
public class LearnRoad {
    HashMap<String, String> map = new HashMap<>();
    /**
     * keySet values
     */
    public void mapKeySet(){
        // 获取map的value
        for (String str : map.values()){
            System.out.println(str);
        }
        // keySet 遍历map的key
        for (String key: map.keySet()){
            System.out.println(key);
        }
    }

    /**
     * 先获取key,然后再通过map的get(key)获取value
     */
    public void keySetAndGetKey(){
        for (String key : map.keySet()){
            // 用key在遍历一次，效率不行，不推荐使用
            String value = map.get(key);
            System.out.println("map key:"+ key +": value :"+value);
        }
    }

    /**
     * 通过对map entrySet的遍历，也可以同时拿到key和value
     * 效率高于 keySetAndGetKey()
     */
    public void mapEntry(){
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("key: "+ entry.getKey() + ",value: "+entry.getValue());
        }
    }

    /**
     * 用Iterator代替
     * Iterator有其优势：在用foreach遍历map时，如果改变其大小，会报错，
     *          但如果只是删除元素，可以使用Iterator的remove方法删除元素
     */
    public void mapIterator(){
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println("key: "+ entry.getKey() +",value: "+ entry.getValue());
        }
    }

    /**
     * 性能低于entrySet,所以更推荐用entrySet的方式
     */
    public void mapLambda(){
        map.forEach((key,value) -> {
            System.out.println("key :"+key+",value:"+value);
        });
    }
    public static void main(String[] args) {

    }
}
