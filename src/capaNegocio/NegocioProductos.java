/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaConexion.Conexion;
import capaDatos.DatosProductos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johnny y karo
 */
public class NegocioProductos {

    private Conexion cnn;

    /**
     *
     */
    public NegocioProductos() {
        this.cnn = new Conexion();


    }
    
    private void configurarConexion() {
        cnn.setNombreBaseDatos("Metropolis");

        cnn.setDriver("com.mysql.jdbc.Driver");
        cnn.setUrl("jdbc:mysql://localhost:3306/"
                + cnn.getNombreBaseDatos());

        cnn.setNombreTabla("" + DatosProductos.getComparar());
        cnn.setUser("root");
        cnn.setPassword("");
    }
  

    /**
     *
     * @param idPackCanales
     * @return
     */
    public DatosProductos buscarDatosPackCanales(int idPackCanales) {
        DatosProductos asd = new DatosProductos();
        this.configurarConexion();

        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + "PackCanales"
                + " where idPackCanales=" + idPackCanales);
        cnn.conectar();
        try {
            if (cnn.getRst().next()) {
                asd.setIdPackCanales(cnn.getRst().getInt("idPackCanales"));
                asd.setNombrePackCanales(cnn.getRst().getString("Nombre"));
                asd.setTipoPackCanales(cnn.getRst().getString("Tipo"));
                asd.setPrecioPackCanales(cnn.getRst().getInt("Precio"));                

            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return asd;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<DatosProductos> getDatos() {
        this.configurarConexion();
        ArrayList<DatosProductos> listaNombre = new ArrayList();
        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from PackCanales");
        cnn.conectar();
        try {
            while (cnn.getRst().next()) {
                DatosProductos asd = new DatosProductos();
              asd.setNombre(cnn.getRst().getString("Nombre"));
                
                
                listaNombre.add(asd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return listaNombre;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<DatosProductos> getDatosCanal() {
        this.configurarConexion();
        ArrayList<DatosProductos> listaCanal = new ArrayList();
        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from Canal");
        cnn.conectar();
        try {
            while (cnn.getRst().next()) {
                DatosProductos asd = new DatosProductos();
              
              asd.setIdCanal(cnn.getRst().getInt("PackCanales_idPackCanales"));  
              asd.setNombreCanal(cnn.getRst().getString("Nombre"));
                
                
                listaCanal.add(asd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return listaCanal;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    
    /**
     *
     * @param idDecodificador
     * @return
     */
    public DatosProductos buscarDatosDecodificador(int idDecodificador) {
        DatosProductos asd = new DatosProductos();
        this.configurarConexion();

        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from "
                + "decodificador"
                + " where idDecodificador=" + idDecodificador);
        cnn.conectar();
        try {
            if (cnn.getRst().next()) {
                asd.setIdDecodificador(cnn.getRst().getInt("idDecodificador"));
                asd.setNombreDecodificador(cnn.getRst().getString("Nombre"));
                asd.setTipoDecodificador(cnn.getRst().getString("Tipo"));
                asd.setPrecioDecodificador(cnn.getRst().getInt("Precio"));                

            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return asd;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    public ArrayList<DatosProductos> getDatosDecodificadores() {
        this.configurarConexion();
        ArrayList<DatosProductos> listaDecodificador = new ArrayList();
        cnn.setEsSelect(true);
        cnn.setSentenciaSQL("select * from Decodificador");
        cnn.conectar();
        try {
            while (cnn.getRst().next()) {
                DatosProductos asd = new DatosProductos();  
              
              asd.setNombreDecodificador(cnn.getRst().getString("nombre"));               
                
                listaDecodificador.add(asd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(capaNegocio.NegocioProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn.cerrarConexion();
        return listaDecodificador;
   
    }
}
