/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Fernando Martínez
 */
public class Proveedores 
{
    private String nombre, admin;
    
    public Proveedores(){}
    
    public Proveedores(String nombre,String admin)
    {
        this.nombre = nombre;
        this.admin = admin;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getAdmin()
    {
        return admin;
    }
    public void setAdmin(String admin)
    {
        this.admin = admin;
    }
    
    
}
