package QMP;


public abstract class Sastre {

  Uniforme crearUniforme(){
    return new Uniforme(buildParteSuperior(), buildParteInferior(), buildCalzado());
  }

  abstract Prenda buildParteSuperior();
  abstract Prenda buildParteInferior();
  abstract Prenda buildCalzado();
}




