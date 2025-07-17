/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategypattern;

import java.util.List;

/**
 *
 * @author domen
 */
public class Distribucion {
    private EstrategiaTransporte estrategia;

    public Distribucion(EstrategiaTransporte estrategia) {
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(EstrategiaTransporte nueva) {
        this.estrategia = nueva;
    }

    public void distribuir(List<String> articulos) {
        estrategia.transportar(articulos);
    }
}