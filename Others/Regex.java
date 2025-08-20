import java.util.regex.*;
public class Regex {
    public static void main(String[] args){
        // String s="abcdefabcd";
        // Pattern p=Pattern.compile("abcd");
        // Matcher m=p.matcher(s);
        // while(m.find()){
        //     System.out.println(m.group());
        // }
        // System.out.println("de".matches(s));
        //Head - ^  End - $
        String s="abcSKD234_#^@";
        Pattern p=Pattern.compile("[A-Za-z0-9]");
        Matcher m=p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
            
        }
    }
}
