import java.util.*;
public class Record{
    private String line;
    private String name;

    public Record(String line){
    this.line=line;
    name= line.substring(line.lastIndexOf("|")+1);
    }

    public String getName(){
      return this.name;
    }

    public String getLine(){
      return this.line;
    }

    public String toString(){
      return this.line;
    }






}
