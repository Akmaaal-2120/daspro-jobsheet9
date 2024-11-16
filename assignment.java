import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayNum;
        int num, average, highest, lowest, total = 0;
        

        System.out.print("Enter the number of array elements : ");
        num = sc.nextInt();
        arrayNum = new int[num];
        for (int i = 0; i < arrayNum.length; i++){
            System.out.print("Enter the score " + i + ": ");
            arrayNum[i] = sc.nextInt();
             
        }
        highest = arrayNum[0];
        lowest = arrayNum[0];
        
        for (int i = 0; i < arrayNum.length; i++){
            if(arrayNum[i] > highest){
              
                highest = arrayNum[i];
            }else if (arrayNum[i] < lowest){
                
                lowest = arrayNum[i];
            }
            total += arrayNum[i];
        }
        average = total / arrayNum.length;

        System.out.println("The highest score is : " + highest );
        System.out.println("The lowest score is : " + lowest );
        System.out.println("The average score is : " + average);

    }
}
