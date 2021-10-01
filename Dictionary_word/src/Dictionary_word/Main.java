package Dictionary_word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*This class is the main class.
The user input string can be changed in the hardcoded line. The dictionary list also can ba inserted by the user.
After compiling the program, the output will be seen whether the user string can be broken into each words reserved in the dictionary list. */ 

public class Main {
    public static void main(String[] args){
        Search_Words SW = new Search_Words(); 
        String user_string = "LOVEISPATIENT"; //The user can change the user input string here.
        boolean bool;
        List<String> dictionary_list = new ArrayList<String>(); //Initialize the list of dictionary.
           dictionary_list = Arrays.asList("LOVE","IS","PATIENT"); //The user can change the dictionary list here.
        bool = SW.Search_Words(user_string, dictionary_list);
        System.out.println(bool);
    }
}//Main
