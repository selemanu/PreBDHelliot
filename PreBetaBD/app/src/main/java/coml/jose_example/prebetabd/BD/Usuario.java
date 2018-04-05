package coml.jose_example.prebetabd.BD;

import android.content.ContentValues;

/**
 * Created by jose_ on 05/04/2018.
 */

public class Usuario {

    private String Nombre,Correo,Edad,Pass,Modelo,Nacio;

    public Usuario(String nombre, String correo, String edad, String pass, String modelo, String nacio) {
        Nombre = nombre;
        Correo = correo;
        Edad = edad;
        Pass = pass;
        Modelo = modelo;
        Nacio = nacio;
    }

    public Usuario() {

    }

    public ContentValues toContentValues(){
        ContentValues values = new ContentValues();
        values.put(BDContract.UsuarioEntry.NOMBRE,Nombre);
        values.put(BDContract.UsuarioEntry.CORREO,Nombre);
        values.put(BDContract.UsuarioEntry.PASS,Nombre);
        return values;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getNacio() {
        return Nacio;
    }

    public void setNacio(String nacio) {
        Nacio = nacio;
    }
}
