import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEX{
    public static void main(String[] args){
       Pattern pattern = pattern.compile("hello" , Pattern.CASE_INSENSITIVE);// i dont understand what they have done in this line and below it
       Matcher matcher = pattern.matcher("hello");
       boolean matchfound = matcher.find();
       if(matchfound){
           System.out.println("Match found");
       }else{
           System.out.println("Match not found");
    }
}
}