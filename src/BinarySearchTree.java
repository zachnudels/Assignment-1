/**
*Class toconstruct a BinarySearchTree
*
*@author Zach Nudelman
*@version 1.7
*@since 25-03-2017
*/
public class BinarySearchTree{

  private BinaryTreeNode root;
/**
*Creates a new BinarySearchTree and sets root to null
*@return Nothing
*/
  public BinarySearchTree(){
    root=null;
  }
/**
*Returns the root
*@param Nothing
*@return BinaryTreeNode
*/
    public BinaryTreeNode getRoot(){
    return this.root;
  }
/**
*Calls insert method with root as a parameter or inserts record as root if root == null
*@param data the Record to be inserted
*@return void calls insert(data,root)
*/
    public void insert(Record data){
    if (root == null){
      root = new BinaryTreeNode(data,null,null);
    }
    else
      insert (data, root);
    }
/**
*Inserts Record into correct place (alphabetically by First name) on BinarySearchTree
*@param data the Record to be inserted
*@param node Node to compare record with
*@return void Inserts Record into BinarySearchTree
*/
    public void insert(Record data, BinaryTreeNode node){
    String name = data.getName();
    if (name.compareTo((node.getData()).getName())<=0){
      if (node.getLeftNode() == null)
        node.setLeftNode(new BinaryTreeNode(data, null, null));
      else
        insert(data, node.getLeftNode());
      }
    else{
        if (node.getRightNode()==null)
          node.setRightNode(new BinaryTreeNode(data, null, null));
        else
          insert(data, node.getRightNode());
        }
    }
/**
*Calls find method with root as a parameter or returns null if root == null
*@param data Name of record to search for
*@return BinaryTreeNode  returns method with data and root as parameters
*/
    public BinaryTreeNode find(String data){
      if (root == null)
          return null;
      else
        return find(data,root);
    }
  /**
  *Calls insert method with root as a parameter or inserts record as root if root == null
  *@param name Name of record to search for
  *@param node Node to compare record with
  *@return BinaryTreeNode Returns node found 
  */
    public BinaryTreeNode find(String name, BinaryTreeNode node){
      if (name.compareTo((node.getData()).getName())==0){
        return node;}
      else if (name.compareTo((node.getData()).getName())<0){
        if (node.getLeftNode()==null)
          return null;
        else
          return find(name, node.getLeftNode());
        }
      else{
        if (node.getRightNode()==null)
          return null;
        else
          return find(name,node.getRightNode());
      }
    }
}
