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

    /*Modify the array such that:
   *1. Only the indices from start to end inclusive are considered in range
   *2. A random index from start to end inclusive is chosen, the corresponding
   *   element is designated the pivot element.
   *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
   *4. all elements in range that are larger than the pivot element are placed after the pivot element.
   *@return the index of the final position of the pivot element.
   */
   public static int partition ( int [] data, int start, int end){
     return 0;


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
