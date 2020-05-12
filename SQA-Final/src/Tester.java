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
		//Add question to list
		questions.add(one);
		
		Survey sur = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type survey",sur instanceof Survey);
	}
	
	
	
	//Test - see if collection of questions exists in the survey object
		@Test
		public void surveyQuestions()
		{		
			//Question object
			Questions one = new Questions("Customer Service");
			//Collection representing questions
			ArrayList<Questions> questions = new ArrayList<Questions>();
			//Add question to list
			questions.add(one);
			
			Survey sur = new Survey("My Questions" ,questions);
			assertTrue("Should be an object of type arralylist",sur.getQuestions() instanceof ArrayList);
		}
		
		
		
		//Test - check that questions are being added to the survey
		@Test
		public void addQuestion()
		{
			//Creation of question object
			Questions one = new Questions("Customer Service");
			Questions two = new Questions("Food Quality");
			
			Survey sur = new Survey("My Questions");
			sur.add(one);
			sur.add(two);
			
			assertEquals("Length of questions array should be 2",2 ,sur.getQuestions().size());
		}
}