package com.example.GSCoderpad;

import java.util.Stack;
//O(N) O(N)
class Nodess
{
    int data;
    Nodess leftChild;
    Nodess rightChild;
    Nodess(int data)
    {
        this.data = data;
    }
}
public class BTZigzagTraversal {
    Nodess rootNode;
    public void printZigZagTraversal() {

        // if null then return
        if (rootNode == null) {
            return;
        }

        // declare two stacks
        Stack<Nodess> currentLevel = new Stack<>();
        Stack<Nodess> nextLevel = new Stack<>();

        // push the root
        currentLevel.push(rootNode);
        boolean leftToRight = true;

        // check if stack is empty
        while (!currentLevel.isEmpty()) {

            // pop out of stack
            Nodess node = currentLevel.pop();

            // print the data in it
            System.out.print(node.data + " ");

            // store data according to current
            // order.
            if (leftToRight) {
                if (node.leftChild != null) {
                    nextLevel.push(node.leftChild);
                }

                if (node.rightChild != null) {
                    nextLevel.push(node.rightChild);
                }
            }
            else {
                if (node.rightChild != null) {
                    nextLevel.push(node.rightChild);
                }

                if (node.leftChild != null) {
                    nextLevel.push(node.leftChild);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Nodess> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
    public static void main(String[] args)
    {
        BTZigzagTraversal tree = new BTZigzagTraversal();
        tree.rootNode = new Nodess(1);
        tree.rootNode.leftChild = new Nodess(2);
        tree.rootNode.rightChild = new Nodess(3);
        tree.rootNode.leftChild.leftChild = new Nodess(7);
        tree.rootNode.leftChild.rightChild = new Nodess(6);
        tree.rootNode.rightChild.leftChild = new Nodess(5);
        tree.rootNode.rightChild.rightChild = new Nodess(4);

        System.out.println("ZigZag Order traversal of binary tree is");
        tree.printZigZagTraversal();
    }
}






