package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;

    private String fuel;

    private String color;

    private int maxMovementSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, String fuel) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
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
        setColor(color);
    }


    public Transport(String brand, String model, int productionYear, String productionCountry, int maxMovementSpeed, String fuel) {
        setMaxMovementSpeed(maxMovementSpeed);
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }


        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
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

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxMovementSpeed, String fuel) {
        setMaxMovementSpeed(maxMovementSpeed);
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }


        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }


        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
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
        setColor(color);
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


