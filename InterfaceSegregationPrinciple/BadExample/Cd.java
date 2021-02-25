final class Cd implements Product {

    @Override
    public String getName(){
        //...
    }

    @Override
    public int getStock(){
        //...
    }

    @Override
    public Date getReleaseDate(){
        //...
    }

    // Un CD no tiene Recommended Age así que no lo necesita
    @Override
    public Date getRecommendedAge(){
        throw new RuntimeException("Un CD no tiene Recommended Age");
    }

}