public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");

        Book childhood = new Book("Детство", tolstoy, 1851);
        System.out.println(childhood);
        System.out.println(childhood.getNameOfAuthor().getFirstName() + " " + childhood.getNameOfAuthor().getSecondName());
        System.out.println(childhood.getBookTitle() +" " + childhood.getPublicationYear());
        childhood.setPublicationYear(1851);
        System.out.println(childhood.getPublicationYear());

        Author pushkin = new Author("Лев", "Толстой");
        Book onegin = new Book("Детство", pushkin, 1852);
        System.out.println(onegin.getNameOfAuthor().getFirstName() + " " + onegin.getNameOfAuthor().getSecondName());
        System.out.println(onegin.getBookTitle() + " " + onegin.getPublicationYear());

        System.out.println("123");
        System.out.println(childhood.getPublicationYear()==onegin.getPublicationYear());
        System.out.println(childhood.equals((onegin)));
        System.out.println(tolstoy.equals(pushkin));
    }
}
