import animals.*;
import transport.Bus;
import transport.Car;
import transport.Car.Insurance;
import transport.Car.Key;
import transport.Car.Toy;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Key king = new Key("да", "нет");
        Insurance valeo = new Insurance("2022-09-12", 5, "tyrf");
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

                3, "летние",
                "бензин");
        lada.setKey(king);

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германии",
                "черный",
                3.0f,
                "механическа", "x000xx000",
                "седан",
                4,
                "зимние",
                "бензин");
        //х000хх000
        Car bmv = new Car(
                "BMW",
                "Z8",
                2021,
                "Германии",
                "черный",
                3.0f,
                "робот", "x000xx000",
                "купе",

                3, "летние",
                "бензин");

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2018,
                "Южной Корее",
                "красный",
                2.4f,
                "автоматическа", "x000xx000",
                "кроссовер",
                5, "летние",
                "бензин");

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Южной Корее",
                "оранжевый",
                1.6f,
                "механическая", "x000xx000",
                "седан",

                4, "зимние",
                "jhgjg");

        //- Поезд Ласточка, модель B-901, 2011 год выпуска в России, скорость передвижения – 301 км/ч,
        // отходит от Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки - 3500 рублей, в поезде 11 вагонов
        //- Поезд Ленинград, модель D-125, 2019 год выпуска в России, скорость передвижения – 270 км/ч,
        // отходит от Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки - 1700 рублей, в поезде 8 вагонов.
        Train swallow = new Train("Ласточка", "B-901", 2011, "России", 301,
                "Белорусского вокзала", "Минск-Пассажирский", 3500, 35, "дизельное топливо");
        Train lebingrad = new Train("Ленинград", "D-125", 2019, "России", 270,
                "Ленинградского вокзала", "Ленинград-Пассажирский", 1700, 8, "бензин");


        Bus liaz = new Bus("Лиаз", "677", 1970, "СССР", "жёлтый", 70, "vf");
        Bus nefaz = new Bus("НефАЗ", "5299", 2005, "Россия", "синий", 70, "");
        Bus maz = new Bus("Маз", "215", 2017, "Белорусь", "белый", 70, "fsd");

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
        System.out.println("swallow = " + swallow);
        System.out.println("lebingrad = " + lebingrad);
        System.out.println("liaz = " + liaz);
        System.out.println("nefaz = " + nefaz);
        System.out.println("maz = " + maz);
        lebingrad.refill();
        System.out.println("lebingrad = " + lebingrad);
        maz.refill();
        System.out.println("maz = " + maz);
        maz.refill();
        System.out.println("maz = " + maz);
        hyundai.refill();
        hyundai.Print();
        hyundai.setFuel("бензин");
        hyundai.Print();

        Herbivores gazelle = new Herbivores("Долли", 5, "саванна", 15, "трава");
        Herbivores girafe = new Herbivores("Боби", 12, "саванна", 18, "листья");
        Herbivores horse = new Herbivores("Вьюга", 3, "луг", 25, "трава");

        System.out.println("gazelle = " + gazelle);
        System.out.println("girafe = " + girafe);
        System.out.println("horse = " + horse);

        Predators hyena = new Predators("Зина", 6, "саванна", 20, "падаль");
        Predators tiger = new Predators("Пламя", 8, "тайга", 22, "крупные животные");
        Predators bear = new Predators("Балу", 18, "тайга", 30, "любая еда");
        System.out.println("hyena = " + hyena);
        System.out.println("tiger = " + tiger);
        System.out.println("bear = " + bear);

        Amphibians frog = new Amphibians("Лола", 1, "болото");
        Amphibians lreadFreshwater = new Amphibians("Ка", 2, "озеро");
        System.out.println("frog = " + frog);
        System.out.println("lreadFreshwater = " + lreadFreshwater);

        Flightless peacock = new Flightless("Красавчик", 17, "джунгли", "ходит");
        Flightless penguin = new Flightless("Мики", 20, "побережье", "плавает");
        Flightless dodoBird = new Flightless("Додо", 18, "Маврикий", "ходит");
        System.out.println("peacock = " + peacock);
        System.out.println("penguin = " + penguin);
        System.out.println("dodoBird = " + dodoBird);

        Flying seagull = new Flying("Чайка", 5, "побережье", "летает");
        Flying albatros = new Flying("Альбатрос", 6, "небо", "летает");
        Flying falcon = new Flying("Сокол", 1, "лес", "летает");
        System.out.println("seagull = " + seagull);
        System.out.println("albatros = " + albatros);
        System.out.println("falcon = " + falcon);
        System.out.println(seagull.equals(falcon));
        Flying vd = new Flying("Сокол", 1, "лес", "летает");
        System.out.println("vd = " + vd);
        System.out.println(falcon.equals(vd));
    }
}