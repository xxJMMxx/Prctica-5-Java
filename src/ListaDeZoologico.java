import java.util.ArrayList;

public class ListaDeZoologico {

        ArrayList<Zoologico> animales = new ArrayList<>();

        public void agregarDatos(){
            Zoologico zoo = new Zoologico("Mamiferos", "Rinoceronte",
                     18);
            animales.add(zoo);
            animales.add(new Zoologico("Reptiles", "Tortuga",
                    5));
            animales.add(new Zoologico("Acuatico", "Delfin",
                    6));
        }

        public void mostrarDatos(){
            System.out.println("cantidad \t categoria\t especie");

            for (int i = 0; i < animales.size(); i++){
                System.out.println(String.format("%.0f",animales.get(i).getCantidad()) +
                        " \t\t\t " + animales.get(i).getCategoria() +
                        " \t " + animales.get(i).getEspecie());
            }
            //método foreach
            animales.forEach((n) -> System.out.println(String.format("%.0f",n.getCantidad()) +
                    " \t\t\t " + n.getCategoria() +
                    " \t " + n.getEspecie()));
        }

        public static void main(String[] args){
            ListaDeZoologico Bienvenido = new ListaDeZoologico();
            Bienvenido.agregarDatos();
            Bienvenido.mostrarDatos();
        }

    }

