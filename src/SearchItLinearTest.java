import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.Iterator;
import java.io.IOException;

/**
* SearchItLinearTest finds the details of given names
* It creates an ArrayList populated with the details data
* It finds n random names from the list and creates a new list with these names .
* It then iterates over the list to find the details
*
*@author Zach Nudelman
*@version 1.7
*@since 25-03-2017
*/
public class SearchItLinearTest{
/**
*This is the main method
*@param args number of random names to find
*@return void Main method
*@exception IOException On input error
*@see IOException
*/
    public static void main (String[] args) throws IOException
    {
      // Creates an ArrayList populated with line from "testdata"
      List<Record> dir = new ArrayList<Record>();
      BufferedReader br = new BufferedReader(new FileReader("testdata"));
          String line;
          while ((line = br.readLine()) !=null){
              dir.add(new Record(line));
          }
          br.close();

    // Create random list of names sized n
      int n = Integer.parseInt(args[0]);
        ArrayList<String> queries = new ArrayList<String>(n);
        Querygen querygen = new Querygen();
        queries = querygen.makeInput(n);


// Search through linear data structure for each name
      Record found = null;
      for (int i=0; i<queries.size(); i++){
        String query = queries.get(i);
        for (int j=0;j<dir.size();j++){
          Record rec = dir.get(j);
          String name = rec.getName();
            if (query.equals(name)){
              found = rec;
              System.out.println(rec);
              break;
            }else{
               if(j==dir.size()-1)
                  System.out.println("Not Found");
            }
          }
        }
    }
}
