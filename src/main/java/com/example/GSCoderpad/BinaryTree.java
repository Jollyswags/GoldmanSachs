package com.example.GSCoderpad;
//O(N)  O(N)
class Nodes
{
    int data;
    Nodes left, right, nextRight;

    // Helper function that allocates a new node
    // with the given data and NULL left and right
    // pointers.
    Nodes(int item)
    {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    public static Nodes root;

    // A utility function to get the sum
    // of values in tree with root as root
    static int sum(Nodes node) {
        if (node == null) {
            return 0;
        }
        return (sum(node.left) + node.data + sum(node.right));
    }

    // Returns 1 if sum property holds for
    // the given node and both of its children
    static int isSumTree(Nodes node) {
        int ls, rs;

        // If node is NULL or it's a leaf
        // node then return true
        if (node == null || (node.left == null && node.right == null)) {
            return 1;
        }

        // Get sum of nodes in left and
        // right subtrees
        ls = sum(node.left);
        rs = sum(node.right);

        // If the node and both of its
        // children satisfy the property
        // return 1 else 0
        if ((node.data == ls + rs) && isSumTree(node.left) == 1 && isSumTree(node.right) == 1) {
            return 1;
        }
        return 0;
    }

    // Driver code
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Nodes(26);
        tree.root.left = new Nodes(10);
        tree.root.right = new Nodes(3);
        tree.root.left.left = new Nodes(4);
        tree.root.left.right = new Nodes(6);
        tree.root.right.right = new Nodes(3);
        if (isSumTree(root) != 0) {
            System.out.println("The given tree is a SumTree");
        } else {
            System.out.println("The given tree is not a SumTree");
        }
    }
}
