/**
*Class to construct BinaryTreeNode
*
*@author Zach Nudelman
*@version 1.0
*@since 29-03-2017
*/
public class BinaryTreeNode{
  private Record data;
  private BinaryTreeNode leftNode;
  private BinaryTreeNode rightNode;

/**
*Creates a new BinaryTreeNode with Record and null nodes
*@return Nothing Constructor
*@param data Record to instantiate Node with
*/
  public BinaryTreeNode(Record data){
    this.data=data;
    this.leftNode = null;
    this.rightNode=null;
  }
/**
*Creates a new BinaryTreeNode with Record and nodes as null
*@return Nothing
*@param Nothing
*/
  public BinaryTreeNode(){
    this(null,null,null);
  }
/**
*Creates a new BinaryTreeNode with Record and null nodes
*@return Nothing Constructor
*@param data Record to instantiate Node with
*@param leftNode left child to instatiate node with
*@param rightNode right child to instatiate node with
*/
  public BinaryTreeNode(Record data, BinaryTreeNode leftNode, BinaryTreeNode rightNode){
    this.data=data;
    this.leftNode=leftNode;
    this.rightNode=rightNode;
  }
/**
*Retrieves data
*@return Record retrieved
*/
  public Record getData(){
    return this.data;
  }
/**
*Retrieves leftNode
*@return BinaryTreeNode retrieved
*/
  public BinaryTreeNode getLeftNode(){
    return this.leftNode;
  }
/**
*Retrieves rightNode
*@return BinaryTreeNode retrieved
*/
  public BinaryTreeNode getRightNode(){
    return this.rightNode;
  }
/**
*Sets data with parameter
*@param data to set
*@return void
*/
  public void setData(Record data){
    this.data=data;
  }
/**
*Sets leftNode with parameter
*@param leftNode to set
*@return void
*/
  public void setLeftNode(BinaryTreeNode leftNode){
    this.leftNode=leftNode;
  }
/**
*Sets rightNode with parameter
*@param rightNode to set
*@return void
  */  public void setRightNode(BinaryTreeNode rightNode){
    this.rightNode=rightNode;
  }


}
