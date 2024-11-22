import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rand1 = new Random();
        double sum = 0;
        double average = 0;
        int minValue = 100;
        int maxValue = 0;

        Scanner in1 = new Scanner(System.in);
        int userInput1 = SafeInput.getRangedInt(in1, "Enter an integer between 1 and 100", 1, 100);
        int userInputCount = 0;

        Scanner in2 = new Scanner(System.in);
        int userInput2 = SafeInput.getRangedInt(in2, "Enter another integer between 1 and 100", 1, 100);

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rand1.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        average = sum / dataPoints.length;
        System.out.println("");
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userInput1)
            {
                userInputCount++;
            }
        }
        System.out.println("The first integer input by the user is: " + userInput1);
        System.out.println("The total number of integers in the dataPoints array that match the user input integer is " + userInputCount);
        System.out.println("The second integer input by the user is: " + userInput2);
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (userInput2 == dataPoints[i]) {
                System.out.println("The value first value of " + userInput2 + " was found at index " + (i+1) + " in dataPoints");
                break;
            } else if (i == dataPoints.length - 1 ) {
                System.out.println("There aren't any values in dataPoints array that match the user input integer");
            }
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] > maxValue)
                maxValue = dataPoints[i];
            if (dataPoints[i] < minValue)
                minValue = dataPoints[i];
        }
        System.out.println("The max value of the dataPoints array is: " + maxValue);
        System.out.println("The min value of the dataPoints array is: " + minValue);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }

    public static double getAverage(int[] values)
    {
        double methodSum = 0;
        double methodAverage = 0;
        for (int i = 0; i < values.length; i++){
            methodSum += values[i];
        }
        methodAverage = methodSum / values.length;
        return methodAverage;
    }
}