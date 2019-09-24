package com.example.xxczijidajianxiangmu.test;

import com.example.xxczijidajianxiangmu.lianbiao.Node;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/18
 * Time: 15:11
 */
public class NodeTest1 {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        node.ru(node1).ru(node2);
        node.ru(new Node(4));
        node.all();
        Node node3 = new Node(5);
        node1.after(node3);
        node.all();
    }
}
