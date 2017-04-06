import java.util.*;
import java.io.*;
import java.nio.*;

public class Querygen{

public Querygen(){}

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

      // Write new File
      // File file = new File("queryfile.txt");

  // // Input user defined n - number of data queries to generate
  //   Scanner scan = new Scanner(System.in);
  //   System.out.println("Input number of data queries");
  //   int n = scan.nextInt();

    //Iterate through dir and save n random data objects (i.e., String name) to ArrayList queries
    ArrayList<String> queries = new ArrayList<String>();
    for (int i=0;i<n;i++){
      Random rnd = new Random();
      int num = rnd.nextInt(10000);
      queries.add(dir.get(num).getName());
    }
    // // Write files to queryfile.txt
    // Iterator<String> it = queries.iterator();
    // Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
    // while (it.hasNext()){
    //   writer.write(it.next());
    //   writer.write('\n');
    //   // writer.write(/n);
    // }
    // writer.close();


    return queries;
  }

}
