public class Tombola {

    private String cartoncito[][] = new String[3][3];

    public Tombola() {
        for (int i = 0; i < cartoncito.length; i++) {
            for (int j = 0; j < cartoncito[0].length; j++) {
                cartoncito[i][j] = " + ";
            }
        }
    }

    public String impresoCarton() {
        String salida = " ";

        for (int i = 0; i < cartoncito.length; i++) {
            for (int j = 0; j < cartoncito[0].length; j++) {
                salida += cartoncito[i][j] + " ";

            }
            salida += "\n";
        }
        return salida;
    }

    public void llenado() {
        String uno = "30";
        String dos = "15";
        String tres = "4";
        String cuatro = "90";
        String cinco = "34";
        String seis = "6";
        String siete = "70";
        String ocho = "67";
        String nueve = "55";

        cartoncito[0][0] = uno;
        cartoncito[0][1] = dos;
        cartoncito[0][2] = tres;
        cartoncito[1][0] = cuatro;
        cartoncito[1][1] = cinco;
        cartoncito[1][2] = seis;
        cartoncito[2][0] = siete;
        cartoncito[2][1] = ocho;
        cartoncito[2][2] = nueve;


    }


    public String girandoEsfera() {

        String salida = "";

        int arreglo[] = new int[1];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
            salida += arreglo[i];
        }
        return salida;
    }

    public void acomodoCeroCero() {
        String uno = "x";
        cartoncito[0][0] = uno;

    }


    public void acomodoCeroUno() {
        String uno = "x";
        cartoncito[0][1] = uno;
    }

    public void acomodoCeroDos() {
        String uno = "x";
        cartoncito[0][2] = uno;
    }

    public void acomodoUnoCero() {
        String uno = "x";
        cartoncito[1][0] = uno;
    }

    public void acomodoUnoUno() {
        String uno = "x";
        cartoncito[1][1] = uno;
    }

    public void acomodoUnoDos() {
        String uno = "x";
        cartoncito[1][2] = uno;
    }

    public void acomodoDosCero() {
        String uno = "x";
        cartoncito[2][0] = uno;
    }

    public void acomodoDosUno() {
        String uno = "x";
        cartoncito[2][1] = uno;
    }

    public void acomodoDosDos() {
        String uno = "x";
        cartoncito[2][2] = uno;
    }

    public boolean confirmacionLLenado() {
        boolean lleno = true;
        boolean incompleto = false;
        for (int i = 0; i < cartoncito.length; i++) {
            for (int j = 0; i < cartoncito[0].length; i++) {
                if (cartoncito[i][j].equalsIgnoreCase("x")) {
                    return  lleno;

                }
            }
        }
        return incompleto;
    }
}






