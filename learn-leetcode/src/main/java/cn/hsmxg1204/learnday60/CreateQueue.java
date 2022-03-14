package cn.hsmxg1204.learnday60;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author gxming
 * @Description 剑指offer day01 用两个栈实现队列
 * @CreateTime 2022-03-14 11:42
 */
public class CreateQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CreateQueue(){
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }else{
            int popIndex = stack1.pop();
            return popIndex;
        }
    }
}
