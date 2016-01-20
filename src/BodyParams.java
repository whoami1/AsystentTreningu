import java.util.Date;

/**
 * Created by Adamus on 2016-01-20.
 */
public class BodyParams
{
    private Date date;
    private double water;
    private double fat;
    private double weightOfBones;
    private double BMI;
    private double LBM;

    private double calories;

    public double getCalories()
    {
        return calories;
    }

    public void setCalories(double calories)
    {
        this.calories = calories;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public double getWater()
    {
        return water;
    }

    public void setWater(double water)
    {
        this.water = water;
    }

    public double getFat()
    {
        return fat;
    }

    public void setFat(double fat)
    {
        this.fat = fat;
    }

    public double getWeightOfBones()
    {
        return weightOfBones;
    }

    public void setWeightOfBones(double weightOfBones)
    {
        this.weightOfBones = weightOfBones;
    }

    public double getBMI()
    {
        return BMI;
    }

    public void setBMI(double BMI)
    {
        this.BMI = BMI;
    }

    public double getLBM()
    {
        return LBM;
    }

    public void setLBM(double LBM)
    {
        this.LBM = LBM;
    }

    public String bmiClassification()
    {
        String bmiClass = "";
        if(BMI<16.0)
        {
            bmiClass = "wyglodzenie";
        }
        else if ((BMI>16.0) && (BMI<16.99))
        {
            bmiClass = "wychudzenie";
        }
        else if ((BMI>17.0) && (BMI<18.49))
        {
            bmiClass = "niedowaga";
        }
        else if ((BMI>18.5) && (BMI<24.99))
        {
            bmiClass = "wartosc prawidlowa";
        }
        else if ((BMI>25.0) && (BMI<29.99))
        {
            bmiClass = "nadwaga";
        }
        else if((BMI>30.0) && (BMI<34.99))
        {
            bmiClass = "I st otylosci";
        }
        else if((BMI>35.0) && (BMI<39.99))
        {
            bmiClass = "II st otylosci (otylosc kliniczna)";
        }
        else
        {
            bmiClass = "otylosc skrajna";
        }
        return bmiClass;
    }
}
