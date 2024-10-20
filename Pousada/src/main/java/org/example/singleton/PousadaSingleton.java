package org.example.singleton;

import org.example.domain.Pousada;

public class PousadaSingleton {

    private static Pousada instance;

    private PousadaSingleton() {}

    public static Pousada getInstance() {
        if (instance == null) {
            instance = new Pousada("Pousada teste", "Rua teste, 123");
        }
        return instance;
    }
}
