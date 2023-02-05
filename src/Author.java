public class Author {
    private String firstName;
    private String lastName;

    public Author (String fL, String lN) {
        this.firstName = fL;
        this.lastName = lN;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
