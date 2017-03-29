public class BinaryTreeNode{
  private Record data;
  private BinaryTreeNode leftNode;
  private BinaryTreeNode rightNode;

  public BinaryTreeNode(Record data){
    this.data=data;
    this.leftNode = null;
    this.rightNode=null;
  }

  public BinaryTreeNode(Record data, BinaryTreeNode leftNode, BinaryTreeNode rightNode){
    this.data=data;
    this.leftNode=leftNode;
    this.rightNode=rightNode;
  }

  public Record getData(){
    return this.data;
  }

  public BinaryTreeNode getLeftNode(){
    return this.leftNode;
  }

  public BinaryTreeNode getRightNode(){
    return this.rightNode;
  }

  public void setData(Record data){
    this.data=data;
  }

  public void setLeftNode(BinaryTreeNode leftNode){
    this.leftNode=leftNode;
  }

  public void setRightNode(BinaryTreeNode rightNode){
    this.rightNode=rightNode;
  }


}
