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

public class Main {
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