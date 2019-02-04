import java.util.ArrayList;
import java.util.List;

public class recursion{
  public static List<String> makeAllWords(int k, int maxLetter){
    List<String> output = new ArrayList<String>();
    // if(maxLetter == 0){
    //
    // } else{
    //   makeAllWords(k, maxLetter);
    // }
    // makeAllWordsHelper(k,"",output);
    return output;
  }

  public static void makeAllWordsHelper(int k, String word){
    if(k == 0){
      System.out.println(word);
    } else{
      makeAllWordsHelper(k - 1, word + "a");
    }
  }

  public static void main(String[] args) {
    makeAllWordsHelper(2, "");
  }
}
