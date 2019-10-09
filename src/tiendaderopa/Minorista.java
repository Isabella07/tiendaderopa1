
package tiendaderopa;

import java.util.Date;


public class Minorista extends TiendaDeRopa{
    
    private String nombreComercial;
    private int establecimientos;
    private boolean exclusividad;

    public Minorista(String nombreComercial, int establecimientos, boolean exclusividad, int numeroProveedores, boolean publicidad, int ganancias, Date fechaFundacion, boolean calidad) {
        super(numeroProveedores, publicidad, ganancias, fechaFundacion, calidad);
        this.nombreComercial = nombreComercial;
        this.establecimientos = establecimientos;
        this.exclusividad = exclusividad;
    }
    
    public void renombrarNombre(String nombreNuevo){
        this.nombreComercial = nombreNuevo;
    }

    public void renombrarNombre(String nombreNuevo, String ubicacion){
        this.nombreComercial = nombreNuevo + " en " + ubicacion;
   
    }
    
    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public int getEstablecimientos() {
        return establecimientos;
    }

    public void setEstablecimientos(int establecimientos) {
        this.establecimientos = establecimientos;
    }

    public boolean isExclusividad() {
        return exclusividad;
    }

    public void setExclusividad(boolean exclusividad) {
        this.exclusividad = exclusividad;
    }
    
    
}
