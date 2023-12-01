package org.example.controller;

import com.google.gson.Gson;
import org.example.model.Bike;
import org.example.model.Costumer;
import org.example.model.Hire;
import org.example.repository.HireRepository;
import spark.Request;
import spark.Response;

public class HireController {

    HireRepository hireRepository = new HireRepository();

    // Listar
    public String getAll(Request req, Response res) {
        var hireList = hireRepository.list();
        var gson = new Gson();
        var hireListStr = gson.toJson(hireList);
        return hireListStr;
    }

    // Inserir
    public Hire insert(
            String startDate,
            int numberDays,
            String dateReturned,
            double latenessDeduction,
            double damageDeduction,
            Costumer costumer,
            Bike bike
    ) {
        Hire hire = new Hire(
                startDate,
                numberDays,
                dateReturned,
                latenessDeduction,
                damageDeduction,
                costumer,
                bike);
        hireRepository.create(hire);
        return hire;
    }
}
