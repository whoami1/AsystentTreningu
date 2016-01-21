import java.util.Date;

/**
 * Klasa przechowująca dane biometryczne użytkownika.
 */
public class BodyParams
{
    /**
     * Data wykonania pomiarów przez użytkownika.
     */
    private Date date;

    /**
     * Zmienna zawierająca wynik obliczonej wartości wody w organizmie użytkownika.
     */
    private double water;

    /**
     * Zmienna zawierająca wynik obliczonej zawartości tkanki tłuszczowej w organizmie użytkownika.
     */
    private double fat;

    /**
     * Zmienna zawierająca wynik obliczonej wagi kości użytkownika.
     */
    private double weightOfBones;

    /**
     * Zmienna zawierająca wynik obliczonej wartości BMI użytkownika.
     */
    private double BMI;

    /**
     * Zmienna zawierająca wynik obliczonej zawartości beztłuszczowej masy ciała użytkownika.
     */
    private double LBM;

    /**
     * Zmienna zawierająca wynik obliczonej ilości spalonej energi [w kilokaloriach] użytkownika.
     */
    private double calories;

    /**
     * Funkcja zwracająca ilość spalonej energii.
      * @return ilość spalonej energii
     */
    public double getCalories()
    {
        return calories;
    }

    /**
     * Funkcja ustawiająca obliczoną ilość spalonych energii.
     * @param calories ilość spalonej energii
     */
    public void setCalories(double calories)
    {
        this.calories = calories;
    }

    /**
     * Funkcja zwracająca datę przeprowadzenia pomiarów.
     * @return data przeprowadzenia pomiarów
     */
    public Date getDate()
    {
        return date;
    }

    /**
     * Funkcja ustawiająca datę przeprowadzenia pomiarów.
     * @param date data przeprowadzenia pomiarów
     */
    public void setDate(Date date)
    {
        this.date = date;
    }

    /**
     * Funkcja zwracająca wynik obliczonej wartości wody w organizmie użytkownika.
     * @return wartość wody w organizmie
     */
    public double getWater()
    {
        return water;
    }

    /**
     * Funkcja ustawiająca wynik obliczonej wartości wody w organizmie użytkownika.
     * @param water wartość wody w organizmie
     */
    public void setWater(double water)
    {
        this.water = water;
    }

    /**
     * Funkcja zwracająca wynik obliczonej zawartości tkanki tłuszczowej w organizmie użytkownika.
     * @return zawartość tłuszczu w organizmie
     */
    public double getFat()
    {
        return fat;
    }

    /**
     * Funkcja ustawiająca wynik obliczonej zawartości tkanki tłuszczowej w organizmie użytkownika.
     * @param fat zawartość tłuszczu w organizmie
     */
    public void setFat(double fat)
    {
        this.fat = fat;
    }

    /**
     * Funkcja zwracająca wynik obliczonej wagi kości użytkownika.
     * @return waga kości
     */
    public double getWeightOfBones()
    {
        return weightOfBones;
    }

    /**
     * Funkcja ustawiająca wynik obliczonej wagi kości użytkownika.
     * @param weightOfBones waga kości
     */
    public void setWeightOfBones(double weightOfBones)
    {
        this.weightOfBones = weightOfBones;
    }

    /**
     * Funkcja zwracająca wynik obliczonej wartości BMI użytkownika.
     * @return BMI
     */
    public double getBMI()
    {
        return BMI;
    }

    /**
     * Funkcja ustawiająca wynik obliczonej wartości BMI użytkownika.
     * @param BMI BMI
     */
    public void setBMI(double BMI)
    {
        this.BMI = BMI;
    }

    /**
     * Funkcja zwracająca wynik obliczonej zawartości beztłuszczowej masy ciała użytkownika.
     * @return zawartość beztłuszczowej masy ciała
     */
    public double getLBM()
    {
        return LBM;
    }

    /**
     * Funkcja ustawiająca wynik obliczonej zawartości beztłuszczowej masy ciała użytkownika.
     * @param LBM zawartość beztłuszczowej masy ciała
     */
    public void setLBM(double LBM)
    {
        this.LBM = LBM;
    }

    /**
     * Funkcja przypisująca do obliczonej wartości BMI odpowiednią klasyfikację.
     * @return klasyfikacja BMI
     */
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
