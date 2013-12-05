/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaConexion.Conexion;
import capaDatos.DatosProductos;
import capaDatos.DatosServicios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johnny y karo
 */
public class NegocioServicios {
    
    
    private Conexion cnn;

    public NegocioServicios() {
        this.cnn = new Conexion();
    }

    private void configurarConexion() {
        cnn.setNombreBaseDatos("Metropolis");

        cnn.setDriver("com.mysql.jdbc.Driver");
        cnn.setUrl("jdbc:mysql://localhost:3306/"
                + cnn.getNombreBaseDatos());

        cnn.setNombreTabla("Contratado");
        cnn.setUser("root");
        cnn.setPassword("");
    }

    public void ingresarDatos(DatosServicios asd) {
        this.configurarConexion();
        cnn.setEsSelect(false);

        cnn.setSentenciaSQL("insert into " + cnn.getNombreTabla()
                + " values("
                + asd.getIdContratado() + ","
                + asd.getRutCliente() + ",'"
                + asd.getFechaContratacion() + "','"                
                + asd.getDireccion()     + "')");


        cnn.conectar();
        cnn.cerrarConexion();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////ListaPackCanales///////////////////////////////////////
    public void ingresarContratoCanales(DatosServicios asd, DatosProductos dsa) {
        this.configurarConexion();
        cnn.setEsSelect(false);

        cnn.setSentenciaSQL("insert into ListaPackCanales values("
                + dsa.getIdPackCanales() + ","                         
                + asd.getIdContratado()     + ")");

        cnn.conectar();
        cnn.cerrarConexion();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    
    ///////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////ListaDecodificador///////////////////////////////////////
    public void ingresarContratoDecodificador(DatosServicios asd, DatosProductos dsa) {
        this.configurarConexion();
        cnn.setEsSelect(false);

        cnn.setSentenciaSQL("insert into ListaPackDecodificadores values("
                + dsa.getIdDecodificador() + ","                         
                + asd.getIdContratado()     + ")");

        cnn.conectar();
        cnn.cerrarConexion();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public DatosServicios buscarDatos(int Rut) {
        DatosServicios asd = new DatosServicios();
        this.configurarConexion();

        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + "Contratado"
                + " where Cliente_Rut=" + Rut);
        cnn.conectar();
        try {
            if (cnn.getRst().next()) {
                asd.setRutCliente(cnn.getRst().getInt("Cliente_Rut"));
                asd.setIdContratado(cnn.getRst().getInt("idContratado"));
                asd.setFechaContratacion(cnn.getRst().getString("Fecha"));                
                asd.setDireccion(cnn.getRst().getString("Direccion"));
                

            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return asd;
    }
    
    

    public ArrayList<DatosServicios> getDatosServicioses() {
        this.configurarConexion();
        ArrayList<DatosServicios> listaServicios = new ArrayList();
        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + cnn.getNombreTabla());
        cnn.conectar();
        try {
            while (cnn.getRst().next()) {
                DatosServicios asd = new DatosServicios();
                asd.setRutCliente(cnn.getRst().getInt("Cliente_Rut"));
                asd.setIdContratado(cnn.getRst().getInt("idContratado"));
                asd.setFechaContratacion(cnn.getRst().getString("Fecha"));                
                asd.setDireccion(cnn.getRst().getString("Direccion"));

                listaServicios.add(asd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return listaServicios;

    }
    
   
}
