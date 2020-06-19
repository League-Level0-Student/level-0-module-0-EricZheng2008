package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog("Who was the first president of the United States?");
		if(question.equals("George Washington")) {
			JOptionPane.showMessageDialog(null, "Congrats! You are correct!");
			score+=1;
		
		}else { 
			JOptionPane.showMessageDialog(null,"WRONG ANSWER!");
		}
		String answer = JOptionPane.showInputDialog("What year is it?");
		if(answer.equals("2020")) {
			JOptionPane.showMessageDialog(null, "Congrats! You are correct!");
			score+=1;
		}else {
			JOptionPane.showMessageDialog(null, "WRONG ANSWER!");
		
		}
		String wonder = JOptionPane.showInputDialog("Who is the main charachter in Naruto?");
		if(wonder.equals("Naruto")) {
			JOptionPane.showMessageDialog(null, "Congrats! You are correct!");
			score+=1;
		}else { 
			JOptionPane.showMessageDialog(null, "WRONG ANSWER!");
		}
		
		// 3.  Use an if statement to check if their answer is correct
			
			
			

			
		
			
			
			
			
			
			
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
