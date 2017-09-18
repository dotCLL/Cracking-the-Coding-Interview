import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Trees_CheckBinarySearchTree {
  /*
  Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.
  The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
  */
  // Outline
  // Return whether a binary search tree is valid.
  // Algorithm
  // Go down the tree and check whether teh data of a given node is within expected ranges.
  // To create these ranges start them as the max values.
  // Then on traversal update max to be the maxmimum encountered on the left sub tree
  // and the min to be the minimum encountered on the right sub tree.
  // Input
  // Node
  // Output
  // Boolean
  boolean checkBST(Node root) {
    return checkTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  boolean checkTree(Node n, int min, int max) {
    if (n == null) {
      return true;
    } else if ((n.data <= min) || (n.data >= max)) {
      return false;
    } else {
      return (checkTree(n.left, min, n.data) && checkTree(n.right, n.data, max));
    }
  }
}
