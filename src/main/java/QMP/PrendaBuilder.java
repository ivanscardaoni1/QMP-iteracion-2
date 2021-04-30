package QMP;
//Builder
public class PrendaBuilder {
  TipoPrenda tipo;
  Color colorPrincipal;
  Color colorSecundario;
  Material material;
  Trama trama = Trama.LISA;

  PrendaBuilder(TipoPrenda tipo) {
    this.tipo = tipo;
  }

  void setColorPrincipal(Color colorPrincipal){
    this.colorPrincipal = colorPrincipal;
  }

  void setMaterial(Material material) {
    this.material = material;
  }

  void setColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  void setTrama(Trama trama) {
    this.trama = trama;
  }

  Prenda buildPrenda(){
    validarTipo(tipo);
    validarColor(colorPrincipal);
    validarMaterial(material);
    validarTrama(this.trama);
    return new Prenda(tipo, colorPrincipal, colorSecundario, material, trama);
  }

  void validarTipo(TipoPrenda tipo) {
    if(tipo == null) {
      throw new AtributoInvalidoException("El tipo no ha sido ingresado");
    }
  }
  void validarColor(Color colorPrincipal) {
    if(colorPrincipal == null) {
      throw new AtributoInvalidoException("El color no ha sido ingresado");
    }
  }
  void validarMaterial(Material material) {
    if(material == null) {
      throw new AtributoInvalidoException("El material no ha sido ingresado");
    }
  }
  void validarTrama(Trama trama) {
    if(trama == null) {
      throw new AtributoInvalidoException("La trama ha sido ingresada como NULA");
    }
  }
}
