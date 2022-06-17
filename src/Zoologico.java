public class Zoologico {

        private String categoria;
        private String especie;
        private double cantidad;

        public Zoologico(String categoria, String especie, int cantidad) {
            this.categoria = categoria;
            this.especie = especie;
            this.cantidad = cantidad;
        }

    public String getCategoria() {return categoria;}

    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getEspecie() {return especie;}

    public void setEspecie(String especie) {this.especie = especie;}

    public double getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    }

