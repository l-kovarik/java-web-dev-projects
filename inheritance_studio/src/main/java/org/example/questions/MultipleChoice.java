package org.example.questions;


public class MultipleChoice extends Question {

    public MultipleChoice(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline = "Choose One:" + newline +
                getQuestion() + newline +
                getFormattedChoices();

    }

}
