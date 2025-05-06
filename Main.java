import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        String[] tokens = {"(", "x + y", ")", " * 5"}; 
        Delimeters a = new Delimeters("(", ")"); 
        System.out.println(a.getDelimetersList(tokens));
        String[] tokensb = {"<q>", "yy", "</q>", "zz", "</q>"}; 
        Delimeters b = new Delimeters("<q>", "</q>"); 
        System.out.println(b.getDelimetersList(tokensb));
        String  open = "<sup>"; 
        String close = "</sup>"; 
        a = new Delimeters(open, close); 
        ArrayList<String> delimiters = new ArrayList<String>(); 
        String[] delims = {open, open, close, open, close, close}; 
        for (String delim : delims){
            delimiters.add(delim); 
        }
        System.out.println(a.isBalanced(delimiters));
        String[] delimsb = {open, close, close, open}; 
        delimiters = new ArrayList<String>(); 
        for (String delimb : delimsb){
            delimiters.add(delimb); 
        }
        System.out.println(a.isBalanced(delimiters));
        delimiters = new ArrayList<String>(); 
        delimiters.add(close); 
        System.out.println(a.isBalanced(delimiters));
        delimiters = new ArrayList<String>(); 
        delimiters.add(open); 
        delimiters.add(open); 
        delimiters.add(close); 
        System.out.println(a.isBalanced(delimiters));
    }
}
