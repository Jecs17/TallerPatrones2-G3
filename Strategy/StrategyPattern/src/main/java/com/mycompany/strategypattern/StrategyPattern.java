/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strategypattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author domen
 */
public class StrategyPattern {

    public static void main(String[] args) {
        List<String> articulos=new ArrayList<>();
        EstrategiaTransporte strategy1=new TransporteAereo();
        EstrategiaTransporte strategy2=new TransporteFerrea();
        Distribucion distribucion= new Distribucion(strategy1);
        distribucion.distribuir(articulos);
        distribucion.cambiarEstrategia(strategy2);
        distribucion.distribuir(articulos);
    }
}
