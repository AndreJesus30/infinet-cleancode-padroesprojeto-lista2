package br.com.cleancode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class AssinaturaTrimestral implements AssinaturaInterface {

    private BigDecimal mensalidade;
    private LocalDateTime inicio;
    private Optional<LocalDateTime> fim;
    private BigDecimal taxa;
    private boolean atrasoPagamento;

    public AssinaturaTrimestral(BigDecimal mensalidade, LocalDateTime inicio) {
        this.mensalidade = mensalidade;
        this.inicio = inicio;
        this.fim = Optional.empty();
        this.taxa = taxa();
        this.atrasoPagamento = false;
    }

    public AssinaturaTrimestral(BigDecimal mensalidade, LocalDateTime begin, LocalDateTime fim) {
        this.mensalidade = mensalidade;
        this.inicio = begin;
        this.fim = Optional.of(fim);
        this.taxa = taxa();
        this.atrasoPagamento = false;
    }

    public BigDecimal getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(BigDecimal mensalidade) {
        this.mensalidade = mensalidade;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public Optional<LocalDateTime> getFim() {
        return fim;
    }

    public void setFim(Optional<LocalDateTime> fim) {
        this.fim = fim;
    }

    public BigDecimal getTaxa() {
        return taxa;
    }

    public boolean isAtrasoPagamento() {
        return atrasoPagamento;
    }

    public void setAtrasoPagamento(boolean atrasoPagamento) {
        this.atrasoPagamento = atrasoPagamento;
    }

    @Override
    public BigDecimal taxa() {
        LocalDateTime dataAtual = LocalDateTime.now();
        long mesesAtivos = ChronoUnit.MONTHS.between(inicio, fim.orElse(dataAtual));
        taxa = mensalidade.multiply(BigDecimal.valueOf(mesesAtivos)).multiply(BigDecimal.valueOf(0.05));
        System.out.println("Taxa a ser cobrada da assinatura trimestral: " + getTaxa());
        return taxa;
    }

    @Override
    public String comprar() {
        String liberacao = isAtrasoPagamento() ? "Não está permitido realizar compras" : "Está permitido realizar compras";
        System.out.println(liberacao);
        return liberacao;
    }
}
