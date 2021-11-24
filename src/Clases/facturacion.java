/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * 
 * @author Esteban Mendez <emendez@edu.upolitecnica.cr>
 */
public class facturacion {
 private String fecha;
    private String nombre;
    private String apellidos;
    private String procedimiento;
    private double monto;
    private double descuento;
    private double impuesto;
    private double total;
    private String nombreCajero;

    public String getFecha() {
        return fecha;
    }   
    public String getNombre() {
        return nombre;
    }   
    public String getApellidos() {
        return apellidos;
    }   
    public String getProcedimiento() {
        return procedimiento;
    }       
    public double getMonto() {
        return monto;
    }   
    public double getDescuento() {
        return descuento;
    }
    public double getImpuesto() {
        return impuesto;
    }   
    public double getTotal() {
        return total;
    }   
    public String getNombreCajero() {
        return nombreCajero;
    }   
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }   
    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }   
    public void setMonto(double monto) {
        this.monto = monto;
    }   
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }   
    public void setTotal(double total) {
        this.total = total;
    }   
    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }   
}
