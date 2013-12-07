/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaConexion.Conexion;
import capaDatos.DatosServicios;

/**
 *
 * @author Johnny y karo
 */
public class NegocioProductosCliente {
    
     private Conexion cnn;

    public NegocioProductosCliente(){
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
 
}

