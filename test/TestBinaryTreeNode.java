import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBinaryTreeNode{

   Record record;
   BinaryTreeNode node1;
   BinaryTreeNode node2;

   @Before public void setUp(){
     record = new Record("44812 Wilderman Mountain, Vallejo|318.679.5603 x712|Abbott Alexandria");
     node1 = new BinaryTreeNode();
     node2 =new BinaryTreeNode();

   }

   @Test public void DataTest(){
      node1.setData(record);
      Assert.assertEquals(record, node1.getData());
      Assert.assertNotEquals("Zach", node1.getData());
   }

   @Test public void leftNodeTest(){
     node1 =new BinaryTreeNode();
     node1.setLeftNode(node2);
     Assert.assertEquals(node2, node1.getLeftNode());
     Assert.assertNotEquals(node2, node1.getRightNode());
   }

   @Test public void rightNodeTest(){
     node1 =new BinaryTreeNode();
     node2 =new BinaryTreeNode();
     node1.setRightNode(node2);
     Assert.assertEquals(node2, node1.getRightNode());
     Assert.assertNotEquals(node2, node1.getLeftNode());
    }
}
