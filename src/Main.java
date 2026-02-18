import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Driver driver = new Driver("Иванов И.И.", 10);
    Engine engine = new Engine(200, "Toyota");

    Car car = new Car("Toyota", "Седан", 1500, driver, engine);
    Lorry lorry = new Lorry("Volvo", "Грузовик", 5000, driver, engine, 10000);
    SportCar sportCar = new SportCar("Ferrari", "Спорткар", 1200, driver, engine, 300);

    System.out.println(car);
    car.start();
    car.turnRight();

    System.out.println(lorry);
    System.out.println(sportCar);

}

