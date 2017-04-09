import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestRecord{

   Record record;

   @Before public void setUp(){
     record = new Record("44812 Wilderman Mountain, Vallejo|318.679.5603 x712|Abbott Alexandria");

   }


   @Test public void getNameTest(){
      Assert.assertEquals("Abbott Alexandria", record.getName());
      Assert.assertNotEquals("Zach", record.getName());
   }

   @Test public void getLineTest(){
     Assert.assertEquals("44812 Wilderman Mountain, Vallejo|318.679.5603 x712|Abbott Alexandria", record.getLine());
     Assert.assertNotEquals("44812 Wilderman Mountain, Vallejo|318.679.5603 x712|", record.getLine());
   }

   @Test public void toStringTest(){
     Assert.assertEquals("44812 Wilderman Mountain, Vallejo|318.679.5603 x712|Abbott Alexandria", record.toString());
     Assert.assertNotEquals("44812 Wilderman Mountain, Vallejo|318.679.5603 x712|", record.toString());
   }
}
