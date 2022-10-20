public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car lada = new Car(
                "Lada",
                "Granta",
                2015,
                "России",
                "жёлтый",
                1.7f);

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германии",
                "черный",
                3.0f);

        Car bmv = new Car(
                "BMW",
                "Z8",
                2021,
                "Германии",
                "черный",
                3.0f);

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2018,
                "Южной Корее",
                "красный",
                2.4f);

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Южной Корее",
                "оранжевый",
                1.6f);

        lada.Print();
        audi.Print();
        bmv.Print();
        kia.Print();
        hyundai.Print();


    }
}