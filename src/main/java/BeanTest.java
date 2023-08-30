import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        // Album
        Album album1 = new Album();
        album1.setId(1);
        album1.setTitle("Dark Side of the Moon");
        album1.setArtist("Pink Floyd");
        album1.setYear(1973);

        Album album2 = new Album();
        album2.setId(2);
        album2.setTitle("The Wall");
        album2.setArtist("Pink Floyd");
        album2.setYear(1979);

        // Author
        Author author1 = new Author();
        author1.setId(1);
        author1.setName("Mark Twain");
        author1.setBiography("An American author and humorist");

        Author author2 = new Author();
        author2.setId(2);
        author2.setName("Oscar Wilde");
        author2.setBiography("An Irish poet and playwright");

        // Quote
        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setText("Age is an issue of mind over matter. If you don't mind, it doesn't matter.");
        quote1.setAuthor(author1);

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setText("Be yourself; everyone else is already taken.");
        quote2.setAuthor(author2);

        // ArrayList of quotes
        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);

        // Iterate over quotes and print out text and author name
        for (Quote quote : quotes) {
            System.out.println(quote.getText() + " - " + quote.getAuthor().getName());
        }

        System.out.println(album1);
        System.out.println(album2);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(quote1);
        System.out.println(quote2);
    }
}