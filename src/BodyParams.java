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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getWeightOfBones() {
        return weightOfBones;
    }

    public void setWeightOfBones(double weightOfBones) {
        this.weightOfBones = weightOfBones;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public double getLBM() {
        return LBM;
    }

    public void setLBM(double LBM) {
        this.LBM = LBM;
    }
}
