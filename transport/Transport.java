package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;

    protected String fuel;


    public Transport(int maxMovementSpeed) {
        setMaxMovementSpeed(maxMovementSpeed);
    }

    public Transport(String color) {
        setColor(color);
    }

    protected String color;

    protected int maxMovementSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String fuel) {
        if (brand == null || model == null || productionCountry == null || brand.isBlank() || model.isBlank() || productionCountry.isBlank()) {
            this.brand = "default";
            this.model = "default";
            this.productionCountry = "default";
        } else {
            this.brand = brand;
            this.model = model;
            this.productionCountry = productionCountry;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = Math.abs(productionYear);
        }

        if (fuel == null || fuel.isBlank()) {
            this.fuel = "не указано";
        } else {
            this.fuel = fuel;
        }


    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {

        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank()) {
            this.model = model;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }


    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        if (maxMovementSpeed >= 0) {
            this.maxMovementSpeed = maxMovementSpeed;
        } else {
            this.maxMovementSpeed = Math.abs(maxMovementSpeed);
        }
    }


    public abstract void refill();
}


