package org.example;

import org.example.questions.*;

public class QuizRunner {

    //create quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        //create questions
        String q1 = "Which of the following books are by Jane Austen?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Jane Eyre"),
                new Choice("Pride and Prejudice", true),
                new Choice("Wives and Daughters"),
                new Choice("Mansfield Park", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The most-published author of all time is Agatha Christie.";
        Choice[] q2Choices = new Choice[]{
                new Choice("True", true),
                new Choice("False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "Which poem did history-making poet Amanda Gorman recite at the U.S. presidential election in 2021?";
        Choice[] q3Choices = new Choice[] {
                new Choice("The Hill We Climb", true),
                new Choice ("The Miracle of Morning"),
                new Choice ("We Rise"),
                new Choice ("New Day's Lyric")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        //add questions to the quiz

        quiz.addQuestions(new Question[] { question1, question2, question3 });

        // interact with user: run quiz, give score
        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline = "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks!" + newline);

    }
}
