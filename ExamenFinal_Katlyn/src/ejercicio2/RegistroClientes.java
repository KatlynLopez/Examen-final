/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alelo
 *
 */

 public class RegistroClientes {
     
 class Cliente {
    String nombre;
    int numeroCliente;
    double saldo;

    public Cliente(String nombre, int numeroCliente, double saldo) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.saldo = saldo;
    }
   }

    private final ArrayList<Object> clientes;
    

    public RegistroClientes() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(int numeroCliente) {
        Iterator<Object> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = (Cliente) iterator.next();
            if (cliente.numeroCliente == numeroCliente) {
                iterator.remove();
                break;
            }
        }
    }
    public double calcularSaldoTotal() {
        double saldoTotal = 0;
        for (Cliente cliente : clientes) {
            saldoTotal += cliente.saldo;
        }
        return saldoTotal;
    }

    
    }

