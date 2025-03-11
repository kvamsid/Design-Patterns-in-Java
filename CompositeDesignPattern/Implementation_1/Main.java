package LowLevelDesign.vamsiPractise.CompositeDesignPattern.Implementation_1;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("movie");
        FileSystem movie = new File("RRR");
        movieDirectory.add(movie);

        Directory thrillerDirectory = new Directory("thriller_Movies");
        FileSystem thrillerMovie = new File("Seven");
        thrillerDirectory.add(thrillerMovie);
        movieDirectory.add(thrillerDirectory);

        movieDirectory.ls();
    }
}
