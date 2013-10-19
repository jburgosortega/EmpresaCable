/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDatos;

/**
 *
 * @author Johnny y karo
 */
public class DatosDecodificadores {

    private int Rut;
    private int DecodificadorSD;
    private int DecodificadorHD;
    private int DecodificadorFullHD;

    public DatosDecodificadores(int Rut, int DecodificadorSD,
            int DecodificadorHD, int DecodificadorFullHD) {


        this.Rut = 0;
        this.DecodificadorSD = 0;
        this.DecodificadorHD = 0;
        this.DecodificadorFullHD = 0;
    }

    public DatosDecodificadores() {
        this.Rut = Rut;
        this.DecodificadorSD = DecodificadorSD;
        this.DecodificadorHD = DecodificadorHD;
        this.DecodificadorFullHD = DecodificadorFullHD;
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
     * @return the DecodificadorSD
     */
    public int getDecodificadorSD() {
        return DecodificadorSD;
    }

    /**
     * @param DecodificadorSD the DecodificadorSD to set
     */
    public void setDecodificadorSD(int DecodificadorSD) {
        this.DecodificadorSD = DecodificadorSD;
    }

    /**
     * @return the DecodificadorHD
     */
    public int getDecodificadorHD() {
        return DecodificadorHD;
    }

    /**
     * @param DecodificadorHD the DecodificadorHD to set
     */
    public void setDecodificadorHD(int DecodificadorHD) {
        this.DecodificadorHD = DecodificadorHD;
    }

    /**
     * @return the DecodificadorFullHD
     */
    public int getDecodificadorFullHD() {
        return DecodificadorFullHD;
    }

    /**
     * @param DecodificadorFullHD the DecodificadorFullHD to set
     */
    public void setDecodificadorFullHD(int DecodificadorFullHD) {
        this.DecodificadorFullHD = DecodificadorFullHD;
    }
}
