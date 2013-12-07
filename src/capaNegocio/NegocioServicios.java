/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaConexion.Conexion;
import capaDatos.DatosCliente;
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
                + asd.getFechaContratacion() + "')");


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

        cnn.setSentenciaSQL("insert into Listadecodificadores values("
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
                
                

            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return asd;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////Buscar idContratado segun RutCLiente///////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<DatosServicios> getidContratados() {
        this.configurarConexion();
        ArrayList<DatosServicios> listaidContratados = new ArrayList();
        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select idContratado from Contratado"
                  + "where Cliente_Rut = "+ DatosCliente.Comparar2);
        cnn.conectar();
        try {
            while (cnn.getRst().next()) {
                DatosServicios qwe = new DatosServicios();
              qwe.setIdContratado(cnn.getRst().getInt("idContratado"));
                
                
                listaidContratados.add(qwe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return listaidContratados;
    }
   ////////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////Buscar Lista PackCanales///////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public DatosServicios buscarListaPackCanales() {
        DatosServicios asd = new DatosServicios();
        this.configurarConexion();

        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + "Contratado"
                + " where ListaPackCanales="); //Imcompleto);
        cnn.conectar();
        try {
            if (cnn.getRst().next()) {
                asd.setIdListaPackCanales(cnn.getRst().getInt("PackCanales_idPackCanales"));
                asd.setIdContratado(cnn.getRst().getInt("Contratado_idContratado"));               

            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return asd;
    }
   
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////Obtener Datos Cotratados en Lista/////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    

    public ArrayList<DatosServicios> getDatosServicios() {
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
                

                listaServicios.add(asd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return listaServicios;
    }    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
   
}
