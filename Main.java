import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;
import transport.Car.Toy;
import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
        System.out.println("Hello world!");

        Key king=new Key  ("да", "нет");
        Insurance valeo = new Insurance("2022-09-12", 5,"tyrf");
        Toy toy = new Toy(42, 54);

        Car lada = new Car(
                "Lada",
                "Granta",
                2015,
                "России",
                "жёлтый",
                1.7f,
                "автоматическая", "x000xx000",
                "седан",

                3, "летние");
       lada.setKey(king);

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германии",
                "черный",
                3.0f,
                "механическа","x000xx000" ,
                "седан",
                4,
                "зимние");
        //х000хх000
        Car bmv = new Car(
                "BMW",
                "Z8",
                2021,
                "Германии",
                "черный",
                3.0f,
                "робот","x000xx000" ,
                "купе",

                3, "летние");

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2018,
                "Южной Корее",
                "красный",
                2.4f,
                "автоматическа","x000xx000" ,
                "кроссовер",
                5, "летние");

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Южной Корее",
                "оранжевый",
                1.6f,
                "механическая","x000xx000" ,
                "седан",

                4, "зимние");


hyundai.changeTyres();
kia.changeTyres();
        hyundai.setRegistrationNumber("gfrg");
        hyundai.number();
        lada.Print();
        audi.Print();
        bmv.Print();
        kia.Print();
        hyundai.Print();
            hyundai.setKey(king);
            hyundai.setInsurance(valeo);
            hyundai.setToy(toy);

        System.out.println("hyundai.key = " + hyundai.key);
        System.out.println("hyundai.insurance = " + hyundai.insurance);
            System.out.println("hyundai.getInsurance() = " + hyundai.getInsurance().getCostInsurance());
            System.out.println("hyundai.getToy() = " + hyundai.getToy());
            System.out.println("toy = " + toy);
            System.out.println("toy.getB() = " + toy.getB());
            System.out.println("valeo.getCostInsurance() = " + valeo.getCostInsurance());
        }
}