public class Choice {
    private String content;
    private boolean correct;

    public Choice(String content, boolean correct){
        this.content = content; 
        this.correct = correct;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setCorrect(boolean correct){
        this.correct = correct;
    }

    public boolean getCorrect(){
        return correct;
    }

    @Override
    public String toString(){
        return this.content;
    }
}
