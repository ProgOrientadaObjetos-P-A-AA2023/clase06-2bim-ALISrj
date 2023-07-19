package paquete03;

import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal2 {

    public static void main(String[] args) {
        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};
        
        // 1. guardar en la tabla autos de la base de datos
        
        Enlace c = new Enlace();
        
        for (String[] auto : autos) {
            
            Auto a = new Auto();
            String placa = auto[0];
            double valor = Double.parseDouble(auto[1]);
            a.establecerPlaca(placa);
            a.establecerValorMatricula(valor);
            c.insertarAuto(a);
            
        }
        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
        
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }
        
    }
}
