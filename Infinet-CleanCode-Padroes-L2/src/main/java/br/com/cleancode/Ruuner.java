package br.com.cleancode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ruuner {
    public static void main(String[] args) {

        AssinaturaSemestral assinatura1 = new AssinaturaSemestral(BigDecimal.valueOf(99.98), LocalDateTime.of(2023,1,5,10,15));
        AssinaturaTrimestral assinatura2 = new AssinaturaTrimestral(BigDecimal.valueOf(99.98), LocalDateTime.of(2023,3,9,14,05), LocalDateTime.of(2023,6,10,20,15));
        AssinaturaAnual assinatura3 = new AssinaturaAnual(BigDecimal.valueOf(99.98), LocalDateTime.of(2023,4,26,21,40), LocalDateTime.of(2023,7,1,16,25));

        Cliente cliente1 = new Cliente("Ronaldo", 37);
        Cliente cliente2 = new Cliente("Messi", 38);

        cliente1.setAssinatura(assinatura1);
        cliente2.setAssinatura(assinatura2);

        assinatura1.setAtrasoPagamento(true);
        assinatura1.comprar();
        assinatura2.comprar();


    }

}
