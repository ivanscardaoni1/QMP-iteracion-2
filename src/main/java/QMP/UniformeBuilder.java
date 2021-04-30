package QMP;


public class UniformeBuilder {

  Uniforme buildUniforme(TipoPrenda tipo1, Color colorPrincipal1, Color colorSecundario1, Material material1, Trama trama1, TipoPrenda tipo2, Color colorPrincipal2, Color colorSecundario2, Material material2, Trama trama2, TipoPrenda tipo3, Color colorPrincipal3, Color colorSecundario3, Material material3, Trama trama3 ){
    return new Uniforme(buildParteSuperior(tipo1, colorPrincipal1, colorSecundario1, material1, trama1), buildParteInferior(tipo2, colorPrincipal2, colorSecundario2, material2, trama2), buildCalzado(tipo3, colorPrincipal3, colorSecundario3, material3, trama3));
  }

  Prenda buildParteSuperior(TipoPrenda tipo, Color colorPrincipal, Color colorSecundario, Material material, Trama trama){
    if (tipo.getCategoria() != CategoriaPrenda.PARTE_SUPERIOR) {
      throw new CategoriaInvalidaException("La categoria debe ser PRENDA_SUPERIOR");
    }
    PrendaBuilder prendaBuilder = new PrendaBuilder(tipo);
    prendaBuilder.setColorPrincipal(colorPrincipal);
    prendaBuilder.setColorSecundario(colorSecundario);
    prendaBuilder.setMaterial(material);
    prendaBuilder.setTrama(trama);
    return prendaBuilder.buildPrenda();
  }
  Prenda buildParteInferior(TipoPrenda tipo, Color colorPrincipal, Color colorSecundario, Material material, Trama trama){
    if (tipo.getCategoria() != CategoriaPrenda.PARTE_INFERIOR) {
      throw new CategoriaInvalidaException("La categoria debe ser PRENDA_INFERIOR");
    }
    PrendaBuilder prendaBuilder = new PrendaBuilder(tipo);
    prendaBuilder.setColorPrincipal(colorPrincipal);
    prendaBuilder.setColorSecundario(colorSecundario);
    prendaBuilder.setMaterial(material);
    prendaBuilder.setTrama(trama);
    return prendaBuilder.buildPrenda();
  }
  Prenda buildCalzado(TipoPrenda tipo, Color colorPrincipal, Color colorSecundario, Material material, Trama trama) {
    if (tipo.getCategoria() != CategoriaPrenda.CALZADO) {
      throw new CategoriaInvalidaException("La categoria debe ser CALZADO");
    }
    PrendaBuilder prendaBuilder = new PrendaBuilder(tipo);
    prendaBuilder.setColorPrincipal(colorPrincipal);
    prendaBuilder.setColorSecundario(colorSecundario);
    prendaBuilder.setMaterial(material);
    prendaBuilder.setTrama(trama);
    return prendaBuilder.buildPrenda();
  }
}

//para San juan haria
//UniformeBuilder creadorDeUniformes = new UniformeBuilder();
//Uniforme SanJuan = creadorDeUniformes.buildUniforme(Todos los parametros del uniforme San Juan);

// Mala solucion, muchisima repeticion de logica y super engorroso, supongo que despues de esta clase me va a quedar claro