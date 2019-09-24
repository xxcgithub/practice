package com.example.xxczijidajianxiangmu.lianbiao;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/19
 * Time: 21:24
 */
public class Slink {
    int date;
    Slink next = this;
    Slink pre = this;

    public Slink(int date){
        this.date = date;
    }

    //添加方法
    public void after (Slink node){
        //第一步取出当前节点下一个节点
        Slink nextnext = this.next;
        //第二步把新节点作为当前节点下一个节点
        this.next = node;
        //第三步把当前节点作为新节点的上一个节点
        node.pre = this;
        //第四步将下一个节点作为新节点的下一个节点
        node.next = nextnext;
        //第五步将新节点作为下一个节点的上一个节点
        nextnext.pre = node;
    }
    //获取下一个方法
    public Slink getNext (){
        return  this.next;
    }
    //获取上一个方法
    public Slink getPre(){
        return this.pre;
    }
    //获取值得方法
    public Integer getDate (){
        return this.date;
    }
}
