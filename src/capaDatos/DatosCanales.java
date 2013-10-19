/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDatos;

/**
 *
 * @author Johnny y karo
 */
public class DatosCanales {

    private int Rut;
    private int PackBasico;
    private int PackHboPlus;
    private int PackMovieCity;
    private int PackDeporte;
    private int PackHboHD;
    private int PackMovieCityHD;
    private int PackDeporteHD;
    private int PackAdulto;

    public DatosCanales(int Rut, int PackBasico,int PackHboPlus,
            int PackMovieCity, int PackDeporte, int PackHboHD,
            int PackMovieCityHD, int PackDeporteHD, int PackAdulto) {

        this.Rut = 0;
        this.PackBasico = 1;
        this.PackHboPlus = 0;
        this.PackMovieCity = 0;
        this.PackDeporte = 0;
        this.PackHboHD = 0;
        this.PackMovieCityHD = 0;
        this.PackDeporteHD = 0;
        this.PackAdulto = 0;
    }

    public DatosCanales() {
        this.Rut = Rut;
        this.PackBasico = PackBasico;
        this.PackHboPlus = PackHboPlus;
        this.PackMovieCity = PackMovieCity;
        this.PackDeporte = PackDeporte;
        this.PackHboHD = PackHboHD;
        this.PackMovieCityHD = PackMovieCityHD;
        this.PackDeporteHD = PackDeporteHD;
        this.PackAdulto = PackAdulto;
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
     * @return the PackBasico
     */
    public int getPackBasico() {
        return PackBasico;
    }

    /**
     * @param PackBasico the PackBasico to set
     */
    public void setPackBasico(int PackBasico) {
        this.PackBasico = PackBasico;
    }

    /**
     * @return the PackHboPlus
     */
    public int getPackHboPlus() {
        return PackHboPlus;
    }

    /**
     * @param PackHboPlus the PackHboPlus to set
     */
    public void setPackHboPlus(int PackHboPlus) {
        this.PackHboPlus = PackHboPlus;
    }

    /**
     * @return the PackMovieCity
     */
    public int getPackMovieCity() {
        return PackMovieCity;
    }

    /**
     * @param PackMovieCity the PackMovieCity to set
     */
    public void setPackMovieCity(int PackMovieCity) {
        this.PackMovieCity = PackMovieCity;
    }

    /**
     * @return the PackDeporte
     */
    public int getPackDeporte() {
        return PackDeporte;
    }

    /**
     * @param PackDeporte the PackDeporte to set
     */
    public void setPackDeporte(int PackDeporte) {
        this.PackDeporte = PackDeporte;
    }

    /**
     * @return the PackHboHD
     */
    public int getPackHboHD() {
        return PackHboHD;
    }

    /**
     * @param PackHboHD the PackHboHD to set
     */
    public void setPackHboHD(int PackHboHD) {
        this.PackHboHD = PackHboHD;
    }

    /**
     * @return the PackMovieCityHD
     */
    public int getPackMovieCityHD() {
        return PackMovieCityHD;
    }

    /**
     * @param PackMovieCityHD the PackMovieCityHD to set
     */
    public void setPackMovieCityHD(int PackMovieCityHD) {
        this.PackMovieCityHD = PackMovieCityHD;
    }

    /**
     * @return the PackDeporteHD
     */
    public int getPackDeporteHD() {
        return PackDeporteHD;
    }

    /**
     * @param PackDeporteHD the PackDeporteHD to set
     */
    public void setPackDeporteHD(int PackDeporteHD) {
        this.PackDeporteHD = PackDeporteHD;
    }

    /**
     * @return the PackAdulto
     */
    public int getPackAdulto() {
        return PackAdulto;
    }

    /**
     * @param PackAdulto the PackAdulto to set
     */
    public void setPackAdulto(int PackAdulto) {
        this.PackAdulto = PackAdulto;
    }

}
