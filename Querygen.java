import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.File;
import java.nio.charset.Charset;

public class Querygen{

  public static void main(String[]args) throws IOException{
    // Input all records into a linear data structure - ArrayList
    List<Record> dir = new ArrayList<Record>();
    BufferedReader br = new BufferedReader(new FileReader("testdata"));
        String line;
        while ((line = br.readLine()) !=null){
            dir.add(new Record(line));
        }
        br.close();

      // Write new File
      File file = new File("queryfile.txt");

  // Input user defined n - number of data queries to generate
    Scanner scan = new Scanner(System.in);
    System.out.println("Input number of data queries");
    int n = scan.nextInt();

    //Iterate through n and save n random data objects (i.e., String name) into a textfile queryfile.txt
    for (int i=0;i<n+1;i++){
      Random rnd = new Random();
      String query = dir.get(i).getName();
      Files.write(file, query, Charset.forName("UTF-8"));
    }
  }
}
