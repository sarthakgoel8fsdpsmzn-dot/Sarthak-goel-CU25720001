
class Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    void display() {
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;

        System.out.println("Movie: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating);
        System.out.println("Industry: " + industry);
    }
}

public class question10 {
    public static void main(String[] args) {
        String name = "3 Idiots";
        String genre = "Comedy Drama";
        double rating = 8.4;

        Movie m = new Movie(name, genre, rating);
        m.display();
    }
}
