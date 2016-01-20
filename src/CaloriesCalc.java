import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Micha³ Wrzesieñ on 2016-01-20.
 */
public class CaloriesCalc
{
    /*public void activitiesList() throws FileNotFoundException
    {
        HashMap<String,Double> activities = new HashMap<>();

        String[] keys = new String[92];
        Double[] values = new Double[92];

        File file1 = new File("activitiesKeys.txt");
        File file2 = new File("activitiesValues.txt");
        Scanner in1 = new Scanner(file1);
        Scanner in2 = new Scanner(file2);
        for(int i = 1; i<92; i++)
        {
            activities.put(in1.nextLine(),new Double(in2.nextDouble()));
        }
    }*/

    public Double calc(Integer weight, Integer time, Double activity)
    {
        Double time1 = (double)time/60;
        return (weight*activity)*time1;
    }

    public void show(Double result)
    {
        System.out.println("Ilosc spalonej energi w [kcal] wynosi: " + result);
    }

    public static void main(String[] args)
    {
        CaloriesCalc caloriesCalc = new CaloriesCalc();

        Scanner in = new Scanner(System.in);

        Integer weight, time;

        /* Chwilowo przykladowy: "8.1" Bieganie: wolno (1 km w 8 minut)*/
        Double activity = 8.1;

        /*try
        {
            caloriesCalc.activitiesList();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }*/

        System.out.println("Podaj swoja wage (w kg)");
        weight = in.nextInt();

        System.out.println("Podaj czas przeznaczony na czynnosc (w minutach):");
        time = in.nextInt();

        //System.out.println("Rodzaj aktywnosci");

        caloriesCalc.show(caloriesCalc.calc(weight,time,activity));
    }
}
