import java.util.ArrayList;

public class Delimeters {
    private String openDel; 
    private String closeDel; 

    public Delimeters(String open, String close){
        openDel = open; 
        closeDel = close; 
    }

    public ArrayList<String> getDelimetersList (String[]tokens){
        ArrayList<String> delimeters = new ArrayList<String>(); 
        for (String temp : tokens){
            if (temp.equals(openDel) || temp.equals(closeDel)){
                delimeters.add(temp); 
            }
        }
        return delimeters; 
    }

    public boolean isBalanced(ArrayList<String> delimeters){
        int opens = 0; 
        int closes = 0; 
        for (String tem : delimeters){
            if (tem.equals(openDel)){
                opens++; 
            }
            if (tem.equals(closeDel)){
                closes++; 
            }
            if (closes > opens){
                return false; 
            }
        }
        return (opens == closes); 
    }
}
