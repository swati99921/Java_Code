package com.company;
//import static java.lang.System;
public class StackLinkList {

    public class Node {
        int data;
        Node link;

    }
    Node top;

    StackLinkList() {
        this.top = null;
    }

    public void push(int x) {
        //Create Node
        Node temp = new Node();
        if (temp == null) {
            System.out.print("\nHeap OverFlow");
            return;
        }
        // Insert Data
        temp.data = x;
        temp.link = top;
        top = temp;

    }

    public void pop(){
        if(top==null){
            System.out.println("\nHeap underFlow");
            return;

        }
        //Update Data
        top = top.link;
    }

    public void display() {
        if (top == null) {
            System.out.println("\nHeap underFlow");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d-> ", temp.data);
                temp =temp.link;
            }
        }
    }

    public static  void main(String[] args){
        StackLinkList obj = new StackLinkList();
        obj.push(10);
        obj.push(14);
        obj.push(18);
        obj.push(22);
        obj.push(65);
        obj.display();
        System.out.printf("\nTop element is %d\n" );
        obj.pop();
        obj.pop();
        obj.pop();
        obj.display();
        System.out.printf("\nTop element is %d\n" );

    }
}

