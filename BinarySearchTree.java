public class BinarySearchTree{

  private BinaryTreeNode root;

  public BinarySearchTree(){
    root=null;
  }

  public void insert(Record data){
    if (root == null){
      root = new BinaryTreeNode(data,null,null);
    }
    else
      insert (data, root);
    }

  public void insert(Record data, BinaryTreeNode node){
    String name = data.getName();
    if (name.compareTo((node.getData()).getName())<=0){
      if (node.getLeftNode() == null)
        node.setLeftNode(new BinaryTreeNode(data, null, null));
      else
        insert(data,node.getLeftNode());
      }
    else{
        if (node.getRightNode()==null)
          node.setRightNode(new BinaryTreeNode(data, node, node));
        else
          insert(data,node.getRightNode());
        }
    }

    public BinaryTreeNode find(Record data){
      if (root == null)
          return null;
      else
        return find(data,root);
    }

    public BinaryTreeNode find(Record data, BinaryTreeNode node){
      String name = data.getName();
      if (name.compareTo((node.getData()).getName())==0){
        return node;}
      else if (name.compareTo((node.getData()).getName())<0){
        if (node.getLeftNode()==null)
          return null;
        else
          return find(data, node.getLeftNode());
        }
      else{
        if (node.getRightNode()==null)
          return null;
        else
          return find(data,node.getRightNode());
      }
    }
}
