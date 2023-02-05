public class Main {
    public static void main(String[] args) {
        //First book
        Author number1 = new Author("William", "Shakespeare");
        Book book1 = new Book("Gamlet", number1.getFullName(), 1603);
        System.out.println("Name of the book: " + book1.getNameOfTheBook() + "\n" + "Author of the book: " + book1.getAuthor() + "\n" + "Year of publication: " + book1.getYearOfPublication() + "\n");

        //Second book
        Author number2 = new Author("Alexander", "Pushkin");
        Book book2 = new Book("Dubrovsky", number2.getFullName(), 1840);
        System.out.println("Name of the book: " + book2.getNameOfTheBook() + "\n" + "Author of the book: " + book2.getAuthor() + "\n" + "Year of publication: " + book2.getYearOfPublication());

        //Setter
        book2.newYearOfPublication(1841);
        System.out.println("Year of publication: " + book2.getYearOfPublication() + " (corrected)");
    }
}