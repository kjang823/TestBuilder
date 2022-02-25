package TestPapers;

import java.util.Scanner;

public class Questions {
	
	Scanner input = new Scanner(System.in);
	
	int points;
	int MIN_DIFFICULTY = 1;
	int MAX_DIFFICULTY = 10;
	String answerSpace;
	String questionText;
	
	
	public int setPoints(int x) {
		return this.points = x;
	}
	
	public int setMinDifficulty() {
		return MIN_DIFFICULTY = 1;
	}
	
	public int setMaxDifficulty() {
		return MAX_DIFFICULTY = 10;
	}
	
	public String SetQuestion(String x) {
		return questionText = x;
	}
	
	public String setAnswer(String x) {
		return answerSpace = x;
	}
	
	public void setAnswer() {
		  String text = input.nextLine();
		  this.answerSpace = text;
	 }
	
	public int getPoints() {
		return this.points;
	}
}
