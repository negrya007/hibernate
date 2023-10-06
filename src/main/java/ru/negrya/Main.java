package ru.negrya;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.negrya.entity.Car;
import ru.negrya.entity.Engine;
import ru.negrya.entity.Human;
import ru.negrya.services.CarService;
import ru.negrya.services.EngineService;
import ru.negrya.services.HumanService;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();


        final Engine engine = new Engine("Mark",230);
        EngineService engineService = new EngineService();
        engineService.create(engine);

        final Car car = new Car("Lada",500000,"а001вв13",engine);
        CarService carService = new CarService();
        carService.create(car);


        Set<Car> cars = new HashSet<>();
        cars.add(car);
        final Human human = new Human("Denis", LocalDate.of(1999,5,3),null,cars);
        HumanService humanService = new HumanService();
        humanService.create(human);


       }
    }
