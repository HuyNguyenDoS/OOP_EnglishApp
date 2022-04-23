import java.util.ArrayList;
import java.util.List;

public class Incomplete extends Questions {
    private List<MultipleChoice> question;
    private int level;

    public Incomplete(String content, int level){
        super(content, level);
        this.question = new ArrayList<>();
    }

    public Incomplete(String topic, String content, int level){
        super(topic, content, level);
        this.question = new ArrayList<>();
    }

    public void addQuestion(MultipleChoice m){
        this.question.add(m);
    }
}
