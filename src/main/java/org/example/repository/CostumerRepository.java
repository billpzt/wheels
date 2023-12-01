package org.example.repository;

import org.example.model.Bike;
import org.example.model.Costumer;

import java.util.ArrayList;

public class CostumerRepository {
    private ArrayList<Costumer> costumers = new ArrayList<>();
    private long lastId = 1;

    // Lista
    public ArrayList<Costumer> list() {
        return costumers;
    }

    // Criar
    public Costumer create(Costumer costumer) {
        costumer.setId(lastId++);
        costumers.add(costumer);
        return costumer;
    }

    // Ler
    public Costumer getById(Long id) {
        for (int i = 0; i < costumers.size(); i++) {
            var costumer = costumers.get(i);
            if (costumer.getId() == id) {
                return costumer;
            }
        }
        return null;
    }

    // Atualizar

    // Excluir
}
