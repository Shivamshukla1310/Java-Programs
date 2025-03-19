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