package com.company;

import java.util.ArrayList;

public class LinkedList {
    Node top=null;
    Node last = null;

    //add a node to the list
    public void addNode(String data) {
        //Create a new node
        Node newNode = new Node(data);

        //if list is empty, top and last points to newNode
        if(top == null) {
            top = newNode;
        }
        else {
            //add newNode to the end of list.
            last.next = newNode;
            //newNode->previous set to last

            //newNode becomes new top
            last = newNode;
            //top's next point to null
        }
        last.next = null;
    }

    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head
        Node current = top;
        if(top == null) {
            System.out.println("linked list is empty");
            return;
        }
        System.out.println(" linked list: ");
        while(current != null) {
            //Print each node and then go to next.
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
