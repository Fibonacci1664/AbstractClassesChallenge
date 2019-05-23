package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        //MyLinkedList list = new MyLinkedList(null);

//        list.traverse(list.getRoot());
//
//        String stringData1 = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//
//        String[] data1 = stringData1.split(" ");
//
//        for(String s : data1)
//        {
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
    
    
//        list.traverse(list.getRoot());
//
//        String stringData2 = "5 7 3 9 8 2 1 0 4 6";
//
//        String[] data2 = stringData2.split(" ");
//
//        for (String s : data2)
//        {
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("5"));
//        list.removeItem(new Node("7"));
//        list.removeItem(new Node("3"));
//
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("9"));
//        list.removeItem(new Node("8"));
//
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("2"));
//
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("1"));
//        list.removeItem(new Node("0"));
//        list.removeItem(new Node("4"));
//
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("6"));
//
//        list.traverse(list.getRoot());
    
        SearchTree tree = new SearchTree(null);
    
        tree.traverse(tree.getRoot());
    
        String stringData3 = "15 17 13 19 18 12 11 10 14 16";
    
        String[] data3 = stringData3.split(" ");
    
        for (String s : data3)
        {
            tree.addItem(new Node(s));
        }
    
        tree.traverse(tree.getRoot());
    
        tree.removeItem(new Node("15"));
        tree.removeItem(new Node("17"));
        tree.removeItem(new Node("13"));

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("19"));
        tree.removeItem(new Node("18"));

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("12"));

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("11"));
        tree.removeItem(new Node("10"));
        tree.removeItem(new Node("14"));

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("16"));

        tree.traverse(tree.getRoot());
    }
}
