import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.IOException;
/**
* PrintIt prints out a list of records in lexical order
*
*@author Zach Nudelman
*@version 1.0
*@since 29-03-2017
*/
public class PrintIt{
/**
*Prints data of node
*@return void
*@param node Node which data must be printed
*/
  public void visit ( BinaryTreeNode node )
  {
     System.out.println (node.getData());
  }
/**
*Prints BinarySearchTree in lexical order
*@return void
*@param bst Tree to be printed out
*/
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
/**
*This is the main method
*@param args Unused
*@return void Main method
*@exception IOException On input error
*@see IOException
*/
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
