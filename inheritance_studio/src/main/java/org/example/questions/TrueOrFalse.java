package org.example.questions;

import org.example.questions.Choice;
import org.example.questions.Question;

public class TrueOrFalse extends Question {

    public TrueOrFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline = "True or False:" + newline +
                getQuestion() + newline +
                getFormattedChoices();

    }

}
