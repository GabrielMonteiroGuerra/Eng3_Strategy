package control;

import model.Propriedade;

public class ImpostoBH implements Imposto {
  @Override
  public double calcularImposto(Propriedade propriedade) {
    return (propriedade.getAreaTotal() * 7) + (propriedade.getNumeroQuartos() * 4);
  }
}
