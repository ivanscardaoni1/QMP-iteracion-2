package QMP;

public class SastreSanJuan extends Sastre {

  Prenda buildParteSuperior(){
    Borrador borrador = new Borrador(TipoPrenda.CHOMBA);
    borrador.setColorPrincipal(new Color("Verde"));
    borrador.setColorSecundario(null);
    borrador.setMaterial(Material.PIQUE);
    borrador.setTrama(Trama.LISA);
    return borrador.crearPrenda();
  }

  Prenda buildParteInferior(){
    Borrador borrador = new Borrador(TipoPrenda.PANTALON);
    borrador.setColorPrincipal(new Color("Gris"));
    borrador.setColorSecundario(null);
    borrador.setMaterial(Material.ACETATO);
    borrador.setTrama(null);
    return borrador.crearPrenda();
  }

  Prenda buildCalzado() {
    Borrador borrador = new Borrador(TipoPrenda.ZAPATOS);
    borrador.setColorPrincipal(new Color("Blanco"));
    borrador.setColorSecundario(null);
    borrador.setMaterial(null);
    borrador.setTrama(null);
    return borrador.crearPrenda();
  }

}
