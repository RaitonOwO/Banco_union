/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;

/**
 *
 * @author camper
 */
public class Cuentas {
    public int ID;    
    public int ID_Cliente;
    public String Tipo;
    public Double Saldo;
    public Double Limite_Saldo;
    public Date Fecha_Apertura;
    public String Estado;

    public Cuentas(int ID, int ID_Cliente, String Tipo, Double Saldo, Double Limite_Saldo, Date Fecha_Apertura, String Estado) {
        this.ID = ID;
        this.ID_Cliente = ID_Cliente;
        this.Tipo = Tipo;
        this.Saldo = Saldo;
        this.Limite_Saldo = Limite_Saldo;
        this.Fecha_Apertura = Fecha_Apertura;
        this.Estado = Estado;
    }
    
    
    
    
    public int getID(){
        return ID;
    }
    
    public int getID_Cliente(){
        return ID_Cliente;
    }
    public String getTipo(){
        return Tipo;
    }
    public Double getSaldo(){
        return Saldo;
    }
    public Double getLimite_Saldo(){
        return Limite_Saldo;
    }
    public Date getFecha_Apertura(){
        return Fecha_Apertura;
    }
    public String getEstado(){
        return Estado;
    }
    
    
    public void setID(int ID){
        ID = ID;
    }
    public void setID_Cliente(int ID_Cliente){
        ID_Cliente = ID_Cliente;
    }
    public void setTipo(String Tipo){
        Tipo = Tipo;
    }
    
    public void setSaldo(Double Saldo){
        Saldo = Saldo;
    }
    public void setLimite_Saldo(Double Limite_Saldo){
        Limite_Saldo = Limite_Saldo;
    }
    public void setFecha_Apertura(Date Fecha_Apertura){
        Fecha_Apertura = Fecha_Apertura;
    }
    public void setEstado(String Estado){
        Estado = Estado;
    }
}
            