package control;

import model.Propriedade;

public class ImpostoSP implements Imposto {

  @Override
  public double calcularImposto(Propriedade propriedade) {
    return (propriedade.getAreaTotal() * 10) + (propriedade.getNumeroComodos() * 2);
  }
}
