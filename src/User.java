/**
 * Created by Adamus on 2016-01-20.
 */
public class User
{
    public enum Gender { Male, Female }

    private String name;
    private Gender gender;
    private double weight;
    private double height;
    private int age;
    private double waistline;
    private double neckSize;
    private double hipSize;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getWaistline()
    {
        return waistline;
    }

    public void setWaistline(double waistline)
    {
        this.waistline = waistline;
    }

    public double getNeckSize()
    {
        return neckSize;
    }

    public void setNeckSize(double neckSize)
    {
        this.neckSize = neckSize;
    }

    public double getHipSize()
    {
        return hipSize;
    }

    public void setHipSize(double hipSize)
    {
        this.hipSize = hipSize;
    }
}
