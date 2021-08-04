package quotes;

import java.util.ArrayList;
import java.util.List;

public class Qutes {
    List<String> tags;
    String author;
    String like;
    String text;
    public Qutes(List<String> tags, String author, String like, String text) {
        this.tags = tags;
        this.author = author;
        this.like = like;
        this.text = text;
    }

    // TODO: 8/4/2021


    @Override
    public String toString() {
        return "Qutes{" +
                "tags=" + tags +
                ", author='" + author + '\'' +
                ", like='" + like + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
