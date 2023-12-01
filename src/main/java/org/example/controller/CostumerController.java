package org.example.controller;

import com.google.gson.Gson;
import org.example.model.Bike;
import org.example.model.Costumer;
import org.example.repository.CostumerRepository;
import spark.Request;
import spark.Response;

public class CostumerController {

    CostumerRepository costumerRepository = new CostumerRepository();
    Gson gson = new Gson();

    // Listar
    public String getAll(Request req, Response res) {
        var costumerList = costumerRepository.list();
        var costumerListStr = gson.toJson(costumerList);
        return costumerListStr;
    }

    // Inserir
    public String insert(Request req, Response res) {
        String body = req.body();
        Costumer newCostumer = gson.fromJson(body, Costumer.class);
        Costumer costumer = costumerRepository.create(newCostumer);
        var costumerStr = gson.toJson(costumer);
        return costumerStr;
    }

    // Exibir
    public String show(Request req, Response res) {
        var idStr = req.params(":id");
        var id = Long.parseLong(idStr);
        Costumer costumer = costumerRepository.getById(id);
        var costumerStr = gson.toJson(costumer);
        return costumerStr;
    }

}
