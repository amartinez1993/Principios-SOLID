final class Client {

    public Client(){
        Book book = new Book();
        String currentPage = book.getCurrentPage();
        StandardOutputPrinter printer = new StandardOutputPrinter();
        printer.printPage(currentPage)
    }

}