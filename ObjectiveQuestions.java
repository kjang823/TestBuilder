package TestPapers;

public class ObjectiveQuestions extends Questions {
	
	String correctAnswer;
	
	  public ObjectiveQuestions(int point, String qTxt, String actTXT) {
		  this.points = setPoints(point);
		  this.questionText = qTxt;
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
		  
		  text = this.questionText;
		  System.out.println(text);
		  
		  System.out.println("Please enter your answer:___________");
		  System.out.println();
	  }
	  
	  

}
