package creational.builder;


import creational.builder.builder.AutoBuilder;
import creational.builder.builder.HeavyAutoBuilder;
import creational.builder.builder.LeightAutoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AutoBuilder builder = new LeightAutoBuilder();
        AutoBuilder builder1 = new HeavyAutoBuilder();

        List<Auto> autoList = new ArrayList<>();
        for (int i = 0; i < 5; ++i){
            autoList.add(builder.build());
        }
        for (int i = 0; i < 5; ++i){
            autoList.add(builder1.build());
        }

        for(Auto a: autoList){
            System.out.println(a);
        }
    }
}
