package view;

import control.Imposto;
import control.ImpostoSP;
import model.Propriedade;
import model.PropriedadeBuilder;

public class Principal {
  public static void main(String[] args) {
    Propriedade propriedade = PropriedadeBuilder.builder()
        .addAreaTotal(10000)
        .addNumeroComodos(5)
        .get();

    Imposto impostoStrategy = new ImpostoSP();

    System.out.println(impostoStrategy.calcularImposto(propriedade));

  }
}