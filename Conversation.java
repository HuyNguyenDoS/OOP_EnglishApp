import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conversation extends Questions {
    private List<MultipleChoice> questionConversation;
    private int level;

    public Conversation(String content, int level){
        super(content, level);
        this.questionConversation = new ArrayList<>();
    }

    public Conversation(String topic, String content, int level){
        super(topic, content, level);
        this.questionConversation = new ArrayList<>();
    }

    public void addQuestion(MultipleChoice m){
        this.questionConversation.add(m);
    }

    public void excute(){
        Scanner sc = new Scanner(System.in);
        System.out.println(this.getContent());
        for(int i= 0; i<this.questionConversation.size(); i++){
            System.out.printf("\n Question %d:", i+1);
            this.questionConversation.get(i).excute();
        }
    }
    
    @Override
    public String toString(){
        String s = super.toString();
        for(MultipleChoice m : this.questionConversation){
            s += m;
        }
        return s;
    }

    /**
     * @return the question
     */
    public List<MultipleChoice> getQuestionConversation(){
        return questionConversation;
    }

    /**
     * @param questionConversation the question to set
    */
    public void setQuestionConversation(List<MultipleChoice> questionConversation){
        this.questionConversation = questionConversation;
    }
    
    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    
}