import java.util.*;

public class Cuenta {
    private long numero;
    private String nip;
    private float saldo;
    private float interesAnual;
    private Cliente titular;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(){
        numero = 0;
        nip = "";
        saldo = 0;
        interesAnual = 0;
        titular = new Cliente();
        movimientos = new ArrayList<Movimiento>();
    }

    public Cuenta(long numero, String nip, float saldo, float interesAnual, Cliente titular) {
        this.numero = numero;
        this.nip = nip;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
        this.titular = titular;
        movimientos = new ArrayList<Movimiento>();
    }

    public void asociarCliente(Cliente titular) {
        this.titular = titular;
    }

    public boolean retiro(float cantidad){
        boolean res = false;

        if(cantidad > 0 && cantidad <= saldo){
            saldo-=cantidad;
            movimientos.add(new Movimiento(new Date(),'r',cantidad,saldo));
            res = true;
        }

        return res;
    }

    public void deposito(float cantidad){
        saldo+=cantidad;
        movimientos.add(new Movimiento(new Date(), 'd', cantidad, saldo));
    }

    public boolean operacion(Cuenta destino, float cantidad){
        boolean res = false;

        if(cantidad <= saldo){
            saldo-=cantidad;
            destino.deposito(cantidad);
            movimientos.add(new Movimiento(new Date(), 't', cantidad, saldo));
            res = true;
        }

        return res;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNip() {
        return this.nip;
    }

    public float consulaSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getInteresAnual() {
        return this.interesAnual;
    }

    public void setInteresAnual(float interesAnual) {
        this.interesAnual = interesAnual;
    }

    public String getTitular() {
        return titular.infoCliente();
    }

    public float operacion(){
        System.out.println("Su saldo es: " + saldo);
        return saldo;
    }

    public boolean operacion(String nuevoNip){
        boolean res = false;

        if(nuevoNip.length()==4 && nuevoNip.matches("[0-9]+") && caracteresDiferentes(nuevoNip)){
            nip = nuevoNip;
            res = true;
        }

        return res;
    }

    private boolean caracteresDiferentes(String cad){
        boolean res = false;
        Set<Character> repeticiones = new HashSet<Character>();

        for(char c: cad.toCharArray()){
            repeticiones.add(c);
        }

        if(repeticiones.size() == cad.length()){
            res = true;
        }

        return res;
    }

    public void imprimeInformacion(){
        System.out.println("\nNumero: " + numero);
        System.out.println("Nombre del titular: " + titular.getNombre() + titular.getPaterno() + titular.getMaterno());
        System.out.println("\nDireccion: " + titular.getDireccion());
        System.out.println("\nNip: " + nip);
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nInteres anual: " + interesAnual);

        for(int i=0; i<movimientos.size(); i++){
            System.out.println("\nMovimiento " + (i+1) + ":\n");
            movimientos.get(i).imprimeInformacion();
        }
    }
}