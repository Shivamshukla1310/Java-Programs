/*You need to implement an undirected graph using an adjacency matrix. The program should allow the user to:

Input the number of vertices (N) and number of edges (E).
Enter E pairs of vertices (U, V) that represent edges between vertex U and V.
Print the adjacency matrix representation of the graph.
Input Format:
An integer N → Number of vertices.
An integer E → Number of edges.
E lines, each containing two integers U V representing an edge between vertex U and vertex V.
Output Format:
The adjacency matrix representation of the graph.
Constraints:
1 ≤ N ≤ 100
0 ≤ E ≤ N*(N-1)/2 (No self-loops and no parallel edges)
1 ≤ U, V ≤ N
For example:

Input	Result
4 3     0 1 0 1
1 2     1 0 1 0
2 3     0 1 0 0
4 1     1 0 0 0
*/

import java.util.Scanner;

public class GraphAdjMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int E = scanner.nextInt();

        int[][] adjMatrix = new int[N][N];

        for (int i = 0; i < E; i++) {
            int U = scanner.nextInt() - 1;
            int V = scanner.nextInt() - 1;
            adjMatrix[U][V] = 1;
            adjMatrix[V][U] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
