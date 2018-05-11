package ooptask1;
import java.util.ArrayList;
import java.util.Collections;

import static ooptask1.CreateList.createList;
import static ooptask1.CreateList.fillList;

public class Main {
    //static int a;
    public static void main(String[] args){
        int a = 0;
        ArrayList<MonthlyFeeTariff> tariffs = createList();

        for (int i = 0; i < tariffs.size(); i++) {
            fillList(tariffs.get(i), 100*Math.abs((i-1)), "Tariff number "+i, 10*(i+1), 20*(i+1), 15*Math.abs((i-2)), 5*(i+1));
        }


        for (int i = 0; i < tariffs.size(); i++) {
            a = a + tariffs.get(i).getSubCount();
            System.out.print(tariffs.get(i).getName());
            System.out.print("  SubCount =" + tariffs.get(i).getSubCount());
            System.out.println("  CostPerSMS =" + tariffs.get(i).getCostPerSMS());

        }
        System.out.println("SubCount for all tariffs =" +a);

        Collections.sort(tariffs, new SubCountComparator()); //sort by 1 param

        for (int i = 0; i < tariffs.size(); i++) {
            a = a + tariffs.get(i).getSubCount();
            System.out.print(tariffs.get(i).getName());
            System.out.print("  SubCount =" + tariffs.get(i).getSubCount());
            System.out.println("  CostPerSMS =" + tariffs.get(i).getCostPerSMS());

        }

        System.out.println(""); //отступ для наглядности в резалтах (useless)


        Collections.sort(tariffs, new DoubleComparator()); //sort by 2 params

        for (int i = 0; i < tariffs.size(); i++) {
            a = a + tariffs.get(i).getSubCount();
            System.out.print(tariffs.get(i).getName());
            System.out.print("  SubCount =" + tariffs.get(i).getSubCount());
            System.out.println("  CostPerSMS =" + tariffs.get(i).getCostPerSMS());

        }

        //search
        for (int i = 0; i < tariffs.size(); i++) {
            if (tariffs.get(i).getSubCount()== 100) {
                if (tariffs.get(i).getCostPerSMS()== 30){
                    System.out.println("Your tariff is " + tariffs.get(i).getName());
                }
            }
        }

    }
}
