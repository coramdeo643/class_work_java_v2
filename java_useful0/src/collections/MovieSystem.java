package collections;

import java.util.ArrayList;

public class MovieSystem {

    public static void main(String[] args) {
        // ArrayList Usage
        ArrayList<Movie> movies = new ArrayList();
        movies.add(new Movie("범죄도시4", 5));
        movies.add(new Movie("기생충", 5));
        movies.add(new Movie("올드보이", 5));
        movies.add(new Movie("Thunderbolt*", 5));
        movies.add(new Movie("파일럿", 5));
        // movies.add(10); <> 제네릭 써서 클래스 정해주면 컴파일러가 잡아줌

        // 순회하면서 자료구조안에 있는 영화 제목들만 출력 요청
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).getTitle());
        }

        System.out.println("-------------");
        // 초기화 for 구문 = enhanced for
        for (Movie m1 : movies) {
            System.out.println(m1.getTitle());
        }

    } // main
} // class

class Movie {

    private String title;
    private int rating;

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}