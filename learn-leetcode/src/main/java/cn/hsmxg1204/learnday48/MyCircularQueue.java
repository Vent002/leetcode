package cn.hsmxg1204.learnday48;

/**
 * @Author gxming
 * @Description 设计循环队列
 * @CreateTime 2021-12-18 11:57
 */
public class MyCircularQueue {

    private int[] val;
    private int front,tail;
    /**
     * 构造器
     * @param x
     */
    public MyCircularQueue(int x){
        val = new int[x];
        front = 0;
        tail = 0;
    }

    /**
     * 入队，入队成功返回真。
     * @param value 入队值
     * @return
     */
    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }else {
            val[tail] = value;
            tail = (tail + 1) % val.length;
            return true;
        }
    }

    /**
     * 从循环队列中删除一个元素，成功删除返回 真。
     * @return
     */
    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }else{
            front = (front + 1) % val.length;
            return true;
        }
    }

    /**
     * 获取队首元素。如果队列为空，返回 -1。
     * @return
     */
    public int Front(){
        if(isEmpty()){
            return -1;
        }else{
            return val[front];
        }
    }

    /**
     * 获取 队尾元素。如果队列为空，返回 -1；
     * @return
     */
    public int Rear(){
        if(isEmpty()){
            return -1;
        }else{
            return val[(tail - 1 + val.length) % val.length];
        }
    }

    /**
     * 检查队列是否为空
     * front = rear
     * @return
     */
    public boolean isEmpty(){
        return front == tail;
    }

    /**
     * 检查队列是否已满
     *
     * 队列最多只能有MaxSize - 1 个元素，
     * 判满条件 front = （rear + 1）% MaxSize
     *
     * @return
     */
    public boolean isFull(){
        return (tail + 1) % val.length == front;
    }

    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(4);
        queue.enQueue(1);
        queue.enQueue(2);
        System.out.println(queue.isEmpty());
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.enQueue(5));
    }
}
