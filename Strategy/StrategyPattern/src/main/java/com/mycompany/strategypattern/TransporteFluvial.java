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
public class TransporteFluvial implements EstrategiaTransporte {
    @Override
    public void transportar(List<String> articulos) {
        System.out.println("Transporte aéreo: " + articulos);
    }
}