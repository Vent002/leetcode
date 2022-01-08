package cn.hsmxg1204.learnday53;

import java.text.MessageFormat;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Deque;

/**
 * @Author gxming
 * @Description 简化路径
 * @CreateTime 2022-01-06 22:09
 */
public class SimplePath {
    public static String simplePath(String path){
        String[] paths = path.split("/");
        Deque<String> stack = new ArrayDeque<String>();
        for (String name : paths){
            if("..".equals(name)){
                if(!stack.isEmpty()){
                    stack.pollLast();
                }
            }else if(name.length() > 0  && !".".equals(name)){
                stack.offerLast(name);
            }
        }
        StringBuffer sbuf = new StringBuffer();
        if(stack.isEmpty()){
            sbuf.append('/');
        }else{
            while (!stack.isEmpty()){
                sbuf.append('/');
                sbuf.append(stack.pollFirst());
            }
        }
        return sbuf.toString();
    }

    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.println(simplePath(path));
        Calendar cla = Calendar.getInstance();
        String str = "今天是{0}年{1}月{2}日";
        String newStr = MessageFormat.format(str,cla.get(Calendar.YEAR),
                cla.get(Calendar.MONTH) + 1 ,cla.get(Calendar.DAY_OF_YEAR));


        String str1 = "今天是%d年%d月%d日。%s";
        String newStr2 = String.format(str1,cla.get(Calendar.YEAR),
                cla.get(Calendar.MONTH) + 1 ,cla.get(Calendar.DAY_OF_YEAR),cla.getCalendarType());
        System.out.println(newStr);
        System.out.println(newStr2);
    }
}
