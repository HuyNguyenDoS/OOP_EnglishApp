import java.util.Scanner;

public abstract class Questions {
    private static int count=0;
    private int serial;
    private String topic="";
    private String content;
    private int level;


    {
        count++;
        this.serial = count;
    }

    //parameter dung de lam gi
    //
    // /**
    //  *
    //  * @param chuDe
    //  * @param noiDung
    //  * @param capDo
    //  */

    public Questions(){}

    public Questions(String content){
        this.content = content;
    }

    public Questions(String content, int level){
        this.content = content;
        this.level = level;
    }

    public Questions( String topic, String content, int level){
        this.content = content;
        this.level = level;
        this.topic = topic;
    }

    public void setSerial(int serial){
        this.serial = serial;
    }

    public int getSerial(){
        return serial;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }

    public String getTopic(){
        return topic;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public String toString(){
        return String.format("%d" + "%d" + "%d", this.content, this.level, this.topic);
    }

    Scanner sc = new Scanner(System.in);
    public void newQuestion(){
        System.out.println("=============");
        System.out.println("Topic: ");
        this.topic = sc.nextLine();

        System.out.println("Enter your question");
        this.content = sc.nextLine();

        System.out.println("(level: Hard:1 - Normal:2 - Easy:3)Enter the level");
        this.level = sc.nextInt();
    }

    public void addChoice(Choice c){}
    public void excute(){}
}