package ooptask1;

import java.util.Comparator;

public class DoubleComparator implements Comparator<MonthlyFeeTariff> {
    Integer a = 0;
    Integer b = 0;
    Integer d = 0;
    Integer e = 0;
    public int compare(MonthlyFeeTariff o1, MonthlyFeeTariff o2)
    {
        a=o1.getSubCount();
        b=o2.getSubCount();
        d=o1.getCostPerSMS();
        e=o2.getCostPerSMS();
        int c = a.compareTo(b);
        return c == 0 ?
                 d.compareTo(e) :
                c;

    }
}
