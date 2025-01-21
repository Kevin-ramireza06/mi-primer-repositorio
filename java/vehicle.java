public class Vehicle {


    private String type;
    private String model;
    private int maxSpeed;

    public Vehicle(String type, String model, int maxSpeed) {
        this.type = type;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Tipo de vehículo: " + type);
        System.out.println("Modelo: " + model);
        System.out.println("Velocidad máxima: " + maxSpeed + " km/h");
    }
}
