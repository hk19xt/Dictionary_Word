package Dictionary_word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Search_Words SW = new Search_Words();
        String user_string = "LOVEISPATIENT";
        boolean bool;
        List<String> dictionary_list = new ArrayList<String>();
           dictionary_list = Arrays.asList("LOVE","IS","PATIENT");
        bool = SW.Search_Words(user_string, dictionary_list);
        System.out.println(bool);
    }
}
