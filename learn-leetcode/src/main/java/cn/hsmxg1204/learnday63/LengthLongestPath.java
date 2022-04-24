package cn.hsmxg1204.learnday63;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author gxming
 * @Description
 * @CreateTime 2022-04-20 10:36
 */
public class LengthLongestPath {
    public static int lengthLongestPath(String input){
        int l = input.length();
        int pos = 0,ans = 0;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        while (pos < l){
            int depth = 1;
            while (pos < l && input.charAt(pos) == '\t'){
                pos++;
                depth++;
            }
            boolean isFile = false;
            int len =0;
            while (pos < l && input.charAt(pos) != '\n'){
                if(input.charAt(pos) == '.'){
                    isFile = true;
                }
                len++;
                pos++;
            }
            pos++;
            while (stack.size() >= depth){
                stack.pop();
            }
            if(!stack.isEmpty()){
                len+=stack.peek()+1;
            }
            if(isFile){
                ans = Math.max(ans,len);
            }else{
                stack.push(len);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(lengthLongestPath(input));
    }
}
