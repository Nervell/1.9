public class Book {
    private String nameOfTheBook;
    private String authorName;
    private int yearOfPublication;

    public Book (String nameOfTheBook, String name, int yearOfPublication) {
        this.nameOfTheBook = nameOfTheBook;
        this.yearOfPublication = yearOfPublication;
        this.authorName = name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public String getAuthor() {
        return authorName;
    }

    public void newYearOfPublication(int newYear) {
        this.yearOfPublication = newYear;
    }
}
