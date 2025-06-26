/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class CASO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreEmpresa = JOptionPane.showInputDialog("Nombre de la empresa: ");

        //Datos del agente
        String nombre = JOptionPane.showInputDialog("Nombre del agente: ");
        String cedula = JOptionPane.showInputDialog("Cedula del agente: ");
        String codigo = JOptionPane.showInputDialog("Codigo del agente");
        String sucursal = JOptionPane.showInputDialog("Sucursal asignada: ");
        int vehiculo = JOptionPane.showConfirmDialog(null, "Tiene vehiculo propio?", "Vehiculo", JOptionPane.YES_NO_OPTION);
        boolean tieneVehiculo = vehiculo == 0;

        Agente agente = new Agente(nombre, cedula, codigo, sucursal, tieneVehiculo);

        //Recoleccion de Clientes
        int totalVentas = 0;
        double totalComisiones = 0;
        double totalMonto = 0;
        int totalPuntos = 0;
        String continuar;

        do {
            String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente");
            String cedulaCliente = JOptionPane.showInputDialog("Cedula del cliente: ");
            String codFactura = JOptionPane.showInputDialog("Digite el codigo de la factura: ");
            double montoDeFactura = Double.parseDouble(JOptionPane.showInputDialog("El monto de la factura es: "));

            int mes;
            do {
                mes = Integer.parseInt(JOptionPane.showInputDialog("Número del mes (1 y 12): "));
            } while (mes < 1 || mes > 12);

            String productosE = JOptionPane.showInputDialog("Cuantos productos electricos tiene?: ");
            String productosA = JOptionPane.showInputDialog("Cuantos productos de automotrices tiene?: ");
            String productosC = JOptionPane.showInputDialog("Cuantos productos de construccion tiene?: ");

            String sale = JOptionPane.showInputDialog("Completo la compra? (Completado, Cancelado): ");
            
            Factura factu = new Factura(nombreCliente, cedulaCliente, codFactura, montoDeFactura, mes, productosE, productosA, productosC);
            
            if(sale.equalsIgnoreCase("Completado")){
                totalVentas++;
                totalMonto += montoDeFactura;
                totalComisiones += factu.calcularComision();
                totalPuntos += factu.calcularPuntos();
                
            }
            continuar = JOptionPane.showInputDialog("Desea hacer otra compra? Si/No");
                    
        }while (continuar.equalsIgnoreCase("Si"));
        
        //Evaluar bono extra
        boolean bonoExtra = (totalVentas > 3 || totalMonto > 300000);
        if (bonoExtra){
            totalComisiones += 20000;
            
            
            //Muestra resultados
            String resultado ="El agente " + agente.getName()+ "con cedula " +agente.getCédula() + "que esta en la sucursal de " +agente.getSucursal()+ "Tiene o no vehiculo: "+(agente.isVehiculoPropio() ? "Si" : "No");
            
            JOptionPane.showConfirmDialog(null, resultado);
        }
    
    }
    

}
