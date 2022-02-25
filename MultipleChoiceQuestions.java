package TestPapers;



public class MultipleChoiceQuestions extends Questions{
	
	
	String [] possibleAnswers;
	String correctAnswer;
	int arrayNum;
	String enterAns;
	
	public MultipleChoiceQuestions(int pts, int numAns, String qTXT, String ansTXT) {
		this.points = setPoints(pts);
		this.questionText = qTXT;
		this.correctAnswer = ansTXT;
		this.arrayNum = numAns;
	}
	
	public void setAnsArray(int x) {
		System.out.println(this.questionText);
		this.possibleAnswers = new String [this.arrayNum];
		System.out.println("Please enter the possible answers for this question.");
		for(int i = 0; i < this.arrayNum; i++) {
			this.possibleAnswers[i] = input.nextLine();
		}
		
		
	}
	
	public void setAnsArray(String s) {
		this.possibleAnswers = s.split(",");
		
		
	}
	
	public void isCorrect(){
		
		System.out.println("The correct answer is: " + this.correctAnswer);
		System.out.println("The answer submitted was: " + this.answerSpace);
		
		if(this.answerSpace != null) {
			if(this.answerSpace.equalsIgnoreCase(this.correctAnswer) && this.answerSpace != null) {
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect!");
				for(int j = 0; j < this.arrayNum; j++) {
					if(this.possibleAnswers[j].equalsIgnoreCase(this.correctAnswer)) {
						System.out.println("***Correct Answer Here!!***" + " " + (j+1) + " ) " + this.possibleAnswers[j]);
					} else {
						System.out.println((j + 1) + ") " + this.possibleAnswers[j]);
					}
				}
			}
		}else {
			System.out.println("No Answer Submitted");
			System.out.println();
		}
		  
	  }
	
	public void dispAns() {
		
		System.out.println("This question is worth: " + this.points + "  pts.");
		for(int i = 0; i < this.arrayNum; i++) {
			System.out.println((i + 1) + ") " + this.possibleAnswers[i]);
		}
	}
}
