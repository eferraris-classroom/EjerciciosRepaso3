package ar.edu.undef.fie;


public class Vehiculo {
       private String dominio;
        private String marca;
        private String modelo;
        private int kilometraje;

        private Boolean disponible;

        public Vehiculo(String dominio, String marca, String modelo, int kilometraje, Boolean disponible) {
            this.dominio = dominio;
            this.marca = marca;
            this.modelo = modelo;
            this.kilometraje = kilometraje;
            this.disponible = disponible;
        }

        public String getDominio() {
            return dominio;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getKilometraje() {
            return kilometraje;
        }

        public Boolean getDisponible() {
            return disponible;
        }

        public void setDisponible(Boolean disponible) {
            this.disponible = disponible;
        }

        @Override
        public String toString() {
            return "Vehiculos{" +
                    "dominio='" + dominio + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", kilometraje=" + kilometraje +
                    ", disponible=" + disponible +
                    '}';
        }


    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;

    }
}
