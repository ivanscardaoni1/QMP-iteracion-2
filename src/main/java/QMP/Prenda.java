package QMP;

public class Prenda {
  TipoPrenda tipo;
  Color colorPrincipal;
  Color colorSecundario;
  Material material;
  Trama trama;

  Prenda(TipoPrenda tipo, Color colorPrincipal, Color colorSecundario, Material material, Trama trama) {

    this.tipo = tipo;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.trama = trama;
  }


  CategoriaPrenda categoria() {

   return tipo.getCategoria();

  }

}

