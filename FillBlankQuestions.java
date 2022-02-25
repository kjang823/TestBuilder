package TestPapers;

public class FillBlankQuestions extends Questions{

	String correctAnswer;
	
	public FillBlankQuestions(int pValue, String qTXT, String actTXT) {
		this.points = setPoints(pValue);
		this.questionText = qTXT;
		this.correctAnswer = actTXT;
	}
	
	public void isCorrect(){
		
		  System.out.println("The correct answer is: " + this.correctAnswer);
		  
		  
		  if(this.answerSpace != null) {
			  System.out.println("The answer submitted was: " + this.answerSpace);
			  if(this.answerSpace.equalsIgnoreCase(correctAnswer)) {
				  System.out.println("Correct!!!");
				  System.out.println();
			  } else {
				  System.out.println("Incorrect!");
				  System.out.println();
			  }
		  } else {
			  System.out.println("No answer submitted yet.");
			  System.out.println();
		  }
		  
	  }
	
	public void dispQuestion() {
		
		  String text = "Number of points: " + this.points;
		  System.out.println(text);
		  
		  System.out.println("Please fill in the blank.");
		  text = this.questionText;
		  System.out.println(text);
		  
		  System.out.println("Please enter your answer:___________");
		  System.out.println();
		  
	  }
	
	
}
