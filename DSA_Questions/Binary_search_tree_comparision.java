/* You need to implement a program that:

Allows the user to input two binary trees.
Checks if the two trees are structurally identical (having the same shape).
Checks if the two trees are value identical (having the same shape and corresponding values).
Input Format:
First, enter the number of nodes in the first tree, followed by N1 space-separated integers representing its level-order traversal. Use -1 to represent null nodes.
Next, enter the number of nodes in the second tree, followed by N2 space-separated integers representing its level-order traversal.
Output Format:
Print "Structurally Identical" if the two trees have the same structure.
Print "Value Identical" if the trees are both structurally identical and have identical values.
If neither condition holds, print "Not Identical".
Constraints:
1 ≤ N1, N2 ≤ 1000
-10^5 ≤ Node Value ≤ 10^5
Trees are binary trees, not necessarily BSTs.
For example:

Input	         Result
7                Structurally Identical 
1 2 3 4 5 -1 6
7
7 2 3 4 5 -1 6

*/


import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTreeComparison {

    static Node buildTree(int[] arr) {
        if (arr.length == 0) return null;
        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < arr.length) {
            Node current = queue.poll();
            if (arr[i] != -1) {
                current.left = new Node(arr[i]);
                queue.add(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != -1) {
                current.right = new Node(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    static boolean areStructurallyIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return areStructurallyIdentical(root1.left, root2.left) && areStructurallyIdentical(root1.right, root2.right);
    }

    static boolean areValueIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return root1.data == root2.data && areValueIdentical(root1.left, root2.left) && areValueIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt();
        int[] tree1 = new int[N1];
        for (int i = 0; i < N1; i++) {
            tree1[i] = scanner.nextInt();
        }

        int N2 = scanner.nextInt();
        int[] tree2 = new int[N2];
        for (int i = 0; i < N2; i++) {
            tree2[i] = scanner.nextInt();
        }

        Node root1 = buildTree(tree1);
        Node root2 = buildTree(tree2);

        if (areValueIdentical(root1, root2)) {
            System.out.println("Value Identical");
        } else if (areStructurallyIdentical(root1, root2)) {
            System.out.println("Structurally Identical");
        } else {
            System.out.println("Not Identical");
        }

        scanner.close();
    }
}
