package exercises;

import java.util.Scanner;

public class SearchingAliceAgain {
    public static void main(String[] args){
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures" +
                " or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for?");
        String term = input.nextLine();
        if(firstSentence.toLowerCase().contains(term.toLowerCase())){
            int startingIndex = firstSentence.toLowerCase().indexOf(term.toLowerCase());
            System.out.printf("The search term was found at index %1$d, and has a length of %2$d.\n", startingIndex, term.length());
            String newSentence = firstSentence.substring(0, startingIndex) + firstSentence.substring(startingIndex + term.length());
            System.out.println("The sentence now reads: \"" + newSentence +"\"");
        } else {
            System.out.println("That term wasn't found in the sentence.");
        }
    }
}
