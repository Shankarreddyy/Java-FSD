import java.util.*; 
import java.util.regex.*;       
public class EmailValidation{  
    public static void main(String args[]){  
        ArrayList<String> EmailList = new ArrayList<String>();   
        EmailList.add("noonecanstopyou#@domain.co.in");    
        EmailList.add(".noonecanstopyou@ahoo.com");
        EmailList.add("noonecanstopyou@domain.co.in"); 
        EmailList.add("noonecanstopyou@yaoo.com.");  
        EmailList.add("noonecanstopyou@domain.com"); 
        EmailList.add("noonecanstopyou@yahoo.c");  
        EmailList.add("noonecanstopyou.Raje@domain.com"); 
        EmailList.add("noonecanstopyou@yahoo.co..");   
        //Regular_Expression   
        String Regex = "^[\\w!#$%&'*+/=?`~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(Regex);  
        //Using for loop toIterate EmailList array list  
        for(String Email1 : EmailList){  
            //Creating instance object of matcher method  
            Matcher match = pattern.matcher(Email1);  
            System.out.println(Email1 +" : "+ match.matches()+"\n");  
        }  
    }  
}  
