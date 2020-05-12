import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Tester {

	//Test - creates an empty survey
	@Test //This is a test case
	public void createSurveyEmpty()
	{		
		Survey sur = new Survey();
		assertTrue("Should be an object of type 'survey'",sur instanceof Survey);
	}
	
	//Test - create a survey with info
	@Test //This is a test case
	public void createSurvey()
	{		
		//Question object
		Questions one = new Questions("Customer Service");
		//Collection representing questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//add question to list
		questions.add(one);
		
		Survey sur = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type survey",sur instanceof Survey);
	}
}