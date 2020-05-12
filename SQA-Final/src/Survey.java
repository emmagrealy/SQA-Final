
import java.util.ArrayList;

public class Survey {
	
	//Survey
	private String name;
	
	//Collection 
	private ArrayList<Questions> questions = new ArrayList<Questions>();
	
	//Empty Constructor - proof that class can be created
	public Survey() 
	{
		
	}
	

	//Constructor 
	public Survey(String name, ArrayList<Questions> questions) {
		this.name = name;
		this.questions = questions;
	}
	
	//public void
	public void addQuestion(Questions question)
	{
		this.questions.add(question);
	}
	
	
	//Getters and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<Questions> questions) {
		this.questions = questions;
	}

}