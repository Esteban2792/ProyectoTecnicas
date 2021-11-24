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
public class visitaPostOperatoria {
private String TipoVisita;
  private String NombrePaciente;
  private String FechaVisita;
  private String nombreDoctorString;

    public String getTipoVisita() {
        return TipoVisita;
    }   
    public void setTipoVisita(String tipoVisita) {
        this.TipoVisita = tipoVisita;
    }
    public String getNombrePaciente() {
        return NombrePaciente;
    }
    public void setNombrePaciente(String nombrePaciente) {
        this.NombrePaciente = nombrePaciente;
    }
    public String getFechaVisita() {
        return FechaVisita;
    }
    public void setFechaVisita(String fechaVisita) {
        this.FechaVisita = fechaVisita;
    }
    public String getNombreDoctorString() {
        return nombreDoctorString;
    }
    public void setNombreDoctorString(String nombreDoctorString) {
        this.nombreDoctorString = nombreDoctorString;
    }
    
}
