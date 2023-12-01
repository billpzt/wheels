package org.example.model;

public class Bike {
    private long id;
    private String available;
    private String type;
    private int size; // 1 - pequena, 2 - media, 3 - grande
    private String make;
    private String model;
    private double dailyHireRate = 8.0;
    private double deposit = 50.0;

    public Bike(long id, String available, String type, int size, String make, String model, double dailyHireRate, double deposit) {
        this(available, type, size, make, model, dailyHireRate, deposit);
        this.id = id;
    }

    public Bike(String available, String type, int size, String make, String model, double dailyHireRate, double deposit) {
        this(available, type, size, make, model);
        this.dailyHireRate = dailyHireRate;
        this.deposit = deposit;
    }

    public Bike(String available, String type, int size, String make, String model) {
        this.available = available;
        this.type = type;
        this.size = size;
        this.make = make;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyHireRate() {
        return dailyHireRate;
    }

    public void setDailyHireRate(double dailyHireRate) {
        this.dailyHireRate = dailyHireRate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
