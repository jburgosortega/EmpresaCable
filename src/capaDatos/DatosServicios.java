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

  
    private int idListaPackCanales;
    private int idListaDecodificadores;
    private int idContratado;
    private int RutCliente;    
    private String FechaContratacion;
     
    /**
     *
     */
    private static String Comparar;
    private static int Comparar2;

    public DatosServicios(int idListaPackCanales,
        int idListaDecodificadores,int idContratado, int RutCliente,
            String FechaContratacion) {


        this.idListaPackCanales = 0;
        this.idListaDecodificadores = 0;
        this.idContratado = 0;
        this.RutCliente = 0;    
        this.FechaContratacion = "";
      
    }

    public DatosServicios() {
        
        this.idListaPackCanales = idListaPackCanales;
        this.idListaDecodificadores = idListaDecodificadores;
        this.idContratado = idContratado;
        this.RutCliente = RutCliente;    
        this.FechaContratacion = FechaContratacion;
       
        
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

    /**
     * @return the idListaPackCanales
     */
    public int getIdListaPackCanales() {
        return idListaPackCanales;
    }

    /**
     * @param idListaPackCanales the idListaPackCanales to set
     */
    public void setIdListaPackCanales(int idListaPackCanales) {
        this.idListaPackCanales = idListaPackCanales;
    }

    /**
     * @return the idListaDecodificadores
     */
    public int getIdListaDecodificadores() {
        return idListaDecodificadores;
    }

    /**
     * @param idListaDecodificadores the idListaDecodificadores to set
     */
    public void setIdListaDecodificadores(int idListaDecodificadores) {
        this.idListaDecodificadores = idListaDecodificadores;
    }
    
}
