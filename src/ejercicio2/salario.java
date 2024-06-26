/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class salario {

    // Atributos
    
    private String cedula;
    private String nombre;
    private double salarioBasico=1300000;
    private int diasLaborados;
    private double ventasMes;
    private double prestamos;
    private double sueldoBase=0;
    private double auxTransporte=0;
    private double comisionMes=0;
    private double salarioNeto;
    
    public salario(String cedula, String nombre, double salarioBasico, int diasLaborados, double ventasMes, double prestamos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salarioBasico = 1300000;
        this.diasLaborados = diasLaborados;
        this.ventasMes = ventasMes;
        this.prestamos = prestamos;
    }
    
        public double sueldoBase() {
       sueldoBase = salarioBasico * diasLaborados / 30;
       return sueldoBase;
    }

        public double auxTransporte()
        {
            double salario=sueldoBase();
            if (salario > 0 && salario <= 2600000) {

            auxTransporte = 162000 * diasLaborados / 30;
            return auxTransporte;

        } else {
        return auxTransporte=0;
        }
    }
                 
          
        
         public double comisionMes() {
             comisionMes = 0.02 * ventasMes;
        return comisionMes ;
    }
            public double salarioNeto() {
                 double sueldoBase = sueldoBase();
                    double comisionMes = comisionMes();
                salarioNeto=sueldoBase+comisionMes-prestamos+auxTransporte;
        
        return salarioNeto;
    }
         
                public void mostrarInformacion() {
        String mensaje = "Cedula empleado: " + cedula +
                "\nNombre Empleado: " + nombre +
                "\nSalario Básicoa: " + salarioBasico +
                "\nAuxilio de Transporte: " + auxTransporte()  +
                "\nComisión de Ventas: " + comisionMes() +
                "\nPréstamos: " + prestamos +
                "\nSalario Neto a Recibir: " + salarioNeto();
        JOptionPane.showMessageDialog(null, mensaje, "Información del Vendedor", JOptionPane.INFORMATION_MESSAGE);
    }
         
        public static void main(String[] args) {
        
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado: ");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
        double sueldoBase = 1300000; 
        int diasLaborados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días laborados: "));
        double ventasMes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor total de las ventas del mes: "));
        double prestamos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los descuentos por préstamos: "));

     
        salario vendedor = new salario(cedula, nombre, sueldoBase, diasLaborados, ventasMes, prestamos);
                         
        vendedor.mostrarInformacion();
    }
}