package ooptask1;

import java.util.ArrayList;

public class CreateList {
    public static ArrayList<MonthlyFeeTariff> createList() {
        ArrayList<MonthlyFeeTariff> tariffs = new ArrayList<MonthlyFeeTariff>();
        // добавим в список ряд элементов
        tariffs.add(new MonthlyFeeTariff());
        tariffs.add(new MonthlyFeeTariff());
        tariffs.add(new MonthlyFeeTariff());

        return tariffs;
    }

    public static void fillList(MonthlyFeeTariff monthlyFeeTariff, int subCount, String name, int costPerMinInternal, int costPerMinExternal, int costPerSMS, int costPerMb) {
        monthlyFeeTariff.setSubCount(subCount);
        monthlyFeeTariff.setName(name);
        monthlyFeeTariff.setCostPerMinInternal(costPerMinInternal);
        monthlyFeeTariff.setCostPerMinExternal(costPerMinExternal);
        monthlyFeeTariff.setCostPerSMS(costPerSMS);
        monthlyFeeTariff.setCostPerMb(costPerMb);
    }


}