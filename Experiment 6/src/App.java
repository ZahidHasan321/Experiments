import java.util.Arrays;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    public void checkAnswer()   {
        System.out.println("Who is the inventor of JAVA?");

        for(int i = 0; i < 3; i++){
            String ans = sc.nextLine();

            if(ans.toLowerCase().equals("james gosling")){

                System.out.println("Good");
                break;
            }
            else{
                if(i == 2)
                    break;
                System.out.println("Try again");
            }
        }
    }

    public void extractString(){
        System.out.printf("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter start index and end index of sub string(indexing starts at 0, ending is exclusive): ");
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        String subStr = str.substring(startIndex, endIndex);

        System.out.println(subStr);
    }

    public void countOccurrences()  {
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter a sub string: ");
        String subStr = sc.nextLine();

        int count = str.split(subStr, -1).length - 1;

        System.out.println("Number of occurrences: " + count);
    }

    public void sortString()    {
        System.out.printf("Enter a string: ");
        String str = sc.nextLine();

        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        System.out.println(charArr);
    }
}
