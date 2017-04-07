import java.util.*;
import java.io.*;
public class SearchIt{

  public static void main (String[] args) throws IOException{


// Initialise BST and open testdata file
    BinarySearchTree bst = new BinarySearchTree(); // Create BST object
    BufferedReader br = new BufferedReader(new FileReader("testdata")); //Open testdata

// Write testdata to bst
        String line;
        while ((line = br.readLine()) !=null){
            bst.insert(new Record(line));
        }
        br.close();

// Create random list of names sized n

  int n = Integer.parseInt(args[0]);
    ArrayList<String> queries = new ArrayList<String>(n);
    Querygen querygen = new Querygen();
    queries = querygen.makeInput(n);

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
