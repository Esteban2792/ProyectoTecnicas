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

public class procedimientos {
  private String TipoDeProcedimiento = "";
  private double PrecioDeProcedimiento;
  private String nombrePaciente;
  private String NumeroContrato;


public String getTipoDeProcedimiento() {
    return TipoDeProcedimiento;
}
public void setTipoDeProcedimiento(String tipoDeProcedimiento) {
    this.TipoDeProcedimiento = tipoDeProcedimiento;
}
  
  //getters y setters
    public double getPrecioDeProcedimiento() {
        return PrecioDeProcedimiento;}
    
        public void setPrecioDeProcedimiento(double precioDeProcedimiento) {
        this.PrecioDeProcedimiento = precioDeProcedimiento;}

        public String getNombrePaciente() {
        return nombrePaciente;}

        public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;}

        public String getNumeroContrato() {
        return NumeroContrato;}

        public void setNumeroContrato(String numeroContrato) {
        this.NumeroContrato = numeroContrato;}

        




}
    

