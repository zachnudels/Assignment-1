public class PrintIt{

  public void visit ( BinaryTreeNode<dataType> node )
  {
     System.out.println (node.getData());
  }

  public void inOrder ()
  {
     inOrder (root);
  }
  public void inOrder ( BinaryTreeNode<dataType> node )
  {
     if (node != null)
     {
        inOrder (node.getLeftNode());
        visit (node);
        inOrder (node.getRightNode());
     }
  }

  public static void main (String[]args){

    BinarySearchTree bst = new BinarySearchTree();
    BufferedReader br = new BufferedReader(new FileReader("testdata"));
    String line;
        while ((line = br.readLine()) !=null){
            bst.insert(new Record(line));
        }
    br.close();

    bst.inOrder();




  }
}
