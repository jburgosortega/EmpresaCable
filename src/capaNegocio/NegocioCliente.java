/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaConexion.Conexion;
import capaDatos.DatosCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johnny y karo
 */
public class NegocioCliente {

    private Conexion cnn;

    public NegocioCliente() {
        this.cnn = new Conexion();
    }

    private void configurarConexion() {
        cnn.setNombreBaseDatos("Metropolis");

        cnn.setDriver("com.mysql.jdbc.Driver");
        cnn.setUrl("jdbc:mysql://localhost:3306/"
                + cnn.getNombreBaseDatos());

        cnn.setNombreTabla("Cliente");
        cnn.setUser("root");
        cnn.setPassword("");
    }

    public void ingresarDatos(DatosCliente asd) {
        this.configurarConexion();
        cnn.setEsSelect(false);

        cnn.setSentenciaSQL("insert into " + cnn.getNombreTabla()
                + " values("
                + asd.getRut() + ",'"
                + asd.getNombre() + "','"
                + asd.getApellido() + "','"
                + asd.getFechaNacimiento() + "','"
                + asd.getSexo() + "','"
                + asd.getCorreo() + "',"
                + asd.getNroTelefono() + ","
                + asd.getNroCelular() + ",'"
                + asd.getDireccion() + "',"
                + asd.getNumero() + ",'"
                + asd.getContraseña() + "','"
                + asd.getComuna()     + "')");


        cnn.conectar();
        cnn.cerrarConexion();
    }

    public DatosCliente buscarDatos(int Rut) {
        DatosCliente asd = new DatosCliente();
        this.configurarConexion();

        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + "cliente"
                + " where Rut=" + Rut);
        cnn.conectar();
        try {
            if (cnn.getRst().next()) {
                asd.setRut(cnn.getRst().getInt("Rut"));
                asd.setNombre(cnn.getRst().getString("Nombre"));
                asd.setApellido(cnn.getRst().getString("Apellido"));
                asd.setFechaNacimiento(cnn.getRst().getString("FechaNacimiento"));
                asd.setSexo(cnn.getRst().getString("Sexo"));
                asd.setCorreo(cnn.getRst().getString("Correo"));
                asd.setNroTelefono(cnn.getRst().getInt("NroTelefono"));
                asd.setNroCelular(cnn.getRst().getInt("NroCelular"));
                asd.setDireccion(cnn.getRst().getString("Direccion"));
                asd.setNumero(cnn.getRst().getInt("Numero"));
                asd.setContraseña(cnn.getRst().getString("Contrasena"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return asd;
    }

    public ArrayList<DatosCliente> getDatos() {
        this.configurarConexion();
        ArrayList<DatosCliente> lista = new ArrayList();
        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + cnn.getNombreTabla());
        cnn.conectar();
        try {
            while (cnn.getRst().next()) {
                DatosCliente asd = new DatosCliente();
                asd.setRut(cnn.getRst().getInt("Rut"));
                asd.setNombre(cnn.getRst().getString("Nombre"));
                asd.setApellido(cnn.getRst().getString("Apellido"));
                asd.setFechaNacimiento(cnn.getRst().getString("FechaNacimiento"));
                asd.setSexo(cnn.getRst().getString("Sexo"));
                asd.setCorreo(cnn.getRst().getString("Correo"));
                asd.setNroTelefono(cnn.getRst().getInt("NroTelefono"));
                asd.setNroCelular(cnn.getRst().getInt("NroCelular"));
                asd.setDireccion(cnn.getRst().getString("Direccion"));
                asd.setNumero(cnn.getRst().getInt("Numero"));
                asd.setContraseña(cnn.getRst().getString("Contrasena"));

                lista.add(asd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return lista;

    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////Mostrar Comunas////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<DatosCliente> getDatos2() {
        this.configurarConexion();
        ArrayList<DatosCliente> lista2 = new ArrayList();
        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from Comuna");
        cnn.conectar();
        try {
            while (cnn.getRst().next()) {
                DatosCliente asd = new DatosCliente();                
                asd.setComuna((cnn.getRst().getInt("idComuna")+" .- "+
                             (cnn.getRst().getString("Nombre"))));
                
                lista2.add(asd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return lista2;

    }
    //////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
}
