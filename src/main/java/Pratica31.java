
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
    private static String meuNome;
    private static GregorianCalendar dataNascimento;
    private static Date inicio, fim;
    
    public static void main(String[] args) {
        inicio = new Date();
        meuNome = "Andreia Schwalbe Koda";
        System.out.println(meuNome.toUpperCase());
        System.out.println(meuNome.substring(17, 18).toUpperCase() +
                meuNome.substring(18, 21).toLowerCase() + ", "
                + meuNome.substring(0, 1).toUpperCase() + ". "
                + meuNome.substring(8, 9).toUpperCase() + ".\n");
        
        dataNascimento = new GregorianCalendar(1995, 7, 23);
        System.out.println((inicio.getTime() - dataNascimento.getTimeInMillis())
        %(1000*3600*24));
        
        fim = new Date();
        System.out.println(fim.getTime() - inicio.getTime());
        
    }
}
