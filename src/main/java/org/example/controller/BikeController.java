package org.example.controller;

import com.google.gson.Gson;
import org.example.model.Bike;
import org.example.repository.BikeRepository;
import spark.Request;
import spark.Response;

import java.util.ArrayList;
import java.util.List;

public class BikeController {

    BikeRepository bikeRepository = new BikeRepository();
    Gson gson = new Gson();


    // listar
    public String getAll(Request req, Response res) {
        var bikeList = bikeRepository.list();
        var bikeListStr = gson.toJson(bikeList);
        return bikeListStr;
    }

    // inserir
    public String insert(Request req, Response res) {
        String body = req.body();
        Bike newBike = gson.fromJson(body, Bike.class);
        Bike bike = bikeRepository.create(newBike);
        var bikeStr = gson.toJson(bike);
        return bikeStr;
    }

    // exibir
    public String show(Request req, Response res) {
        var idStr = req.params(":id");
        var id = Long.parseLong(idStr);
        Bike bike = bikeRepository.getById(id);
        var bikeStr = gson.toJson(bike);
        return bikeStr;
    }

    // atualizar

    // remover

}
