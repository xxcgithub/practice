package com.example.xxczijidajianxiangmu.lianbiao;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/18
 * Time: 14:09
 */
public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    //增加节点
    public Node ru(Node node2){
        Node currentNode = this;
        //循环取出最后一个付给当前节点
        while (true){
            Node node1 = currentNode.next;
            if (node1 == null){
                break;
            }
            currentNode = node1;
        }
        currentNode.next = node2;
        return this;
    }
    //获取当前节点数据
    public int cha(){
        return this.data;
    }
    //获取下一个节点
    public Node huo(){
        return next;
    }
    //删除节点
    public void delete (){
        //得到下下个节点
        Node node = this.next.next;
        this.next = node;
    }
    //查看所有节点
    public void all (){
        Node currentNode = this;
        while (true){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
            if (currentNode == null){
                break;
            }
        }
        System.out.println();
    }
    //插入节点
    // 思路 很简单  就是把 下一个节点 作为 下下个节点，把新插入的作为下一个节点
    public void  after (Node Newnode){
        //首先取出当前节点
        Node currentNode = this;
        Node nextnext = currentNode.next;
        //把新插入的作为下一个节点
        currentNode.next = Newnode;
        //把 下一个节点 作为 下下个节点
        Newnode.next = nextnext;

    }

}

