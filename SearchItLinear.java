import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.IOException;
public class SearchItLinear{

    public static void main (String[] args) throws IOException
    {
      List<Record> dir = new ArrayList<Record>();
      BufferedReader br = new BufferedReader(new FileReader("testdata"));
          String line;
          while ((line = br.readLine()) !=null){
              dir.add(new Record(line));
          }
          br.close();
      Iterator<Record> it = dir.iterator(); 
      Scanner scan = new Scanner(System.in);
      String query = scan.nextLine();
      Record found = null;
      while (it.hasNext()){
      Record rec = it.next();
      String name = rec.getName();
        if (query.equals(name)){
          found = rec;
          System.out.println(rec);
          break;
        }
      }
      if (found==null)
         System.out.println("Not Found");
    }
}
