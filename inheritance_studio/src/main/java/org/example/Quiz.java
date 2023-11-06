package org.example;

import org.example.questions.Choice;
import org.example.questions.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {

    private final ArrayList<Question> questions = new ArrayList<>();

    private int numCorrect = 0;

    //default constructor is fine

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Question[] questionArray) {
        Collections.addAll(questions, questionArray);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        for (Question question : questions) {
            //print question for user
            System.out.println(question);

            //get and validate responses
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;
            while (i < question.getMaxResponses()) {
                String userResponse;

                //validate
                do {
                    System.out.println("Please enter a number: ");
                    userResponse = input.nextLine();
                } while (question.isInvalid(userResponse));

                //Evaluate
                int userRespNum = Integer.parseInt(userResponse);
                if (userResponses.contains(userRespNum)) {
                    System.out.println("You already got that one!");
                } else if (!question.getChoiceMap().get(userRespNum).isCorrect()) {
                    System.out.println("Sorry, the correct answer was: ");
                    for (Choice choice : question.getChoiceMap().values()) {
                        if (choice.isCorrect()) {
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userRespNum);
                    if (i == question.getMaxResponses() -1) {
                        numCorrect++;
                    }
                    i++;
                }
            }
        }

        input.close();
    }
}



