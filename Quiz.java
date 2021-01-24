package HonorsThesis;

import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {
	private ArrayList<Question> questions;
	
	public Quiz(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
	public void takeQuiz(Scanner userInput) {
		for (int i = 0; i < questions.size(); i++) {
			Question question = questions.get(i);
			System.out.println(question.getQuestionText());
			String response = userInput.next();
			if (response.equalsIgnoreCase(question.getAnswerText())) System.out.println("Correct!");
			else {
				System.out.println("Incorrect!");
				System.out.println(question.getFeedbackText());
			}
		}
	}
	
	@Override
	public String toString() {
		String quizString = "";
		for (int i = 0; i < questions.size(); i++) quizString += String.format("index = %d\n%s\n", i, questions.get(i));
		return quizString;
	}
}