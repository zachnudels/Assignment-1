import java.util.*;
import java.io.*;
public class SearchIt{

  public static void main(int args)throws IOException{

    BinarySearchTree bst = new BinarySearchTree(); // Create BST object
    BufferedReader br = new BufferedReader(new FileReader("testdata")); //Open testdata

// Write testdata to bst
        String line;
        //int count=0;
        while ((line = br.readLine()) !=null){
            bst.insert(new Record(line));
            //count++;
        }
        br.close();
// Create random list of names sized n
    //System.out.println(count);


    // Scanner scan = new Scanner(System.in);
  //  System.out.println("Enter size: n");

  int n = args;

    ArrayList<String> queries = new ArrayList<String>(n);
    // queries.add("1");
    // queries.add("2");
    Querygen querygen = new Querygen();
    queries = querygen.makeInput(n);


  // If using as a user, not a test
    // System.out.println("Input queries. Type q to exit");
    // String input = "";
    // while (!input.equals("q")){
    //   input = scan.nextLine();
    //     queries.add(input);
    // }
    // queries.remove(queries.size()-1);

// Iterates over bst and prints out Line of data for given name
    for (int i=0; i<queries.size(); i++){
      String query = queries.get(i);
      BinaryTreeNode node = bst.find(query);
      if (node == null)
        System.out.println("Not found");
      else
        System.out.println((node.getData()).getLine());
    }

  }
}
