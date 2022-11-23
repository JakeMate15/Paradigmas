import java.util.*;

public class Principal {
    public static void main(String args[]){
            ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
            Cuenta c,c2;

            Principal.creaUsuarios(cuentas);
            c = cuentas.get(0);
            c2 = cuentas.get(1);

            c.retiro(1500.0f);
            c.deposito(400.5f);       
            c.consulaSaldo();     
            c2.retiro(200.0f);

            System.out.println("Cliente 1");
            System.out.print(c.getTitular());

            System.out.println("\nCuenta 1:");
            c.imprimeInformacion();

            System.out.println("Cuenta 2:");
            c2.imprimeInformacion();
        }

        public static void creaUsuarios(ArrayList<Cuenta> cuentas){
            Cuenta c1,c2,c3,c4,c5,c6,c7;
            Cliente mauricio,andrea,jose;
            
            mauricio = new Cliente("Mauricio","Jimenez","Garcia","Saltillo 135 Lomas de Chapultepec",new GregorianCalendar(1989,1,27));
            andrea = new Cliente("Andrea","Perez","Suarez","Av. Lindavista  s/n Torres Lindavista",new GregorianCalendar(1992,8,12));
            jose = new Cliente("Jose", "Manuel","Marquez","Calle 5 No 17, Coyoacan", new GregorianCalendar(1972,11,22));
            
            c1 = new Cuenta(21545612, "1234", 146722.0f, 0.0f, mauricio);
            c2 = new Cuenta(6512629,"5972",5200.0f,0.05f,mauricio);

            c3 = new Cuenta(63555655,"6872",63153.3f,0.3f,andrea);
            c4 = new Cuenta(4121852,"6578",60130.6f,0.5f,andrea);

            c5 = new Cuenta(1265655,"5789",12352.0f,0.0f,jose);
            c6 = new Cuenta(1541512,"1276",55272.3f,0.0f,jose);
            c7 = new Cuenta(123151561,"6571",127762.3f,0.02f,jose);
            
            cuentas.add(c1);
            cuentas.add(c2);
            cuentas.add(c3);
            cuentas.add(c4);
            cuentas.add(c5);
            cuentas.add(c6);
            cuentas.add(c7);
        }
}
