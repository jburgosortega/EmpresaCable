/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaConexion.Conexion;
import capaDatos.Datos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johnny y karo
 */
public class Negocio {

    private Conexion cnn;

    public Negocio() {
        this.cnn = new Conexion();
    }

    private void configurarConexion() {
        cnn.setNombreBaseDatos("Metropolis");

        cnn.setDriver("com.mysql.jdbc.Driver");
        cnn.setUrl("jdbc:mysql://localhost:3306/"
                + cnn.getNombreBaseDatos());

        cnn.setNombreTabla("RegistroDatos");
        cnn.setUser("root");
        cnn.setPassword("");
    }

    public void ingresarDatos(Datos asd) {
        this.configurarConexion();
        cnn.setEsSelect(false);

        cnn.setSentenciaSQL("insert into " + cnn.getNombreTabla()
                + " values("
                + asd.getRut() + ",'"
                + asd.getNombre() + "','"
                + asd.getApellido() + "',"
                + asd.getFechaNacimiento() + ",'"
                + asd.getSexo() + "','"
                + asd.getCorreo() + "',"
                + asd.getNroTelefono() + ","
                + asd.getNroCelular() + ",'"
                + asd.getDireccion() + "',"
                + asd.getNumero() + ",'"
                + asd.getComuna() + "','"               
                + asd.getContraseña() + "','"
                + asd.getCodigoVerificador() + "')");


        cnn.conectar();
        cnn.cerrarConexion();
    }

    public Datos buscarDatos(int Rut) {
        Datos asd = new Datos();
        this.configurarConexion();

        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + "RegistroDatos"
                + " where Rut=" + Rut);
        cnn.conectar();
        try {
            if (cnn.getRst().next()) {
                asd.setRut(cnn.getRst().getInt("Rut"));
                asd.setNombre(cnn.getRst().getString("Nombre"));
                asd.setApellido(cnn.getRst().getString("Apellido"));
                asd.setFechaNacimiento(cnn.getRst().getInt("FechaNacimiento"));
                asd.setSexo(cnn.getRst().getString("Sexo"));
                asd.setCorreo(cnn.getRst().getString("Correo"));
                asd.setNroTelefono(cnn.getRst().getInt("NroTelefono"));
                asd.setNroCelular(cnn.getRst().getInt("NroCelular"));
                asd.setDireccion(cnn.getRst().getString("Direccion"));
                asd.setNumero(cnn.getRst().getInt("Numero"));
                asd.setComuna(cnn.getRst().getString("Comuna"));                
                asd.setContraseña(cnn.getRst().getString("Contrasena"));
                asd.setCodigoVerificador(cnn.getRst().getString("codigoVerificador"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.Negocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return asd;
    }

    public ArrayList<Datos> getDatos() {
        this.configurarConexion();
        ArrayList<Datos> lista = new ArrayList();
        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + cnn.getNombreTabla());
        cnn.conectar();
        try {
            while (cnn.getRst().next()) {
                Datos asd = new Datos();
                asd.setRut(cnn.getRst().getInt("Rut"));
                asd.setNombre(cnn.getRst().getString("Nombre"));
                asd.setApellido(cnn.getRst().getString("Apellido"));
                asd.setFechaNacimiento(cnn.getRst().getInt("FechaNacimiento"));
                asd.setSexo(cnn.getRst().getString("Sexo"));
                asd.setCorreo(cnn.getRst().getString("Correo"));
                asd.setNroTelefono(cnn.getRst().getInt("NroTelefono"));
                asd.setNroCelular(cnn.getRst().getInt("NroCelular"));
                asd.setDireccion(cnn.getRst().getString("Direccion"));
                asd.setNumero(cnn.getRst().getInt("Numero"));
                asd.setComuna(cnn.getRst().getString("Comuna"));              
                asd.setContraseña(cnn.getRst().getString("Contrasena"));
                asd.setCodigoVerificador(cnn.getRst().getString("codigoVerificador"));
                lista.add(asd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.Negocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return lista;
    }
   
}
