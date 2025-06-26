/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author Laboratorio
 */
public class Factura {
private String nombreCliente;
private String cedulaCliente;
private String codigoFactura;
private double montoFactura;
private int mes;
private double productosElectricos;
private double productosAutomotrices;
private double productosConstruccion;
private String sale;


        public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double montoFactura, int mes, int productosElectricos, int productosAutomotrices, int productosConstruccion, String sale) {
            this.nombreCliente = nombreCliente;
            this.cedulaCliente = cedulaCliente;
            this.codigoFactura = codigoFactura;
            this.montoFactura = montoFactura;
            this.mes = mes;
            this.productosElectricos = productosElectricos;
            this.productosAutomotrices = productosAutomotrices;
            this.productosConstruccion = productosConstruccion;
        }
public double calcularComision(){
    double base = montoFactura; 
    double bono = 0;
    
    
    if(productosElectricos>=1 && productosAutomotrices>=1 && productosConstruccion>= 1)bono += base * 0.10;
    if(3 < productosElectricos)bono += base * 0.04;
    if(productosElectricos<3)bono += base * 0.02;
    if(productosAutomotrices > 4)bono += base * 0.04;
    if(productosAutomotrices<4)bono += base * 0.02;
    if(productosConstruccion>=1)bono += base * 0.08;
    if(montoFactura > 50000)bono += base * 0.05;
    
    
    
    
    return base + bono;
}

public int calcularPuntos(){
    int puntos = 0;
    if(productosAutomotrices>=1 && productosConstruccion>=1 && productosElectricos>=1)puntos += 3;
    if(productosElectricos>=3)puntos += 1;
    if(productosAutomotrices>4)puntos += 1;
    if(productosConstruccion>=1)puntos += 2;
    if(montoFactura > 50000)puntos += 1;
    
    return puntos;
}

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getProductosElectricos() {
        return productosElectricos;
    }

    public void setProductosElectricos(double productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public double getProductosAutomotrices() {
        return productosAutomotrices;
    }

    public void setProductosAutomotrices(double productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }

    public double getProductosConstruccion() {
        return productosConstruccion;
    }

    public void setProductosConstruccion(double productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    


   
    


    



}
