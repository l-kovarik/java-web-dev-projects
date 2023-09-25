package org.example;

public class Quiz {

        public String userAnswer;
        double possiblePts;
        double earnedPts;
        double totalScore;


        public String getUserAnswer() {
            return userAnswer;
        }
        public double getTotalScore() {
            return totalScore;
        }

        public double getEarnedPts() {
            return earnedPts;
        }

        public void  addToScore() {
            totalScore = earnedPts += totalScore;
        }

    public double String gradeQuestion() {
        if (userAnswer.equals(this.correctAnswer)) {
            totalScore += this.questionPoints;
        }
        return totalScore;
    }
    }



