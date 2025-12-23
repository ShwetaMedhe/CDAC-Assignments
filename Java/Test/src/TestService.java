import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestService {
    static Scanner sc = new Scanner(System.in);
    static Test[] tests = new Test[5];
    static int testCount = 0;

    public static void addNewTest() {
        if (testCount >= tests.length) {
            System.out.println("Test storage full.");
            return;
        }

        try {
            System.out.println("Enter TestId: ");
            int testId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Subject Name: ");
            String testName = sc.nextLine();

            System.out.println("Enter Test Date (dd/mm/yyyy): ");
            String dateStr = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dateOfTest = sdf.parse(dateStr);

            Test test = new Test();
            test.setTestId(testId);
            test.setTestName(testName);
            test.setDateOfTest(dateOfTest);

            Questions[] questions = new Questions[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("\nEnter details for Question " + (i + 1));
                System.out.print("Question Text: ");
                String qText = sc.nextLine();
                System.out.print("Option 1: ");
                String op1 = sc.nextLine();
                System.out.print("Option 2: ");
                String op2 = sc.nextLine();
                System.out.print("Option 3: ");
                String op3 = sc.nextLine();
                System.out.print("Option 4: ");
                String op4 = sc.nextLine();
                System.out.print("Correct Answer (1/2/3/4): ");
                String ans = sc.nextLine();
                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                questions[i] = new Questions(i + 1, qText, op1, op2, op3, op4, ans, marks);
            }

            test.setQuestions(questions);
            test.setQuestionCount(10);
            tests[testCount++] = test;

            System.out.println("Test added successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void displayAllTests() {
        if (testCount == 0) {
            System.out.println("No tests available.");
        } else {
            for (int i = 0; i < testCount; i++) {
                System.out.println("\n----------------------------");
                System.out.println(tests[i]);
            }
        }
    }
}
