/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDatos;

/**
 *
 * @author Johnny y karo
 */
public class DatosProductos {

    

    private int idPackCanales;
    private String NombrePackCanales;
    private String TipoPackCanales;
    private int PrecioPackCanales;
    private String NombreCanal;
    private int idCanal;
    private int idDecodificador;
    private String NombreDecodificador;
    private String TipoDecodificador;
    private int PrecioDecodificador;
    /**
     *
     */
    private static String Comparar;
    private String Nombre;
    private static int Comparar2;

    public DatosProductos(int idPackCanales, String NombrePackCanales, String TipoPackCanales,
            int PrecioPackCanales,String NombreCanal,int idCanal,
            int idDecodificador, String NombreDecodificador,
            String TipoDecodificador, int PrecioDecodificador,String Nombre) {

        
        this.NombreCanal = ""; 
        this.idCanal = 0;
        this.idDecodificador = 0;
        this.idPackCanales = 0;
        this.NombrePackCanales = "";
        this.TipoPackCanales = "";
        this.PrecioPackCanales = 0;
        this.NombreDecodificador = "";
        this.TipoDecodificador = "";
        this.PrecioDecodificador = 0;
        this.Nombre = "";
    }  
     public DatosProductos() {

        this.NombreCanal = NombreCanal; 
        this.idCanal = idCanal; 
        this.idDecodificador = idDecodificador;
        this.idPackCanales = idPackCanales;
        this.NombrePackCanales = NombrePackCanales;
        this.TipoPackCanales = TipoPackCanales;
        this.PrecioPackCanales = PrecioPackCanales;
        this.NombreDecodificador = NombreDecodificador;
        this.TipoDecodificador = TipoDecodificador;
        this.PrecioDecodificador = PrecioDecodificador;
        this.Nombre = Nombre;
    }  

    /**
     * @return the idPackCanales
     */
    public int getIdPackCanales() {
        return idPackCanales;
    }

    /**
     * @param idPackCanales the idPackCanales to set
     */
    public void setIdPackCanales(int idPackCanales) {
        this.idPackCanales = idPackCanales;
    }

    /**
     * @return the NombrePackCanales
     */
    public String getNombrePackCanales() {
        return NombrePackCanales;
    }

    /**
     * @param NombrePackCanales the NombrePackCanales to set
     */
    public void setNombrePackCanales(String NombrePackCanales) {
        this.NombrePackCanales = NombrePackCanales;
    }

    /**
     * @return the TipoPackCanales
     */
    public String getTipoPackCanales() {
        return TipoPackCanales;
    }

    /**
     * @param TipoPackCanales the TipoPackCanales to set
     */
    public void setTipoPackCanales(String TipoPackCanales) {
        this.TipoPackCanales = TipoPackCanales;
    }

    /**
     * @return the PrecioPackCanales
     */
    public int getPrecioPackCanales() {
        return PrecioPackCanales;
    }

    /**
     * @param PrecioPackCanales the PrecioPackCanales to set
     */
    public void setPrecioPackCanales(int PrecioPackCanales) {
        this.PrecioPackCanales = PrecioPackCanales;
    }

    /**
     * @return the idDecodificador
     */
    public int getIdDecodificador() {
        return idDecodificador;
    }

    /**
     * @param idDecodificador the idDecodificador to set
     */
    public void setIdDecodificador(int idDecodificador) {
        this.idDecodificador = idDecodificador;
    }

    /**
     * @return the NombreDecodificador
     */
    public String getNombreDecodificador() {
        return NombreDecodificador;
    }

    /**
     * @param NombreDecodificador the NombreDecodificador to set
     */
    public void setNombreDecodificador(String NombreDecodificador) {
        this.NombreDecodificador = NombreDecodificador;
    }

    /**
     * @return the TipoDecodificador
     */
    public String getTipoDecodificador() {
        return TipoDecodificador;
    }

    /**
     * @param TipoDecodificador the TipoDecodificador to set
     */
    public void setTipoDecodificador(String TipoDecodificador) {
        this.TipoDecodificador = TipoDecodificador;
    }

    /**
     * @return the PrecioDecodificador
     */
    public int getPrecioDecodificador() {
        return PrecioDecodificador;
    }

    /**
     * @param PrecioDecodificador the PrecioDecodificador to set
     */
    public void setPrecioDecodificador(int PrecioDecodificador) {
        this.PrecioDecodificador = PrecioDecodificador;
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
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the NombreCanal
     */
    public String getNombreCanal() {
        return NombreCanal;
    }

    /**
     * @param NombreCanal the NombreCanal to set
     */
    public void setNombreCanal(String NombreCanal) {
        this.NombreCanal = NombreCanal;
    }

    /**
     * @return the idCanal
     */
    public int getIdCanal() {
        return idCanal;
    }

    /**
     * @param idCanal the idCanal to set
     */
    public void setIdCanal(int idCanal) {
        this.idCanal = idCanal;
    }
  
}
