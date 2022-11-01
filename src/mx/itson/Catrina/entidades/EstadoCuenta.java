/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Catrina.entidades;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import mx.itson.Catrina.entidades.*;
import mx.itson.Catrina.enumerador.Tipo;

/**
 *
 * @author gabri
 */
public class EstadoCuenta {

    private String producto;
    private String cuenta;
    private String clabe;
    private String moneda;
    private Cliente cliente;
    private List<Movimiento> movimientos;

    /**
     * @return the producto
     */
    public EstadoCuenta deserializar(String json) {
        EstadoCuenta cuenta = new EstadoCuenta();

        try {
            cuenta = new Gson().fromJson(json, EstadoCuenta.class);
        } catch (Exception ex) {
            System.err.print("Ocurrió un error: " + ex.getMessage());
        }
        return cuenta;

    }

    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Movimiento> FiltrarMovimientos(int mes) {
        List<Movimiento> obtenerMovimientos = new ArrayList();

        for (Movimiento obtenerMovimiento : movimientos) {
            if (obtenerMovimiento.getFecha().getMonth() == mes) {
                obtenerMovimientos.add(obtenerMovimiento);

            }
        }
        obtenerMovimientos.sort((m1, m2) -> m1.getFecha().compareTo(m2.getFecha()));
        return obtenerMovimientos;

    }

    public double ConsultarSaldoInicial(int mes) {
        double saldoInicial = 0;
        for (Movimiento movimiento : movimientos) {
            for (int i = 0; i < mes; i++) {
                if (movimiento.getFecha().getMonth() == i && movimiento.getTipo() == Tipo.DEPOSITO) {
                    saldoInicial = saldoInicial + movimiento.getCantidad();
                } else if (movimiento.getFecha().getMonth() == i && movimiento.getTipo() == Tipo.RETIRO) {
                    saldoInicial = saldoInicial - movimiento.getCantidad();
                }
            }
        }
        return saldoInicial;
    }



//public double ConsultarDepositos(int mes){
//
//
//}

}
