import java.util.Scanner;
public class ArrayAverageScore15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        double totalPass = 0;
        double totalFail = 0;
        double averageFail = 0, averagePass = 0;
        int numStudent;
        int pass = 0;
        int fail = 0;
        
        
        System.out.print("Enter the number of students : ");
        numStudent = sc.nextInt();

        for(int i = 0; i < numStudent; i++){
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();

        }
        for(int i = 0; i < numStudent; i++){
            if(score[i] > 70){
                totalPass += score[i];
                pass++;
                
            }else{
                totalFail += score[i];
                fail++;
                
            }
        }
       averagePass = totalPass / pass;
       averageFail = totalFail / fail;
        System.out.println("The average score of students who passed is " + averagePass);
    
        System.out.println("The average score of students who failed is " + averageFail);
    }
}
