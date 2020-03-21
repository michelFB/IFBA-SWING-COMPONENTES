/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.java.swing;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author michel
 */
public class Java_Calendar {

    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Data Agora: " + data);
        //*****************
        Calendar c = Calendar.getInstance();
        System.out.println("Data e Hora atual: " + c.getTime());

        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));

        //*****************
        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);

        if (hora > 6 && hora < 12) {
            System.out.println("Bom Dia");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }

        //*****************
        Calendar c2 = Calendar.getInstance();
        c2.set(2013, Calendar.FEBRUARY, 28);
        data = c2.getTime();
        System.out.println("Data atual sem formatação: " + data);

        //Formata a data
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: " + formataData.format(data));

        //Formata Hora
        DateFormat hora2 = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: " + hora2.format(data));

        //Formata Data e Hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));
    }
}

