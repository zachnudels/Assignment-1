public class BinaryTreeNode<T>{
  private T data;
  private BinaryTreeNode<T> leftNode;
  private BinaryTreeNode<T> rightNode;

  public BinaryTreeNode(T data){
    this.data=data;
    this.leftNode = null;
    this.rightNode=null;
  }

  public BinaryTreeNode(T data, BinaryTreeNode<T> leftNode, BinaryTreeNode<T> rightNode){
    this.data=data;
    this.leftNode=leftNode;
    this.rightNode=rightNode;
  }

  public T getData(){
    return this.data;
  }

  public BinaryTreeNode<T> getleftNode(){
    return this.leftNode;
  }

  public BinaryTreeNode<T> getrightNode(){
    return this.rightNode;
  }


}
