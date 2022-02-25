package TestPapers;

public class Test {
	
	int numObj;
	int numFB;
	int numMCQ;
	int totalPts = 0;
	ObjectiveQuestions[] ObjQuest;
	FillBlankQuestions [] FBQuest;
	MultipleChoiceQuestions [] MultiCQ;
	
	public Test (int obj, int fb, int MCQ) {
		//create variables and objects
		this.numObj = obj;
		this.numFB = fb;
		this.numMCQ = MCQ;
		ObjectiveQuestions [] Qobj = new ObjectiveQuestions[this.numObj]; 
		this.ObjQuest = Qobj;
		FillBlankQuestions [] QFB = new FillBlankQuestions[this.numFB];
		this.FBQuest = QFB;
		MultipleChoiceQuestions [] QMCQ = new MultipleChoiceQuestions[this.numMCQ];
		this.MultiCQ = QMCQ;
		
	}
	
	public void ObjectiveQ() {
		this.ObjQuest[0] = new ObjectiveQuestions(10, "What is 2+2?", "4");
		this.ObjQuest[1] = new ObjectiveQuestions(7, "What is 3*8?", "24");
		this.ObjQuest[2] = new ObjectiveQuestions(30, "What is 12 minus 24?", "-12");
		
		for(int i = 0; i < this.numObj; i++) {
			this.ObjQuest[i].dispQuestion();
			this.ObjQuest[i].isCorrect();
		}
		
	}
	
	public void FILLBQuest() {
		this.FBQuest[0] = new FillBlankQuestions(12, "I am a student of _______ University.", "Temple");
		this.FBQuest[1] = new FillBlankQuestions(120, "The earth is _____.", "Round");
		this.FBQuest[2] = new FillBlankQuestions(1, "Food is ____ for life.", "Essential");
		
		for(int i = 0; i < this.numFB; i++) {
			this.FBQuest[i].dispQuestion();
			this.FBQuest[i].isCorrect();
		}
	}
	
	public void MultiChoiceQuestions() {
		this.MultiCQ[0] = new MultipleChoiceQuestions(20,4,"Which of the following numbers are even?", "6");
		this.MultiCQ[0].setAnsArray("1,3,5,6");
		this.MultiCQ[1] = new MultipleChoiceQuestions(20,3,"Which of the following numbers are odd?", "7");
		this.MultiCQ[1].setAnsArray("2,4,7");
		this.MultiCQ[2] = new MultipleChoiceQuestions(13,6,"What is 1 x1?", "1");
		this.MultiCQ[2].setAnsArray("1,2,3,4,5,6");
		this.MultiCQ[3] = new MultipleChoiceQuestions(1000,4,"What is the average speed of a swallow?", "African or European?");
		this.MultiCQ[3].setAnsArray("African or European? , 121 km/h, 10 mph, 12 ft/s");
		
		for(int i = 0; i < this.numMCQ; i++) {
			this.MultiCQ[i].dispAns();
			this.MultiCQ[i].isCorrect();
		}
		
		
	}
	public int getPoints(){
		for(int i = 0; i < this.numObj; i++) {
			this.totalPts += this.ObjQuest[i].getPoints();
		}
		
		for(int i =0; i < this.numFB; i++) {
			this.totalPts += this.FBQuest[i].getPoints();
		}
		
		for (int i = 0; i < this.numMCQ; i++) {
			this.totalPts += this.MultiCQ[i].getPoints();
		}
		return this.totalPts;
	}


		/* This space is used to write down the questions in their respective areas. 
		 * 
		 * Objective Questions(3): 
		 * 
		 * What is 2 + 2? Answer = 4. Pts = 10
		 * What is 3 * 8? Answer = 24. Pts 7
		 * What is 12 minues 24? Answer = -12. Pts 30
		 * 
		 * Fill In The Blank Questions(3).
		 * I am a student of ________ University. Answer: Temple; Pts 12;
		 * The earth is _______. Answer: round. pts 120
		 * Food is ____ for life. Answer: Essential. pts 1
		 * 
		 * Multiple Choice Questions(4).
		 * 
		 * Which of the following numbers are even?
		 *1,3,5,6 
		 *Answer: 6. Pts 20
		 *
		 *Which of the following numbers are odd?
		 *2,4,7
		 *Answer: 7. Pts 20
		 *
		 * What is 1x1?
		 * 1,2,3,4,5,6 
		 * Answer 1. Pts 13
		 * 
		 * What is the average flight velocity of a swallow?
		 * African or european?
		 * 121 km/h
		 * 10 mph
		 * 12 ft/s
		 * Answer: African or European? pts 1000
		 *
		 */
	

}
