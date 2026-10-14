import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("         STUDENT GRADE CALCULATOR        ");
        System.out.println("=========================================");

        //1.Take number of subject
        System.out.print("ENter thye total number of subjects:");
        while(!scanner.hasNext()){
            System.out.println("Invalid input!Please enter a valid integer.");
            System.out.println("Enter the total number of subjects:");
            scanner.next();

           
        }
        int  totalSubject=scanner.nextInt();
        int []marks=new int[totalSubject];
        int totalMarks=0;

        //2.Take marks obtained(out of 100) in each subject
        System.out.println("Enter marks obtained out of 100 for each subject:");
        for(int i=0;i<totalSubject;i++){
            System.out.print("Subject"+(i+1)+"marks:");
            int subjectMark;
            while(true){
                while(!scanner.hasNextInt()){
                    System.out.println("Invalid input!Please enter a number between 0 and 100.");
                    System.out.print("Subject" +(i+1)+"Marks:");
                    scanner.next();

                }
                subjectMark = scanner.nextInt();
                if (subjectMark >= 0 && subjectMark <= 100) {
                    break;
                } else {
                    System.out.println("Marks must be between 0 and 100!");
                    System.out.print("Subject " + (i + 1) + " Marks: ");
                }
                
            }
            marks[i]=subjectMark;

            totalMarks += subjectMark;
        }
        //4.Calculate Average Percentage
        double averagePercentage = (double) totalMarks / totalSubject;

        // 5. Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A'; // Grade A for 90% and above
        } else if (averagePercentage >= 80) {
            grade = 'B'; // Grade B for 80% to 89%
        } else if (averagePercentage >= 70) {
            grade = 'C'; // Grade C for 70% to 79%
        } else if (averagePercentage >= 60) {
            grade = 'D'; // Grade D for 60% to 69%
        } else if (averagePercentage >= 50) {
            grade = 'E'; // Grade E for 50% to 59%
        } else {
            grade = 'F'; // Grade F for below 50%
        }

        // 6. Display Results
        System.out.println("\n=========================================");
        System.out.println("            CALCULATED RESULTS           ");
        System.out.println("=========================================");
        System.out.println("Total Marks Obtained: " + totalMarks + " / " + (totalSubject * 100));
        System.out.printf("Average Percentage:   %.2f%%\n", averagePercentage);
        System.out.println("Corresponding Grade:  " + grade);
        System.out.println("=========================================");

        scanner.close();
    }
}
