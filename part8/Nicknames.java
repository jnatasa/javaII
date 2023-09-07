
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap <String, String> nicknames = new HashMap<>();
        
        nicknames.put("matthews ", "matt");
        nicknames.put("michaels ", "mix");
        nicknames.put("arthurs ", "artie");
        
        
        System.out.println(nicknames.get("matthews "));
    }

}
