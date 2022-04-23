import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleChoice extends Questions{
    
    private static final String[] LABELS = {"A", "B", "C", "D"};
    private List<Choice> choices;

    public MultipleChoice(String topic, String content, int level){
        super(topic, content, level);
        this.choices = new ArrayList<>();
    }

    public List<Choice> getChoices(){
        return choices;
    }

    public void setChoices(List<Choice> choice){
        this.choices = choice;
    }

    // @Override
    // public String getChuDe(){
    //     return super.getChuDe();
    // }

    @Override
    public String toString(){
        String s = "\n" + super.getContent() + "\n";

        for (int i = 0; i < this.choices.size(); i++) {
            s += String.format("%s.%s\n", LABELS[i], this.choices.get(i));
        }

        return s;
    }

    @Override
    public void addChoice(Choice c){
        if (this.choices.size() < LABELS.length)
            this.choices.add(c);
    }

    public void shuffleChoice() {
        Collections.shuffle(this.choices);
    }

    public boolean checkAnswer(String answer){
        for(int i =0; i < this.choices.size(); i++){
            if(this.choices.get(i).getCorrect() == true && LABELS[i].equals(answer.toUpperCase()) == true)
            {
                return true;
            }
        }
        return false;
    }

    public void excute(){
        System.out.println(this);

        String answer;
        System.out.println("Enter your asnwer");
        answer = sc.nextLine();
        System.out.printf("%b \n", checkAnswer(answer));
    }


}