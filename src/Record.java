import java.util.*;
/*
*******************
*Record Class to Split data line into two attributes: name and line
*
*@author Zach Nudelman
*@version 1.0
*@since 29-03-2017
*
*/
public class Record{
    private String line;
    private String name;
/**
*Creates a new Record with attributes line and name
*@return Nothing
*@param line String to instantiate node with
*/
    public Record(String line){
    this.line=line;
    name = line.substring(line.lastIndexOf("|")+1);
    }
/**
*Retrieves name
*@return String
*@param nothing
*/
    public String getName(){
      return this.name;
    }
/**
*Retrieves line
*@return String
*@param nothing
*/
      public String getLine(){
      return this.line;
    }
/**
*toString method
*@return String
*@param nothing
*/
    public String toString(){
      return this.line;
    }






}
