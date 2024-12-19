/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;

/**
 *
 * @author camper
 */
public class Cheque {
    public int ID;
    public int Numero_Cheque;
    public int ID_Cuenta;
    public String Beneficiario;
    public Double Monto;
    public String Monto_Letras;
    public String Prioridad;
    public String Firma_Digital;
    public String Estado;
    public String Razon_Rechazo;
    public Date Fecha_Emision;
    public Date Fecha_Proceso;
    public int Cobrado;
    public Double Cuenta_Saldo_Momento;
    public Date Fecha_Modificacion;
    public String Usuario_Modificacion;

    public Cheque(int ID, int Numero_Cheque, int ID_Cuenta, String Beneficiario, Double Monto, String Monto_Letras, String Prioridad, String Firma_Digital, String Estado, String Razon_Rechazo, Date Fecha_Emision, Date Fecha_Proceso, int Cobrado, Double Cuenta_Saldo_Momento, Date Fecha_Modificacion, String Usuario_Modificacion) {
        this.ID = ID;
        this.Numero_Cheque = Numero_Cheque;
        this.ID_Cuenta = ID_Cuenta;
        this.Beneficiario = Beneficiario;
        this.Monto = Monto;
        this.Monto_Letras = Monto_Letras;
        this.Prioridad = Prioridad;
        this.Firma_Digital = Firma_Digital;
        this.Estado = Estado;
        this.Razon_Rechazo = Razon_Rechazo;
        this.Fecha_Emision = Fecha_Emision;
        this.Fecha_Proceso = Fecha_Proceso;
        this.Cobrado = Cobrado;
        this.Cuenta_Saldo_Momento = Cuenta_Saldo_Momento;
        this.Fecha_Modificacion = Fecha_Modificacion;
        this.Usuario_Modificacion = Usuario_Modificacion;
    }
    
    
    public int getID(){
        return ID;
    }
    public int getNumero_Cheque(){
        return Numero_Cheque;
    }
    public int getID_Cuenta(){
        return ID_Cuenta;
    }
    public String getBeneficiario(){
        return Beneficiario;
    }
    public Double getMonto(){
        return Monto;
    }
    public String getMonto_Letras(){
        return Monto_Letras;
    }
    public String getPrioridad(){
        return Prioridad;
    }
    public String getFirma_Digital(){
        return Firma_Digital;
    }
    public String getEstado(){
        return Estado;
    }
    public String getRazon_Rechazo(){
        return Razon_Rechazo;
    }
    public Date getFecha_Emision(){
        return Fecha_Emision;
    }
    public Date getFecha_Proceso(){
        return Fecha_Proceso;
    }
    public int getCobrado(){
        return Cobrado;
    }
    public Double getCuenta_Saldo_Momento(){
        return Cuenta_Saldo_Momento;
    }
    public Date Fecha_Modificacion(){
        return Fecha_Modificacion;
    }
    public String getUsuario_Modificacion(){
        return Usuario_Modificacion;
    }
    
    
    public void setID(int ID){
        ID = ID;
    }
    public void setNumero_Cheque(String Numero_Cheque){
        Numero_Cheque = Numero_Cheque;
    }
    
    public void setID_Cuenta(int ID_Cuenta){
        ID_Cuenta = ID_Cuenta;
    }
    public void setBeneficiario(String Beneficiario){
        Beneficiario = Beneficiario;
    }
    
    public void setMonto(Double Monto){
        Monto = Monto;
    }
    public void setMonto_Letras(String Monto_Letras){
        Monto_Letras = Monto_Letras;
    }
    public void setPrioridad(String Prioridad){
        Prioridad = Prioridad;
    }
    public void setFirma_Digital(String Firma_Digital){
        Firma_Digital = Firma_Digital;
    }
    public void setEstado(String Estado){
        Estado = Estado;
    }
    public void setRazon_Rechazo(String Razon_Rechazo){
        Razon_Rechazo = Razon_Rechazo;
    }
    public void setFecha_Emision(Date Fecha_Emision){
        Fecha_Emision = Fecha_Emision;
    }
    public void setFecha_Proceso(Date Fecha_Proceso){
        Fecha_Proceso = Fecha_Proceso;
    }
    public void setCobrado(int Cobrado){
        Cobrado = Cobrado;
    }
    public void setCuenta_Saldo_Momento(Double Cuenta_Saldo_Momento){
        Cuenta_Saldo_Momento = Cuenta_Saldo_Momento;
    }
    public void setFecha_Modificacion(Date Fecha_Modificacion){
        Fecha_Modificacion = Fecha_Modificacion;
    }
    public void setUsuario_Modificacion(String Usuario_Modificacion){
        Usuario_Modificacion = Usuario_Modificacion;
    }
    
}
