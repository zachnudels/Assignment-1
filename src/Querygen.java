import java.util.*;
import java.io.*;
import java.nio.*;
/**
*Class to create a random list of names
*
*@author Zach Nudelman
*@version 1.0
*@since 05-04-2017
*/
public class Querygen{

public Querygen(){}
/**
*Method which makes random list
*@param n number of lines to construct
*@return ArrayList ArrayList of queries
*@exception IOException
*@see IOException
*/
  public ArrayList makeInput(int n)throws IOException{

    // Input all records into a linear data structure - ArrayList
    List<Record> dir = new ArrayList<Record>();
    FileReader fr = new FileReader("testdata");
    BufferedReader br = new BufferedReader(new FileReader("testdata"));
        String line;
        while ((line = br.readLine()) !=null){
            dir.add(new Record(line));
        }
        br.close();

    //Iterate through dir and save n random data objects (i.e., String name) to ArrayList queries
    ArrayList<String> queries = new ArrayList<String>();
    for (int i=0;i<n;i++){
      Random rnd = new Random();
      int num = rnd.nextInt(10000);
      queries.add(dir.get(num).getName());
    }
    return queries;
  }

}
