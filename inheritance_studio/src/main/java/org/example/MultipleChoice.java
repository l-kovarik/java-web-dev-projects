package org.example;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    public String questionText;
    public String correctAnswer;
    public double questionPoints;


    @Override
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void getCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public double getQuestionPoints() {
        return questionPoints;
    }

    public void setQuestionPoints(double questionPoints) {
        this.questionPoints = questionPoints;
    }

    public String getUserAnswer() {
        return userAnswer;
    }


    public MultipleChoice(String questionText, String questionType, ArrayList<String> allAnswers, String userAnswer, String correctAnswer, double questionPoints) {
        super(questionText, questionType, allAnswers);
        this.userAnswer = userAnswer;
        this.correctAnswer = correctAnswer;
        this.questionPoints = questionPoints;





    }



    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
