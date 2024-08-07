package main.java.com.vasylwecek.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficController implements Mediator {
    private List<Airplane> airplanes;

    public AirTrafficController() {
        this.airplanes = new ArrayList<>();
    }

    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public void notify(Object sender, String event) {
        for (Airplane airplane : airplanes) {
            if (airplane != sender) {
                airplane.receive(event);
            }
        }
    }

    public void requestLanding(Airplane airplane) {
        System.out.println("Диспетчер: Самолёт " + airplane.getId() + " запрашивает посадку.");
        notify(airplane, "запрос посадки");
    }

    public void requestTakeoff(Airplane airplane) {
        System.out.println("Диспетчер: Самолёт " + airplane.getId() + " запрашивает взлёт.");
        notify(airplane, "запрос взлёта");
    }
}
