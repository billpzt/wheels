package org.example;

import static spark.Spark.*;
import org.example.controller.BikeController;
import org.example.controller.CostumerController;
import org.example.controller.HireController;
import org.example.model.Bike;
import org.example.model.Costumer;
import org.example.model.Hire;

public class Main {
    static BikeController bikeController = new BikeController();
    static CostumerController costumerController = new CostumerController();
//    static HireController hireController = new HireController();

    public static void main(String[] args) {
//        inserirDadosDeClientesDeTestes();
//        inserirDadosDeAlugueisDeTestes();
        port(8080);

        // Solicitar a lista de bikes
        //get("/bike", new BikeController()::getAll);
        post("/bike", (req, res) -> bikeController.insert(req, res));
        post("/costumer", (req, res) -> costumerController.insert(req, res));
        get("/bike", (req, res) -> bikeController.getAll(req, res));
        get("/bike/:id", (req, res) -> bikeController.show(req, res));
        get("/costumer", (req, res) -> costumerController.getAll(req, res));
        get("/costumer/:id", (req, res) -> costumerController.show(req, res));

        System.out.println("Executando...");
    }

//    private static BikeController inserirDadosDeTestes() {
//        String available = "disponível";
//        String type = "Infantil";
//        int size = 1;
//        String make = "Marca";
//        String model = "Modelo XPTO";
//        double dailyHireRate = 2.00;
//        double deposit = 10.00;
//
//        bikeController.insert(available, type, size, make, model, dailyHireRate, deposit);
//        bikeController.insert(available, type, size, make, model, dailyHireRate, deposit);
//        bikeController.insert(available, type, size, make, model, dailyHireRate, deposit);
//        Bike bike = bikeController.insert(available, type, size, make, model, dailyHireRate, deposit);
//        return bikeController;
//    }

//    private static CostumerController inserirDadosDeClientesDeTestes() {
//        String name = "Joaquim";
//        String address = "Rua dos Bobos, 0";
//        String tel = "899034838";
//
//        costumerController.insert(name, address, tel);
//        costumerController.insert(name, address, tel);
//        costumerController.insert(name, address, tel);
//        Costumer costumer = costumerController.insert(name, address, tel);
//        return costumerController;
//    }

//    private static HireController inserirDadosDeAlugueisDeTestes() {
//        String startDate = "";
//        int numberDays = 0;
//        String dateReturned = "";
//        double latenessDeduction = 0.0;
//        double damageDeduction = 0.0;
//        Costumer costumer = new Costumer();
//        Bike bike = new Bike();
//
//        hireController.insert(startDate, numberDays, dateReturned, latenessDeduction, damageDeduction, costumer, bike);
//        hireController.insert(startDate, numberDays, dateReturned, latenessDeduction, damageDeduction, costumer, bike);
//        hireController.insert(startDate, numberDays, dateReturned, latenessDeduction, damageDeduction, costumer, bike);
//        Hire hire = hireController.insert(startDate, numberDays, dateReturned, latenessDeduction, damageDeduction, costumer, bike);
//        return hireController;
//    }
}