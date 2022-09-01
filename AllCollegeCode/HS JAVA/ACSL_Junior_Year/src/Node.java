class Node {  //standard Binary Tree node
    Object data;
    Node left;
    Node right;
    int xpos;  //stores x and y position of the node in the tree
    int ypos;  
    int sum;
    Node(String x, Node l, Node r) {
      left = l;
      right = r;
      data = (Object) x;
         }
   // I would make a toString method to print data
   // print by casting to a String 

}
