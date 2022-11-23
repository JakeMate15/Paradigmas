import java.util.*;

public class Movimiento{
    private Calendar fecha;
    private char tipo;
    private float importe;
    private float saldoHistorico;

    public Movimiento(Calendar fecha, char tipo, float importe, float saldoHistorico){
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.saldoHistorico = saldoHistorico;
    }

    public void imprimeInformacion(){

        System.out.println(
            "Fecha: " +  + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH) +"/" + fecha.get(Calendar.YEAR) +
            "\nTipo: " + tipo +
            "\nImporte: " + importe +
            "\nSaldo Historico: " + saldoHistorico +
            "\n" 
        );
    }
}