public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, int productionYear, String productionCountry, String color, float engineVolume) {
        if (brand == null || model == null || productionCountry == null) {
            this.brand = "default";
            this.model = "default";
            this.productionCountry = "default";
        } else {
            this.brand = brand;
            this.model = model;
            this.productionCountry = productionCountry;
        }
        if (Float.compare(engineVolume, 0) == 0) {

            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

    }

    void Print() {
        System.out.println(
                brand + " "
                        + model + ", "
                        + productionYear
                        + " год выпуска, сборка в "
                        + productionCountry
                        + " , цвет "
                        + color
                        + " , объём двигателя "
                        + engineVolume + " л.");
    }

}
