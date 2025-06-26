/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author Laboratorio
 */
public class Agente {
private String name;
private String cédula;
private String codigoAgente;
private String sucursal;
private boolean vehiculoPropio;

    public Agente(String name, String cédula, String codigoAgente, String sucursal, boolean vehiculoPropio) {
        this.name = name;
        this.cédula = cédula;
        this.codigoAgente = codigoAgente;
        this.sucursal = sucursal;
        this.vehiculoPropio = vehiculoPropio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public String getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(String codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio(boolean vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }



    

}
