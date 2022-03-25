import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEX{
    public static void main(String[] args){
       Pattern logic = logic.compile("hello" , Pattern.CASE_INSENSITIVE);
       Matcher matcher = logic.matcher("hello");
       boolean matchfound = matcher.find();
       if(matchfound){
           System.out.println("Match found");
       }else{
           System.out.println("Match not found");
    }
}
}