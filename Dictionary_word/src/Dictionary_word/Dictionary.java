package Dictionary_word;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*This class is the implementation class. 
The user input string and the dictionary list will be inserted through the main class. 
The for loop will check whether the input string can be separated by words reserved in the dictionary list. */

public class Search_Words {
    
    public String word;
    
    Map<String, Boolean> search = new HashMap(); //We will reserve the result, whether it is true or false, using the hash map.
    
    public boolean Search_Words(String user_string, List<String> dictionary){
        if(search.containsKey(user_string)){ //If the search map already has the words, then return true.
            return true;
        }

        if(dictionary.contains(user_string)){ //If the dictionary list contains the user string, then return true.
            return true;
        }

        int initial = 1;
        /*This for loop is checking whether the word is in the dictionary and reserve the boolean results in the search map. */
        for(int first_element=0+initial; first_element<user_string.length()+initial; first_element++){
            //The each word searching starts from the first element up to the last element of the user string.
            word = user_string.substring(0, first_element);
            //There are two conditions should be checked.
            // 1) whether the partial word is in the dictionary,
            // 2) whether the dictionary contains the word in the dictionary.
            if(Search_Words(user_string.substring(first_element),dictionary)) {
                if (dictionary.contains(word)) { //If the two conditions are satisfied, then
                    search.put(user_string, true); // put the result into the search map.
                    return true; 
                }
            }
        }
        search.put(user_string, false); //If the word cannot be found in the dictionary, then put the result into the search map.
        return false; //But, the return false.
    }
}//Search_Words
