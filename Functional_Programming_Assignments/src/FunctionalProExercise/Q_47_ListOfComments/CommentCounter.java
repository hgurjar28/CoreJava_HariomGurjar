
//From a list of comments, count the number of comments by each user.
package FunctionalProExercise.Q_47_ListOfComments;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommentCounter {
    public static void main(String[] args) {
        class Comment {
            String user;
            String text;

            public Comment(String user, String text) {
                this.user = user;
                this.text = text;
            }
        }

        List<Comment> comments = Arrays.asList(
                new Comment("Arjun", "Great"),
                new Comment("Samarth", "Nice ."),
                new Comment("Arjun", "Thanks"),
                new Comment("Ritik", "Very helpful."),
                new Comment("Samarth", "Love it"),
                new Comment("Arjun", "Nice")
        );

        Map<String, Long> commentCount = comments.stream()
                .collect(Collectors.groupingBy(c -> c.user, Collectors.counting()));

        commentCount.forEach((user, count) -> {
            System.out.println(user + " -> " + count + " comments");
        });
    }
}

