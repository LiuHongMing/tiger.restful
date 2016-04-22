package demo.annotations;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

@Named
public class Car {

    @Inject
    public Car(Provider<Seat> seatProvider) {
        Seat driver = seatProvider.get();
        System.out.println(driver);
        Seat passenger = seatProvider.get();
        System.out.println(passenger);
    }

}
