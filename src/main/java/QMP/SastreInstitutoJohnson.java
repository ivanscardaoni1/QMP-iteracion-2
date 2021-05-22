package QMP;

public class SastreInstitutoJohnson extends Sastre{

    Prenda buildParteSuperior(){
      Borrador borrador = new Borrador(TipoPrenda.CAMISAS_DE_MANGA_LARGA);
      borrador.setColorPrincipal(new Color("Blanco"));
      borrador.setColorSecundario(null);
      borrador.setMaterial(Material.PIQUE);
      borrador.setTrama(Trama.LISA);
      return borrador.crearPrenda();
    }

    Prenda buildParteInferior(){
      Borrador borrador = new Borrador(TipoPrenda.PANTALON);
      borrador.setColorPrincipal(new Color("Negro"));
      borrador.setColorSecundario(null);
      borrador.setMaterial(Material.ACETATO);
      borrador.setTrama(null);
      return borrador.crearPrenda();
    }

    Prenda buildCalzado() {
      Borrador borrador = new Borrador(TipoPrenda.ZAPATOS);
      borrador.setColorPrincipal(new Color("Negro"));
      borrador.setColorSecundario(null);
      borrador.setMaterial(null);
      borrador.setTrama(null);
      return borrador.crearPrenda();
    }

}
