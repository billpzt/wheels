package org.example.model;

import java.sql.Date;

public class Hire {
    private long id;
    private String startDate;
    private int numberDays;
    private String dateReturned;
    private double latenessDeduction;
    private double damageDeduction;
    private Costumer costumer;
    private Bike bike;

    public Hire(long id, String startDate, int numberDays, String dateReturned, double latenessDeduction, double damageDeduction, Costumer costumer, Bike bike) {
        this.id = id;
        this.startDate = startDate;
        this.numberDays = numberDays;
        this.dateReturned = dateReturned;
        this.latenessDeduction = latenessDeduction;
        this.damageDeduction = damageDeduction;
        this.costumer = costumer;
        this.bike = bike;
    }

    public Hire(String startDate, int numberDays, String dateReturned, double latenessDeduction, double damageDeduction, Costumer costumer, Bike bike) {
        this.startDate = startDate;
        this.numberDays = numberDays;
        this.dateReturned = dateReturned;
        this.latenessDeduction = latenessDeduction;
        this.damageDeduction = damageDeduction;
        this.costumer = costumer;
        this.bike = bike;
    }

    public Hire(String startDate, int numberDays, Costumer costumer, Bike bike) {
        this.startDate = startDate;
        this.numberDays = numberDays;
        this.costumer = costumer;
        this.bike = bike;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public String getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(String dateReturned) {
        this.dateReturned = dateReturned;
    }

    public double getLatenessDeduction() {
        return latenessDeduction;
    }

    public void setLatenessDeduction(double latenessDeduction) {
        this.latenessDeduction = latenessDeduction;
    }

    public double getDamageDeduction() {
        return damageDeduction;
    }

    public void setDamageDeduction(double damageDeduction) {
        this.damageDeduction = damageDeduction;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }
}
