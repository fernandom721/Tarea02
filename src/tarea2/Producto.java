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
public class Producto 
{
    private String nombre, proveedor;
    private int cantidad;
    
    public Producto(){}
    
    public Producto(String nombre, String proveedor, int cantidad)
    {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getProveedor()
    {
        return proveedor;
    }
    public void setProveedor(String proveedor)
    {
        this.proveedor = proveedor;
    }
    public int getCantidad()
    {
        return cantidad;
    }
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
}
