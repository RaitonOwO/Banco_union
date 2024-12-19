/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;

/**
 *
 * @author camper
 */
public class Transacciones {
    public int ID;
    public int ID_Cuenta;
    public String Tipo;
    public Double Monto;
    public String Referencia;
    public Date Fecha;
    public Double Saldo_Anterior;
    public Double Saldo_Nuevo;
    public String Estado;

    public Transacciones(int ID, int ID_Cuenta, String Tipo, Double Monto, String Referencia, Date Fecha, Double Saldo_Anterior, Double Saldo_Nuevo, String Estado) {
        this.ID = ID;
        this.ID_Cuenta = ID_Cuenta;
        this.Tipo = Tipo;
        this.Monto = Monto;
        this.Referencia = Referencia;
        this.Fecha = Fecha;
        this.Saldo_Anterior = Saldo_Anterior;
        this.Saldo_Nuevo = Saldo_Nuevo;
        this.Estado = Estado;
    }


    
    public int getID(){
        return ID;
    }
    public int getID_Cuenta(){
        return ID_Cuenta;
    }
    public String getTipo(){
        return Tipo;
    }
    public Double getMonto(){
        return Monto;
    }
    public Date getFecha(){
        return Fecha;
    }
    public String getReferencia(){
        return Referencia;
    }
    public String getEstado(){
        return Estado;
    }
    
    
    
    public void setID(int ID){
        ID = ID;
    }
    public void setID_Cuenta(int ID_Cuenta){
        ID_Cuenta = ID_Cuenta;
    }
    public void setTipo(String Tipo){
        Tipo = Tipo;
    }
    public void setMonto(String Monto){
        Monto = Monto;
    }
    public void setFecha(Date Fecha){
        Fecha = Fecha;
    }
    public void setReferencia(String Referencia){
        Referencia = Referencia;
    }
    public void setEstado(String Estado){
        Estado = Estado;
    }
    
}
