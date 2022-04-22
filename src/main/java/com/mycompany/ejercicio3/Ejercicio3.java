/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author Morocho
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        var cliente1 = new Cliente();
        cliente1.nombre = "Juan";
        cliente1.cedula="0105240563";
        cliente1.telefono="0960183008";
        
        var Producto = new Pruducto();
        Producto.tipo = "Caramelos";
        Producto.fechaDeElaboracion=2022;
        Producto.tiempoDuracion=1;
        
        var factura1 = new Factura();
        factura1.numeroFactura=1254;
        factura1.serie=000554654;
        factura1.fechaEmitida=2022;
        factura1.unProducto=Pruducto;
        factura1.unCliente=Cliente;
        
        System.out.println("La factura con numero de serie: "+factura1.numeroFactura+
                            " es de la cliente: "+factura1.unCliente.nombre);
    }
}
