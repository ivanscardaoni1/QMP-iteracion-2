package QMP;

class AtributoInvalidoException extends RuntimeException {
  AtributoInvalidoException(String causa) {
    super(causa);
  }
}

class CategoriaInvalidaException extends RuntimeException {
  CategoriaInvalidaException(String causa) {
    super(causa);
  }
}
