package transport;

public class Bus extends Transport {
    int m;


    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxMovementSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, fuel);
        this.color = color;
        this.maxMovementSpeed = maxMovementSpeed;

    }

    public void refill() {
        m++;
                String a = "дизельное топливо";
               String b = "бензин";
                if (getFuel().equalsIgnoreCase(a) == true
                       || getFuel().equalsIgnoreCase(b) == true
                      || getFuel().equalsIgnoreCase(a) != true
                       || getFuel().equalsIgnoreCase(b) != true) {
                    if (m % 2 == 0) {
                        setFuel("бензин");
                    } else {
                        setFuel("дизельное топливо");
                    }
                }

    }
        //
        //System.out.println("Заправьте бензином или дизилем");



    @Override
    public String toString() {
        return "Автобус " + super.getBrand() +
                ", модель " + super.getModel() +
                ", год выпуска " + super.getProductionYear() +
                ", страна производства " + super.getProductionCountry() +
                ", цвет " + super.getColor() +
                ", максимальная скорость " + super.getMaxMovementSpeed() +
                " км/ч."+ ", вид топлива: "+ super.getFuel();

    }
}
