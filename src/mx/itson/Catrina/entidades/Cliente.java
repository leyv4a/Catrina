/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Catrina.entidades;

import com.google.gson.Gson;

/**
 *
 * @author gabri
 */
public class Cliente {

    private String codigo;
    private String nombre;
    private String domicilio;
    private String ciudad;
    private String rfc;
    private int cp;

//    public Cliente deserializar(String json) {
//        Cliente cliente = new Cliente();
//
//        try {
//            cliente = new Gson().fromJson(json, Cliente.class);
//        } catch (Exception ex) {
//            System.err.print("Ocurrió un error: " + ex.getMessage());
//        }
//        return cliente;
//
//    }
//
//    public Object[] ObtenerDatos() {
//        Object[] Datos = {getNombre(), getDomicilio(), getCiudad(), getRfc(), getCp()};
//        return Datos;
//    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the cp
     */
    public int getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(int cp) {
        this.cp = cp;
    }

}
