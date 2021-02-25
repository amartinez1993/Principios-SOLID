final class BirdThatCannotTweet implements Bird {

    // NO cumple LSP ya que devuelva una excepción.
    // Habría que separar los pájaros que cantan de los que no

    @Override
    public Double tweet() {
        throw new RuntimeException("This bird cannot tweet!");
    }
}