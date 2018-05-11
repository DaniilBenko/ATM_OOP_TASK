package ooptask1;

import java.util.Comparator;

public class SubCountComparator implements Comparator<MonthlyFeeTariff> {
    Integer a = 0;
    Integer b = 0;
    public int compare(MonthlyFeeTariff o1, MonthlyFeeTariff o2)
    {
        a=o1.getSubCount();
        b=o2.getSubCount();
        return a.compareTo(b);
    }
}
