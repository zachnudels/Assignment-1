import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.IOException;
public class PrintIt{

  public void visit ( BinaryTreeNode node )
  {
     System.out.println (node.getData());
  }

  public void inOrder (BinarySearchTree bst)
  {
     inOrder (bst.getRoot());
  }
  public void inOrder ( BinaryTreeNode node )
  {
     if (node != null)
     {
        inOrder (node.getLeftNode());
        visit (node);
        inOrder (node.getRightNode());
     }
  }

  public static void main (String[]args) throws IOException{

    PrintIt prin = new PrintIt();
    BinarySearchTree bst = new BinarySearchTree();
    BufferedReader br = new BufferedReader(new FileReader("testdata"));
    String line;
        while ((line = br.readLine()) !=null){
            bst.insert(new Record(line));
        }
    br.close();

    prin.inOrder(bst);




  }
}
