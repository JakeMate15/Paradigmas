import java.util.*;

public class Cuenta {
    private long numero;
    private String nip;
    private double saldo;
    private double interesAnual;
    private String titular;

    public Cuenta(){
        numero = 0;
        nip = "";
        saldo = 0;
        interesAnual = 0;
        titular = "";
    }

    public Cuenta(long numero, String nip, double saldo, double interesAnual, String titular) {
        this.numero = numero;
        this.nip = nip;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
        this.titular = titular;
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

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return this.interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito(double cantidad){
        saldo+=cantidad;
    }

    public boolean operacion(double cantidad){
        boolean res = false;

        if(cantidad > 0 && cantidad <= saldo){
            saldo-=cantidad;
            res = true;
        }

        return res;
    }

    public double operacion(){
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

    public boolean operacion(Cuenta destino, double cantidad){
        boolean res = false;

        if(cantidad <= saldo){
            saldo-=cantidad;
            destino.deposito(cantidad);
            res = true;
        }

        return res;
    }

    public void imprimeInformacion(){
        System.out.println("\nNumero: " + numero);
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Nip: " + nip);
        System.out.println("Saldo: " + saldo);
        System.out.println("Interes anual: " + interesAnual);
    }
}