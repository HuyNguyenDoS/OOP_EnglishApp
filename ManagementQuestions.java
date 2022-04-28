import java.util.ArrayList;
import java.util.List;

public class ManagementQuestions {

    private List<Questions> question;
    private String LABEL = String.format("%s\t%-15s\t%-15s",
            "Topic", "Content", "level");

    public ManagementQuestions(){
        this.question = new ArrayList<>();
    }

    public void setQuestionIncomplete(List<Questions> question) {
        this.question = question;
    }

    public List<Questions> getQuestions(){
        return question;
    }

    public void addQuestion(Questions q){
        this.getQuestions().add(q);
    }

    public void exportList(){
        question.forEach(c -> {
            System.out.print(c);
        });
    }

    public void exportContent(){
        for (int i = 0; i < this.question.size(); i++) {
            System.out.printf("%d) %s\n", i + 1, this.question.get(i).getContent());
        }
    }

    public int countMultipleChoice(){
        int count = 0;

        for(Questions q : question){
            if (q instanceof MultipleChoice){    //instanceof: so sanh kieu du lieu tra ve
                count++;
            }
        }

        return count;
    }

    public Questions randomIncomplete(int level){
        ManagementQuestions m = new ManagementQuestions();

        for(Questions q : this.question)
        {
            if(q instanceof Incomplete && q.getLevel() == level){
                m.addQuestion(q);
            }
        }
        int index = (int) ((Math.random() * (m.getQuestions().size() - 0)) + 0);
        return m.getQuestions().get(index);
    }

    public Questions randomConversation(int level){
        ManagementQuestions m = new ManagementQuestions();
        for(Questions q : this.question){
            if(q instanceof Conversation && q.getLevel() == level){
                m.addQuestion(q);
            }
        }
       
        int index = (int) ((Math.random() * (m.getQuestions().size() - 0)) + 0);
        return m.getQuestions().get(index);
    }

    public ManagementQuestions multipleChoiceList(int n){
        ManagementQuestions m = new ManagementQuestions();
        int count = 0;
        //y nghia cu phap for rut gon
        for (Questions questions : question ){
            if( questions instanceof MultipleChoice && count < n){
                count++;
                m.addQuestion(questions);
            }
        }
        return m;
    }

    public ManagementQuestions searchLevel(int level){
        ManagementQuestions m = new ManagementQuestions();
        for (Questions q : question){
            if (q.getLevel() == level){
                m.addQuestion(q);
            }
        }
        return m;
    }

    public ManagementQuestions searchContent(String content){
        ManagementQuestions m = new ManagementQuestions();
        for (Questions q : question){
            if (q.getContent().toLowerCase().contains(content.toLowerCase())){
                m.addQuestion(q);
            }
        }
        return m;
    }

    public ManagementQuestions searchTopic(String topic){
        ManagementQuestions m = new ManagementQuestions();
        for (Questions q : question){
            if (q.getTopic().toLowerCase().contains(topic.toLowerCase())){
                m.addQuestion(q);
            }
        }
        return m;
    }

    public void excute(){
        for (Questions q : question){
            q.excute();
        }
    }
}
