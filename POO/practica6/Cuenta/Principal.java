public class Principal {
    public static void main(String args[]){
        Cuenta[] cuentas = new Cuenta[4];
        Principal.creaUsuarios(cuentas);

        for(int i=0; i<cuentas.length; i++){
            cuentas[i].imprimeInformacion();
        }

        System.out.println("\n--------------------------------------------------------------");

        System.out.println("\n" + cuentas[0].getTitular());
        cuentas[0].operacion();

        if(!cuentas[1].operacion(10000)){
            System.out.println(cuentas[1].getTitular() + " no tienes suficiente saldo en su cuenta.");
        }

        cuentas[1].operacion("15585");
        cuentas[2].operacion("1111");
        cuentas[3].operacion("1234");

        cuentas[3].operacion(cuentas[1],4558);
        cuentas[2].operacion(cuentas[0],115565);

        System.out.println("\n--------------------------------------------------------------");

        for(int i=0; i<cuentas.length; i++){
            cuentas[i].imprimeInformacion();
        }
    }

    public static void creaUsuarios(Cuenta[] cuentas){
        cuentas[0] = new Cuenta();
        cuentas[0].setNumero(10547);
        cuentas[0].setNip("7216");
        cuentas[0].setSaldo(100);
        cuentas[0].setInteresAnual(1.0);
        cuentas[0].setTitular("Vianey Salas Rosales");

        cuentas[1] = new Cuenta(15687,"4597",4587.36,12.3, "Eduardo Morales Lopez");
        cuentas[2] = new Cuenta(78954,"7459",7891.36,2.36,"Juan Hernandez Cortes");
        cuentas[3] = new Cuenta(74520,"0365",523789.323, 8.36, "Erik Morales Lopez");
    }
}
