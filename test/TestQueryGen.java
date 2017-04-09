import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.*;

public class TestQueryGen{

   Querygen querygen;


   @Test public void makeInputTest() throws IOException{
     ArrayList<String> queries = new ArrayList<String>();
     querygen = new Querygen();
     queries = querygen.makeInput(10);
     Assert.assertTrue(queries.size()==10);
     Assert.assertFalse(queries.size()<10);
     Assert.assertFalse(queries.size()>10);

   }

}
