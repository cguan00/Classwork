import java.util.ArrayList;
import java.util.List;

public class recursion{
  public static List<String> makeAllWords(int k, int maxLetter){
    List<String> output = new ArrayList<String>();
    makeAllWordsHelper(k, "", maxLetter, output);
    return output;
  }

  public static void makeAllWordsHelper(int k, String word, int maxLetter, List<String> words){
    if(k == 0){
      words.add(word);
    } else{
      for(int i = 0; i < maxLetter; i++){
        makeAllWordsHelper(k - 1, word + (char)('a' + i), maxLetter, words);
      }
    }
  }

  public static void main(String args[]){
    System.out.println(makeAllWords(1, 26));
    System.out.println("");
    System.out.println("");
    System.out.println("");


    System.out.println(makeAllWords(2, 26));
    System.out.println("");
    System.out.println("");
    System.out.println("");


    System.out.println(makeAllWords(3, 3));
    System.out.println("");
    System.out.println("");
    System.out.println("");

    System.out.println(makeAllWords(4, 2));
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
}
