/**
 * Klasa opisująca aktywność sportową za pomocą współczynnika spalania kalorii.
 */
public class Activity
{
    /**
     * Nazwa opisywanej aktywności.
     */
    private String name;

    /**
     * Współczynnik spalania kalorii.
     */
    private double ratio;

    /**
     * Inicjalizuje nową aktywność za pomocą współczynnika i nazwy.
     * @param ratio współczynnik spalania kalorii
     * @param name nazwa opisywanej aktywności
     */
    public Activity(double ratio, String name)
    {
        this.name = name;
        this.ratio = ratio;
    }

    /**
     * Funkcja zwracająca współczynnik spalania kalorii.
     * @return współczynnik spalania kalorii
     */
    public double getRatio()
    {
        return ratio;
    }

    /**
     * Funkcja zwracająca nazwę aktywności.
     * @return nazwa aktywności
     */
    public String getName()
    {
        return name;
    }
}
