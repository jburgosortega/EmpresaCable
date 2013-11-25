/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDatos;

/**
 *
 * @author Johnny y karo
 */
public class Datos {

    private String Nombre;
    private String Apellido;
    private int Rut;
    private String FechaNacimiento;
    private String Sexo;
    private String Correo;
    private int NroTelefono;
    private int NroCelular;
    private String Direccion;
    private int Numero;
    private String Comuna;   
    private String CodigoVerificador;    
    private String Contraseña;    
    /**
     *
     */
    public static String Comparar;
    public static int Comparar2;

    public Datos(String Nombre, String Apellido, int Rut, String FechaNacimiento, String Sexo,
            String Correo, int NroTelefono, int NroCelular, String Direccion, int Numero,
            String Comuna,String CodigoVerificador, 
            String Contraseña, String Comparar,int Comparar2) {


        this.Nombre = "";
        this.Apellido = "";
        this.Rut = 0;
        this.FechaNacimiento = "";
        this.Sexo = "";
        this.Correo = "";
        this.NroTelefono = 0;
        this.NroCelular = 0;
        this.Direccion = "";
        this.Numero = 0;
        this.Comuna = "";        
        this.CodigoVerificador = "";        
        this.Contraseña = "";
        Datos.Comparar = "";
        Datos.Comparar2 = 0;
    }

    public Datos() {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Rut = Rut;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
        this.Correo = Correo;
        this.NroTelefono = NroTelefono;
        this.NroCelular = NroCelular;
        this.Direccion = Direccion;
        this.Numero = Numero;
        this.Comuna = Comuna;       
        this.CodigoVerificador = CodigoVerificador;        
        this.Contraseña = Contraseña;
        Datos.Comparar = Comparar;
        Datos.Comparar2 = Comparar2;
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
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
  
    /**
     * @return the FechaNacimiento
     */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param  the FechaNacimiento to set
     */
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the NroTelefono
     */
    public int getNroTelefono() {
        return NroTelefono;
    }

    /**
     * @param NroTelefono the NroTelefono to set
     */
    public void setNroTelefono(int NroTelefono) {
        this.NroTelefono = NroTelefono;
    }

    /**
     * @return the NroCelular
     */
    public int getNroCelular() {
        return NroCelular;
    }

    /**
     * @param NroCelular the NroCelular to set
     */
    public void setNroCelular(int NroCelular) {
        this.NroCelular = NroCelular;
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
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Comuna
     */
    public String getComuna() {
        return Comuna;
    }

    /**
     * @param Comuna the Comuna to set
     */
    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }
    /**
     * @return the CodigoVerificador
     */
    public String getCodigoVerificador() {
        return CodigoVerificador;
    }

    /**
     * @param CodigoVerificador the CodigoVerificador to set
     */
    public void setCodigoVerificador(String CodigoVerificador) {
        this.CodigoVerificador = CodigoVerificador;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Rut
     */
    public int getRut() {
        return Rut;
    }

    /**
     * @param Rut the Rut to set
     */
    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    /**
     * @return the Comparar
     */
    public String getComparar() {
        return Comparar;
    }

    /**
     * @param Comparar the Comparar to set
     */
    public void setComparar(String Comparar) {
        Datos.Comparar = Comparar;
    }
    
     /**
     * @return the Comparar2
     */
    public int getComparar2() {
        return Comparar2;
    }

    /**
     * @param Comparar the Comparar to set
     */
    public void setComparar2(int Comparar2) {
        Datos.Comparar2 = Comparar2;
    }

    
    
}
