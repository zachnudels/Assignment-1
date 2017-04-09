import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBinarySearchTree{

   BinarySearchTree bst;
   Record record1;
   BinaryTreeNode node1;
   Record record2;
   BinaryTreeNode node2;


   @Before public void setUp(){
     record1 = new Record("44812 Wilderman Mountain, Vallejo|318.679.5603 x712|Abbott Alexandria");
     record2 = new Record("17296 Elta Crossroad #362, Newport Beach|516-835-0116|Abbott Leann");
     bst = new BinarySearchTree();

   }

   @Test public void getRootTest(){

      Assert.assertTrue(null == bst.getRoot());
      Assert.assertFalse(null != bst.getRoot());
   }

   @Test public void insertTest(){
     bst.insert(record1);
     bst.insert(record2);
     Assert.assertTrue(record1==(bst.getRoot()).getData());
     Assert.assertFalse(record2 ==(bst.getRoot()).getData());
   }

   @Test public void findTest(){
     bst.insert(record1);
     bst.insert(record2);
     node1 = bst.find("Abbott Alexandria");
     node2 = bst.find("Abbott Leann");
     Assert.assertEquals(node1, bst.getRoot());
     Assert.assertNotEquals(node2, bst.getRoot());
   }
}
