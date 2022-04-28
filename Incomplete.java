import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Incomplete extends Questions {
    private List<MultipleChoice> questionIncomplete;
    private int level;
    Scanner sc = new Scanner(System.in);

    public Incomplete(String content, int level){
        super(content, level);
        this.questionIncomplete = new ArrayList<>();
    }

    public Incomplete(String topic, String content, int level){
        super(topic, content, level);
        this.questionIncomplete = new ArrayList<>();
    }

    public void addQuestion(MultipleChoice m){
        this.questionIncomplete.add(m);
    }

    public void excute(){
        System.out.println(this.getContent());
        for(int i= 0; i<this.questionIncomplete.size(); i++){
            System.out.printf("\n Question %d:", i+1);
            this.questionIncomplete.get(i).excute();;
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        for(MultipleChoice m : this.questionIncomplete){
            s += m;
        }
        return s;
    }

  
    public List<MultipleChoice> getQuestionImcomplete() {
        return questionIncomplete;
    }

    
    public void setQuestionIncomplete(List<MultipleChoice> questionIncomplete) {
        this.questionIncomplete = questionIncomplete;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }
    
}
