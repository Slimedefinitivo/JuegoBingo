import javax.swing.*;

public class PruebaTombola {

    public static void main(String[] args) {

        Tombola tombola = new Tombola();
        int mensajeDos = 0;

        do {
            mensajeDos = Integer.parseInt(JOptionPane.showInputDialog("Juego tombola.\n" +
                    "1. Girando la esfera\n" +
                    "2. Carton a jugar\n" +
                    "3. Marcar numero encontrado\n" +
                    "4. salir"));

            switch (mensajeDos) {
                case 1:

                    System.out.println(tombola.girandoEsfera());

                    break;

                case 2:

                    tombola.llenado();
                    System.out.println(tombola.impresoCarton());

                    break;

                case 3:

                    String mensaje = JOptionPane.showInputDialog("Ingrese una posicion a tachar");

                    if (mensaje.equals("1")) {
                        tombola.llenado();
                        tombola.acomodoCeroCero();
                        System.out.println(tombola.impresoCarton());
                        break;

                    }
                    if (mensaje.equals("2")) {
                        tombola.acomodoCeroUno();
                        System.out.println(tombola.impresoCarton());
                        break;

                    }
                    if (mensaje.equals("3")) {
                        tombola.acomodoCeroDos();
                        System.out.println(tombola.impresoCarton());
                        break;
                    }
                    if (mensaje.equals("4")) {
                        tombola.acomodoUnoCero();
                        System.out.println(tombola.impresoCarton());
                        break;

                    }
                    if (mensaje.equals("5")) {
                        tombola.acomodoUnoUno();
                        System.out.println(tombola.impresoCarton());
                        break;

                    }
                    if (mensaje.equals("6")) {
                        tombola.acomodoUnoDos();
                        System.out.println(tombola.impresoCarton());
                        break;
                    }
                    if (mensaje.equals("7")) {
                        tombola.acomodoDosCero();
                        System.out.println(tombola.impresoCarton());
                        break;
                    }
                    if (mensaje.equals("8")) {
                        tombola.acomodoDosUno();
                        System.out.println(tombola.impresoCarton());
                        break;
                    }
                    if (mensaje.equals("9")) {
                        tombola.acomodoDosDos();
                        System.out.println(tombola.impresoCarton());

                    }
                   if (tombola.confirmacionLLenado()){
                       System.out.println("Has ganado");
                       break;

                   }




                    break;

                default:
            }
        } while (mensajeDos != 4);
    }


}

