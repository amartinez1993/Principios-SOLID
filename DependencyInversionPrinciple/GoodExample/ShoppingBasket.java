public class ShoppingBasket {

    private final Persistence persistence;
    private final PaymentMethod paymentMethod;

    // Ahora no dependemosde la implementación particular.
    // Crearemos cada caso específico y lo pasaremos por el constructor

    public ShoppingBasket(Persistence persistence, PaymentMethod paymentMethod) {
        this.persistence = persistence;
        this.paymentMethod = paymentMethod;
    }

    public void buy(Shopping shopping) {
        persistence.save(shopping);
        paymentMethod.pay(shopping);
    }

}