import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.IOException;
public class SearchIt{

  public static void main(String[]args)throws IOException{
    BinarySearchTree bst = new BinarySearchTree();
    BufferedReader br = new BufferedReader(new FileReader("testdata"));
        String line;
        while ((line = br.readLine()) !=null){
            bst.insert(new Record(line));
        }
        br.close();
    Scanner scan = new Scanner(System.in);
    List<String> queries = new ArrayList<String>();
    System.out.println("Input queries. Type q to exit");
    String input = "";
    while (!input.equals("q")){
      input = scan.nextLine();
        queries.add(input);
    }
    queries.remove(queries.size()-1);
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
