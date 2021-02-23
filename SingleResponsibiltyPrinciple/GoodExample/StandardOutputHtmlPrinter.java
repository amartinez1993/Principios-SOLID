final class StandardOutputHtmlPrinter implements Printer {

    public void printPage(String page){
        System.out.println("<div>" + page + "</div>");
    }

}