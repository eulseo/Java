package class1;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {movie1,movie2};
        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화제목 : " + movieReview.title + ", 리뷰 : " + movieReview.review);
        }
    }
}
