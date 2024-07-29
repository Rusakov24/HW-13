public class Author {
    private String firstName;
    private String secondName;
    public Author (String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals((author.firstName)) && secondName.equals(author.secondName);

    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(secondName);
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    @Override
    public String toString(){
        return this.getFirstName() + " " + this.getSecondName();
    }
}





