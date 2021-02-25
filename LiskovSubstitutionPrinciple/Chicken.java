final class Chicken implements Bird {

    // Cumple LSP ya que devuelve lo esperado por la firma de la interface

    @Override
    public Double tweet() {
        return "kikiriki";
    }
}