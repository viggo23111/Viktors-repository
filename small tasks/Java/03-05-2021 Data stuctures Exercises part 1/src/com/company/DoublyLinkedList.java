package com.company;

public class DoublyLinkedList {
        Node top=null;
        Node last = null;

        //add a node to the list
        public void addNode(String data) {
            //Create a new node
            Node newNode = new Node(data);

            //if list is empty, top and last points to newNode
            if(top == null) {
                top = last = newNode;
                //head's previous will be null
                top.previous = null;
                //tail's next will be null
                last.next = null;
            }
            else {
                //add newNode to the end of list.
                last.next = newNode;
                //newNode->previous set to last
                newNode.previous = last;
                //newNode becomes new top
                last = newNode;
                //top's next point to null
                last.next = null;
            }
        }

        //print all the nodes of doubly linked list
        public void printNodes() {
            //Node current will point to head
            Node current = top;
            if(top == null) {
                System.out.println("Doubly linked list is empty");
                return;
            }
            System.out.println("Nodes of doubly linked list: ");
            while(current != null) {
                //Print each node and then go to next.
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
