import java.util.*;
import java.io.*;
/**
*Method which prints random list of names using Querygen class 
*@param args Unused
*@return void Main method
*@exception IOException
*@see IOException
*/
public class QuerygenMain{
  public static void main (String[]args) throws IOException{
    Querygen querygen = new Querygen();
    ArrayList<String> q = new ArrayList<String>();
    q = querygen.makeInput(20);
    Iterator<String> it = q.iterator();
    while (it.hasNext()){
        System.out.println(it.next());
    }

  }
}
