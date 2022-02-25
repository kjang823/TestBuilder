package TestPapers;

public class Main {

	public static void main(String[] args) {
		
		ObjectiveQuestions objQ = new ObjectiveQuestions(10, "What is your name?", "Kevin Jang");
		objQ.dispQuestion();
		//objQ.setAnswer();
		objQ.isCorrect();
		
		FillBlankQuestions fbQ = new FillBlankQuestions(5, "I am a student of ________ University", "Temple");
		fbQ.dispQuestion();
		//fbQ.setAnswer();
		fbQ.isCorrect();
		
		MultipleChoiceQuestions mcQ = new MultipleChoiceQuestions(5, 4, "Who lives in a pineapple under the sea?", "Spongebob Squarepants");
		//mcQ.setAnsArray();
		mcQ.setAnsArray("Rambo, Barack Obama, Kevin Jang, Spongebob Squarepants");
		mcQ.dispAns();
		//mcQ.setAnswer();
		mcQ.isCorrect();
		
		Test test1 = new Test(3,3,4);
		test1.ObjectiveQ();
		test1.FILLBQuest();
		test1.MultiChoiceQuestions();
		System.out.println(test1.getPoints());
		
	}

}
