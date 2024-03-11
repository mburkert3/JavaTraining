package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<dev.lpa.Mappable> mappables = new ArrayList<>();

        mappables.add(new dev.lpa.Building("Sydney Town Hall", dev.lpa.UsageType.GOVERNMENT));
        mappables.add(new dev.lpa.Building("Sydney Opera House",
                dev.lpa.UsageType.ENTERTAINMENT));
        mappables.add(new dev.lpa.Building("Stadium Australia", dev.lpa.UsageType.SPORTS));

        mappables.add(new dev.lpa.UtilityLine("College St", dev.lpa.UtilityType.FIBER_OPTIC));
        mappables.add(new dev.lpa.UtilityLine("Olympic Blvd", dev.lpa.UtilityType.WATER));

        for (var m : mappables) {
            dev.lpa.Mappable.mapIt(m);
        }
    }
}