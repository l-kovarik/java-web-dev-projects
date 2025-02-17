package launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a search term: ");
        String term = input.nextLine().toLowerCase();
       boolean searchTerm = quote.contains(term);

        input.close();

        System.out.println("Your " + term + " is contained in the String: " + searchTerm);
        System.out.println("Your " + term + " is located at the index: " + quote.indexOf(term) + ", and its length is: " + term.length());
        String modifiedSentence = quote.replace(term, "");
        System.out.println(modifiedSentence);

    }
}
