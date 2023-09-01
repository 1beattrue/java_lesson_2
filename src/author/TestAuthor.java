package author;

public class TestAuthor {
    public static void main(String[] args) {
        // Задание 1
        Author author = new Author("Vitaly", "aboba@aboba.com", 'm');
        System.out.println(author);

        System.out.println(author.getName());
        author.setEmail("bebra@bebra.com");
        System.out.println(author.getEmail());
    }
}