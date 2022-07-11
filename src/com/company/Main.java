package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    BinaryTree myTree = new BinaryTree(7,                                                 //          7
                                new BinaryTree(3,                                        //        /     \
                                            new BinaryTree(2,                           //        3       9
                                                        new BinaryTree(1), null), //        / \     / \
                                            new BinaryTree(5,                         //        2   5   8   10
                                                        new BinaryTree(4),           //        /  /  \       \
                                                        new BinaryTree(6)))         //        1  4    6       11
                                ,new BinaryTree(9,
                                            new BinaryTree(8),
                                            new BinaryTree(10, null,
                                                        new BinaryTree(11))));

        System.out.println("Рекурсивный обход дерева: ");
        myTree.recursiceTree();

        System.out.println("Обход дерева в ширину: ");
        myTree.iterativeTree(myTree);
    }

      static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value, BinaryTree left, BinaryTree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public BinaryTree(int value) {
            this.value = value;
        }

        public void recursiceTree() {
            System.out.println(value);

            if (left != null)
                left.recursiceTree();

            if (right != null)
                right.recursiceTree();
        }


          public void iterativeTree(BinaryTree tree){
                Queue<BinaryTree> list = new LinkedList<>();
                list.add(tree);

              while (!list.isEmpty()) {
                  BinaryTree key = list.remove();
                  System.out.println(key.value);

                  if (key.left != null)
                      list.add(key.left);

                  if (key.right != null)
                      list.add(key.right);
              }
        }
    }
}