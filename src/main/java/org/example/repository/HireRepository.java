package org.example.repository;

import org.example.model.Costumer;
import org.example.model.Hire;

import java.util.ArrayList;

public class HireRepository {
    private ArrayList<Hire> hires = new ArrayList<>();
    private long lastId = 1;

    // Lista
    public ArrayList<Hire> list() {
        return hires;
    }

    // Criar
    public Hire create(Hire hire) {
        hire.setId(lastId++);
        hires.add(hire);
        return hire;
    }


    // Ler

    // Atualizar

    // Excluir
}
