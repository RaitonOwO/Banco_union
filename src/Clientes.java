/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;

/**
 *
 * @author camper
 */
public class Clientes {
    public int ID;
    public String Nombre;
    public String Apellido;
    public String Direccion;
    public String Telefono;
    public String Correo;
    public Date Fecha_Registro;

    public Clientes(int ID,String Nombre, String Apellido, String Direccion, String Telefono, String Correo, Date Fecha_Registro) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Fecha_Registro = Fecha_Registro;
    }
    
    
    
    
    public int getID(){
        return ID;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getDireccion(){
        return Direccion;
    }
    public String getTelefono(){
        return Telefono;
    }
    public String getCorreo(){
        return Correo;
    }
    public Date getFecha_Registro(){
        return Fecha_Registro;
    }
    
    
    public void setID(int ID){
        ID = ID;
    } 
    public void setNombre(String Nombre){
        Nombre = Nombre;
    }
    public void setDireccion(String Direccion){
        Direccion = Direccion;
    }
    public void setTelefono(String Telefono){
        Telefono = Telefono;
    }
    public void setCorreo(String Correo){
        Correo = Correo;
    }
    public void setFecha_Registro(Date Fecha_Registro){
        Fecha_Registro = Fecha_Registro;
    }
    
            
    
    
    
}
