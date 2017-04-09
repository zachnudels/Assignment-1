import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.Iterator;
import java.io.IOException;

/**
* SearchItLinear finds the details of given names
* It creates an ArrayList populated with the details data
* It then iterates over the ArrayList to find the details
* which are provided by a queryfile
* It then iterates over the list to find the details
*
*@author Zach Nudelman
*@version 1.7
*@since 25-03-2017
*/
public class SearchItLinear{
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

      //Read query file and put names into an ArrayList
          BufferedReader br2 = new BufferedReader(new FileReader("query.txt"));
          ArrayList<String> queries = new ArrayList<String>();
          while ((line = br2.readLine())!=null){
            queries.add(line);
          }

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
