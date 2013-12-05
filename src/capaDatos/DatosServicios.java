/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDatos;

/**
 *
 * @author Johnny y karo
 */
public class DatosServicios {

  
    
    private int idContratado;
    private int RutCliente;    
    private String FechaContratacion;
    private String Direccion;  
    /**
     *
     */
    private static String Comparar;
    private static int Comparar2;

    public DatosServicios(int idContratado, int RutCliente,
            String FechaContratacion, String Direccion) {


        this.idContratado = 0;
        this.RutCliente = 0;    
        this.FechaContratacion = "";
        this.Direccion = "";
        
    }

    public DatosServicios() {
        
        this.idContratado = idContratado;
        this.RutCliente = RutCliente;    
        this.FechaContratacion = FechaContratacion;
        this.Direccion = Direccion;
        
    }

    /**
     * @return the idContratado
     */
    public int getIdContratado() {
        return idContratado;
    }

    /**
     * @param idContratado the idContratado to set
     */
    public void setIdContratado(int idContratado) {
        this.idContratado = idContratado;
    }

    /**
     * @return the RutCliente
     */
    public int getRutCliente() {
        return RutCliente;
    }

    /**
     * @param RutCliente the RutCliente to set
     */
    public void setRutCliente(int RutCliente) {
        this.RutCliente = RutCliente;
    }

    /**
     * @return the FechaContratacion
     */
    public String getFechaContratacion() {
        return FechaContratacion;
    }

    /**
     * @param FechaContratacion the FechaContratacion to set
     */
    public void setFechaContratacion(String FechaContratacion) {
        this.FechaContratacion = FechaContratacion;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
      /**
     * @return the Comparar
     */
    public static String getComparar() {
        return Comparar;
    }

    /**
     * @param aComparar the Comparar to set
     */
    public static void setComparar(String aComparar) {
        Comparar = aComparar;
    }

    /**
     * @return the Comparar2
     */
    public static int getComparar2() {
        return Comparar2;
    }

    /**
     * @param aComparar2 the Comparar2 to set
     */
    public static void setComparar2(int aComparar2) {
        Comparar2 = aComparar2;
    }
    
}
