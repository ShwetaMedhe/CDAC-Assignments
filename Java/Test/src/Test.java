import java.util.Arrays;
import java.util.Date;

public class Test {
	private int testId;
	private String testName;
	private Date dateOfTest;
	private Questions[] questions;
	private int questionCount;
	
	//default constructor
	public Test() {
		super();
		questions = new Questions[10];
		questionCount=0;
		
	}

    //parameterized constructor
	public Test(int testId, String testName, Date dateOfTest, Questions[] questions, int questionCount) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.dateOfTest = dateOfTest;
		this.questions = questions;
		this.questionCount = questionCount;
	}

    //getter method
	public int getTestId() {
		return testId;
	}


	public String getTestName() {
		return testName;
	}


	public Date getDateOfTest() {
		return dateOfTest;
	}


	public Questions[] getQuestions() {
		return questions;
	}


	public int getQuestionCount() {
		return questionCount;
	}

    //setter method
	public void setTestId(int testId) {
		this.testId = testId;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public void setDateOfTest(Date dateOfTest) {
		this.dateOfTest = dateOfTest;
	}


	public void setQuestions(Questions[] questions) {
		this.questions = questions;
	}


	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}

    //toString method
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", dateOfTest=" + dateOfTest + ", questions="
				+ Arrays.toString(questions) + ", questionCount=" + questionCount + "]";
	}
	
	
	
	
	
}
