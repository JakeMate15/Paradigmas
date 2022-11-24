import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Movimiento{
    private Date fecha;
    private char tipo;
    private float importe;
    private float saldoHistorico;

    public Movimiento(Date fecha, char tipo, float importe, float saldoHistorico){
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.saldoHistorico = saldoHistorico;
    }

    public void imprimeInformacion(){
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");

        System.out.println(
            "Fecha: " + formatoFecha.format(fecha) +
            "\nTipo: " + tipo +
            "\nImporte: " + importe +
            "\nSaldo Historico: " + saldoHistorico +
            "\n" 
        );
    }
}