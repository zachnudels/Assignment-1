/*
*******************
*Record Class to Split data line into two attributes: name and line
*
*@author Zach Nudelman
*@version 1.0
*@since 29-03-2017
*
*/

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
