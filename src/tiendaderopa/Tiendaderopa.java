
package tiendaderopa;

    import java.util.Date; 
    public class Tiendaderopa {
        
        private int numeroProveedores;
        private boolean publicidad;
        private int ganancias;
        private Date fechaFundacion;
        private boolean calidad;

        public Tiendaderopa(int numeroProveedores, boolean publicidad, int ganancias, Date fechaFundacion, boolean calidad) {
            this.numeroProveedores = numeroProveedores;
            this.publicidad = publicidad;
            this.ganancias = ganancias;
            this.fechaFundacion = fechaFundacion;
            this.calidad = calidad;
        }
        
        public void nuevasMarcas(){
            numeroProveedores += 3;
        }
        
        public void clientes(){
            publicidad = true;
        }
        
        public void ventaDeProductos(){
            ganancias += 20000;
        }
        
        public void excelenteCalificacion(){
            calidad = true;
        }
        
        public void ventaDeProductos(int nuevasGanancias){
        if(nuevasGanancias<=this.ganancias){
            System.out.println("No se tiene ganancias por la venta");
        }else{
            this.ganancias = nuevasGanancias;
            System.out.println("La ganancia en esta venta fue de " + 
                    String.valueOf(nuevasGanancias) + "pesos");
            }
        }
    
    
    }
