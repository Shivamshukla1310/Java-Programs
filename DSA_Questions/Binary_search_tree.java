/* You need to implement a Binary Search Tree (BST) that allows the user to perform the following operations:

Insert X → Insert an element X into the BST.
Delete X → Delete the element X from the BST. If X is not present, do nothing.
Height → Print the height of the BST.
Inorder → Display the tree using Inorder Traversal (Left, Root, Right).
The program should allow multiple operations at runtime, and the user can input commands interactively.

Input Format:
An integer N, representing the number of operations.
Each of the next N lines contains an operation:
"1 X" → Insert X into the BST.
"2 X" → Delete X from the BST.
"3" → Print the height of the BST.
"4" → Print the Inorder traversal of the BST.
Output Format:
Print messages based on operations:
The height of the BST when queried.
The Inorder traversal of the BST.
For example:

Input	Result
7       1
1 50    20 50 70
1 30
1 70
1 20
2 30
3
4

20 50 70
*/

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BST {
    Node root;

    BST() {
        this.root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    void delete(int data) {
        root = deleteRec(root, data);
    }

    Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    int height() {
        return heightRec(root);
    }

    int heightRec(Node root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = heightRec(root.left);
        int rightHeight = heightRec(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

public class Binary_search_tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST();
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int operation = scanner.nextInt();

            if (operation == 1) {
                int X = scanner.nextInt();
                bst.insert(X);
            } else if (operation == 2) {
                int X = scanner.nextInt();
                bst.delete(X);
            } else if (operation == 3) {
                System.out.println(bst.height());
            } else if (operation == 4) {
                bst.inorder();
            }
        }

        scanner.close();
    }
}