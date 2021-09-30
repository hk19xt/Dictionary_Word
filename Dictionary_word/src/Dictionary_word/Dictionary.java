package Dictionary_word;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Search_Words {
    
    public String word;
    
    Map<String, Boolean> search = new HashMap();
    
    public boolean Search_Words(String user_string, List<String> dictionary){
        if(search.containsKey(user_string)){
            return true;
        }

        if(dictionary.contains(user_string)){
            return true;
        }

        int initial = 1;
        for(int first_element=0+initial; first_element<user_string.length()+initial; first_element++){

            word = user_string.substring(0, first_element);

            if(Search_Words(user_string.substring(first_element),dictionary)) {
                if (dictionary.contains(word)) {
                    search.put(user_string, true);
                    return true;
                }
            }
        }
        search.put(user_string, false);
        return false;
    }
}//Search_Words
