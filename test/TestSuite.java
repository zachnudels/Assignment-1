import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
* Test class agregator.
*
* @author Stephan Jamieson
* @version 16/2/2016
*
*/
@RunWith(Suite.class)
@Suite.SuiteClasses({
  TestRecord.class, TestBinaryTreeNode.class, TestBinarySearchTree.class, TestQueryGen.class })

public class TestSuite { /* Holder for above annotations. */}
