public class ShoppingBasket {

    public void buy(Shopping shopping) {

        SqlDatabase db = new SqlDatabase();
        db.save(shopping);

        CreditCard creditCard = new CreditCard();
        creditCard.pay(shopping);
    }

}

// Clase de alto nivel está dependiendo de otras de alto nivel para almacenar info o para realizar el método de pago.
// si queremos meter un nuevo método de pago tendremos que desmontar la lógica.