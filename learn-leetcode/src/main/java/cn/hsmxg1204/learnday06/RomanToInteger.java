package cn.hsmxg1204.learnday06;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 *  例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 *
 * 来源  https://leetcode-cn.com/problems/roman-to-integer/description/?utm_source=LCUS&utm_medium=ip_redirect&utm_campaign=transfer2china
 *
 * @author gxming
 * @description
 * @date 2021-07-03 16:46
 */
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        //所有可能的都列出来
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int res = 0;
        for (int i = 0; i < s.length(); ) {
            //先截取两个字符，如果这两个字符存在于map中，就表示他们是一个整体。否则就截取一个
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                res += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                res += map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return res;
    }
}
