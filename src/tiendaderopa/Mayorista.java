
package tiendaderopa;

import java.util.Date;


public class Mayorista extends TiendaDeRopa{
    private boolean rentabilidad;
    private int cantidadProductos;
    private boolean altaProduccion;

    public Mayorista(boolean rentabilidad, int cantidadProductos, boolean altaProduccion, int numeroProveedores, boolean publicidad, int ganancias, Date fechaFundacion, boolean calidad) {
        super(numeroProveedores, publicidad, ganancias, fechaFundacion, calidad);
        this.rentabilidad = rentabilidad;
        this.cantidadProductos = cantidadProductos;
        this.altaProduccion = altaProduccion;
    }
    
    public void aumentoDeVentas(){
        this.rentabilidad = true;
    }
    
    public void aumentoDeVentas(int productosVendidos){
        this.rentabilidad = true;
        this.cantidadProductos -= productosVendidos;
    }

    public boolean isRentabilidad() {
        return rentabilidad;
    }

    public void setRentabilidad(boolean rentabilidad) {
        this.rentabilidad = rentabilidad;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public boolean isAltaProduccion() {
        return altaProduccion;
    }

    public void setAltaProduccion(boolean altaProduccion) {
        this.altaProduccion = altaProduccion;
    }


}