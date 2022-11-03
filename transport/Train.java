package transport;

public class Train extends Transport {
    //- Цена поездки
    //- Время поездки
    //- Название станции отбытия
    //- Конечная остановка
    //- Количество вагонов
    int priceTrip;
    int timeTrip;
    String nameDepartureStation;
    String finalStop;
    int numberOfWagons;


    public Train(String brand, String model, int productionYear, String productionCountry,  int maxMovementSpeed,
                 String nameDepartureStation, String finalStop, int priceTrip, int numberOfWagons,String fuel) {
        super(brand, model, productionYear, productionCountry, fuel);
        setPriceTrip(priceTrip);
        setNameDepartureStation(nameDepartureStation);
        setFinalStop(finalStop);
        setNumberOfWagons(numberOfWagons);
        this.maxMovementSpeed = maxMovementSpeed;
    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        this.priceTrip = Math.abs(priceTrip);
    }

    // public int getTimeTrip() {
    //    return timeTrip;
    // }

    // public void setTimeTrip(int timeTrip) {
    //   this.timeTrip = Math.abs(timeTrip);
    //}

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        if (nameDepartureStation == null || nameDepartureStation.isBlank()) {
            this.nameDepartureStation = "Название станции отсутствует";
        } else {
            this.nameDepartureStation = nameDepartureStation;
        }
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop == null || finalStop.isBlank()) {
            this.finalStop = "Название станции отсутствует";
        } else {
            this.finalStop = finalStop;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = Math.abs(numberOfWagons);
    }

    @Override
    public void refill() {
        String a = "дизельное топливо";
       if (getFuel().equalsIgnoreCase(a)!=true) {
           this.setFuel("дизельное топливо");
        }

    }
//


    @Override
    public String toString() {
        return "Поезд " + super.getBrand() +
                ", модель " + super.getModel() +
                " , " + super.getProductionYear() +
                " год выпуска " + super.getProductionCountry() +
                ", скорость движения " + super.getMaxMovementSpeed() +
                " км/ч, отходит от " + nameDepartureStation +
                " и следует до станции " + finalStop +
                ". Цена поездки - " + priceTrip +
                ", в поезде " + numberOfWagons +
                " вагонов, вид топлива:" +super.getFuel();
    }

}
