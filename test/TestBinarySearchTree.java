import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class TestBinarySearchTree{

   BinarySearchTree bst;
   Record record1;
   BinaryTreeNode node1;
   Record record2;
   BinaryTreeNode node2;
   Record record3;
   Record record4;
   BinaryTreeNode node3;


   @Before public void setUp(){
     record1 = new Record("44812 Wilderman Mountain, Vallejo|318.679.5603 x712|Abbott Alexandria");
     record2 = new Record("17296 Elta Crossroad #362, Newport Beach|516-835-0116|Abbott Leann");
     record3 = new Record("03707 Botsford Fork, Lima|489-848-7299|Abbott Alec");
     record4 = new Record("76400 Barton Fields #044, Cerritos|507.340.1186|Abbott Aled");

     bst = new BinarySearchTree();

   }

   @After public void tearDown(){
     record1=null;
     record2=null;
     record3=null;
     record4=null;
     bst=null;
   }

   @Test public void getRootTest(){

      Assert.assertTrue(null == bst.getRoot());
      Assert.assertFalse(null != bst.getRoot());
   }

   @Test public void insertTest(){
     bst.insert(record1);
     bst.insert(record2);
     bst.insert(record3);
     bst.insert(record4);
     Assert.assertTrue(record1==(bst.getRoot()).getData());
     Assert.assertFalse(record2 ==(bst.getRoot()).getData());
     Assert.assertTrue(record3==((bst.getRoot()).getLeftNode().getData()));
     Assert.assertTrue(record4==(((bst.getRoot()).getLeftNode()).getRightNode().getData()));
   }

   @Test public void findTest(){
     Assert.assertTrue(null==bst.find("Abbot"));
     bst.insert(record1);
     bst.insert(record2);
     bst.insert(record3);
     node1 = bst.find("Abbott Alexandria");
     node2 = bst.find("Abbott Leann");
     Assert.assertEquals(null,bst.find("Zach"));
     Assert.assertEquals(null,bst.find("AA"));
     Assert.assertEquals(node1, bst.getRoot());
     Assert.assertNotEquals(node2, bst.getRoot());
     Assert.assertEquals(bst.find("Abbott Alec"),(bst.getRoot()).getLeftNode());
   }
}
