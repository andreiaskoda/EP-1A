
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author askoda
 */
public class Pratica31 {
    private static String meuNome = "Andreia Schwalbe Koda";
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1995, 7, 23);
    private static Date inicio, fim;
    
    public static void main(String[] args) {
        inicio = new Date();
        
        String maiusculo;
        maiusculo = meuNome.toUpperCase();
        
        System.out.println(maiusculo);
        
        String nomeFormatado;
        
        nomeFormatado = meuNome.substring(17, 18).toUpperCase() +
                meuNome.substring(18, 21).toLowerCase() + ", "
                + meuNome.substring(0, 1).toUpperCase() + ". "
                + meuNome.substring(8, 9).toUpperCase() + ".";
        
        System.out.println(nomeFormatado + "\n");
        
        long dias;
        
        dias = (inicio.getTime() - dataNascimento.getTimeInMillis())
        /(86400000);
        
        System.out.println(dias);
        
        fim = new Date();
        
        long ms = fim.getTime() - inicio.getTime();
        
        System.out.println(ms);
        
    }
}
