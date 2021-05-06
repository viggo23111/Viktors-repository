package com.company;

public class Main {
    public static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {
      /*  linkedList.addNewNode("test1");
        linkedList.addNewNode("test2");
        linkedList.addNewNode("test3");
        linkedList.addNewNode("test4");
        linkedList.addNewNode("test5");

        for (int i = 0; i < linkedList.nodes.size(); i++) {
            System.out.println(linkedList.nodes.get(i).getData());
        }
        System.out.println(linkedList.member.getData());*/
        LinkedList l_List = new LinkedList();
        //Add nodes to the list
        l_List.addNode("test1");
        l_List.addNode("test2");
        l_List.addNode("test3");
        l_List.addNode("test4");
        l_List.addNode("test5");
        //l_List.printNodes();

        DoublyLinkedList dl_List = new DoublyLinkedList();
        //Add nodes to the list
        dl_List.addNode("test1");
        dl_List.addNode("test2");
        dl_List.addNode("test3");
        dl_List.addNode("test4");
        dl_List.addNode("test5");

        //print the nodes of DoublyLinkedList
        dl_List.printNodes();

    }
}
