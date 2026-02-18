import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import university.Aspirant;
import university.Student;

void main() {

    System.out.println("Задача 1");
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


    System.out.println();
    System.out.println("Задача 2");

    Student[] students = {
            new Student("Ivan", "Ivanov", "I-11", 5.0),
            new Student("Kate", "Sidorova", "I-21", 4.2),
            new Aspirant("Anna", "Annenko", "A-31", 5.0, "Quantum Physics"),
            new Aspirant("Daniel", "Barns", "A-13", 3.5, "Calculus")
    };

    for (Student student : students){
        System.out.println(student.getFirstName() + " " + student.getLastName() +
                " - Scholarship: " + student.getScholarship() + " rub.");

    }

    System.out.println();
    System.out.println("Задача 3");

    Shape[] shapes = {
            new Circle("red", 5.0, 5.0, 3.0),
            new Rectangle("blue", 1.0, 1.0, 4.0, 6.0),
            new Circle("green", 10.0, 2.0, 4.6),
            new Rectangle("yellow", 7.0, 3.0, 9.0, 8.0)
    };

    System.out.println("Рисуем фигуры:");
    for (Shape shape : shapes) {
        shape.draw();
    }

}

