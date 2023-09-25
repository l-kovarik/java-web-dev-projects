package org.example;

import java.util.ArrayList;

public abstract class Question {
    public String questionText;
    public String questionType;
    ArrayList<String> allAnswers = new ArrayList<>();

    public Question(String questionText, String questionType, ArrayList<String> allAnswers) {
        this.questionText = questionText;
        this.questionType = questionType;
        this.allAnswers = allAnswers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public ArrayList<String> getAllAnswers() {
        return allAnswers;
    }

    public void setAllAnswers(ArrayList<String> allAnswers) {
        this.allAnswers = allAnswers;
    }
}
