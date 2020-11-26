package gr.projectFuture.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static void main(String[] args) {

        makeThingsRoll();

    }

    public static void makeThingsRoll() {
        List<String> text = CakeRecipe.getRecipeLines(); // gets the text input from CakeRecipe class
        Map<String, List<Integer>> wordMap = new HashMap();
        String[] words;

        for (int i = 0; i < text.size(); i++) { //text line counter
            words = text.get(i).split(" "); //split words of the line into an array
            for (int j = 0; j < words.length; j++) { //words counter
                if (!wordMap.containsKey(words[j])) { // if the word exists in the map
                    List<Integer> lines = new ArrayList(); // create the list for the lines number
                    lines.add(i + 1);//add the line we met the word for first time,+1 because we count from 0
                    for (int k = i + 1; k < text.size(); k++) { // rest lines counter
                        if (text.get(k).contains(words[j])) { // if k line contains our word then add it to the list,+1 because we count from 0
                            lines.add(k + 1);
                        }
                    }
                    wordMap.put(words[j], lines); //add the word and the lines seen in the map
                }
            }
        }

        //A for loop that displays the elements of the map
        System.out.println("WORDS       LINES");
        System.out.println("-----------------");
        for (String name : wordMap.keySet()) {
            List<Integer> values = wordMap.get(name);

            System.out.println(name + "       " + values.toString());
        }
    }
}
