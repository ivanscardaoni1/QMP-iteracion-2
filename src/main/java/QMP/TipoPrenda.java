package QMP;

enum TipoPrenda {
  ZAPATOS(CategoriaPrenda.CALZADO),
  CAMISAS_DE_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR),
  CAMISAS_DE_MANGA_LARGA(CategoriaPrenda.PARTE_SUPERIOR),
  REMERA(CategoriaPrenda.PARTE_SUPERIOR),
  JEAN(CategoriaPrenda.PARTE_INFERIOR),
  LENTES_DE_SOL(CategoriaPrenda.ACCESORIO),
  CHOMBA(CategoriaPrenda.PARTE_SUPERIOR),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR);


  CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoria) {

    this.categoria = categoria;

  }

  CategoriaPrenda getCategoria() {

    return categoria;

  }
  }
