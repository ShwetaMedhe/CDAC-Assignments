public class TestMain {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Test Menu ---");
            System.out.println("1. Add New Test");
            System.out.println("2. Display All Tests");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = TestService.sc.nextInt();
            TestService.sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                	TestService.addNewTest();
                    break;
                case 2:
                	TestService.displayAllTests();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
