
import java.util.Scanner;
import java.util.Date;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    public static dmy dmy = new dmy();

    public void Controller() {
        ManagementQuestions managementQuestion = new ManagementQuestions();

        Student h1 = new Student("user1", "user1", "Nguyen Huu A", 0, "19/9/2001", "Ha Noi");
        Student h2 = new Student("user2", "user2", "Nguyen Hoang B ", 0, "17/10/2007", "Ha Noi");
        Student h3 = new Student("user3", "user3", "Bui Thi C", 1, "19/9/2001", "Thai Binh");
        Student h4 = new Student("user4", "user4", "Nguyen Nhat D", 0, "14/3/2001", "Hue");
        Student h5 = new Student("user5", "user5", "Nguyen F", 0, "16/5/2001", "Quang Nam");

        ManagementStudents managementStudent = new ManagementStudents();
        managementStudent.add(h1);
        managementStudent.add(h2);
        managementStudent.add(h3);
        managementStudent.add(h4);
        managementStudent.add(h5);

//      MULTIPLECHOIE
        MultipleChoice m1 = new MultipleChoice("Grammar", "What ... your name? (info)", 3);
        Choice m1c1 = new Choice("are", false);
        Choice m1c2 = new Choice("is", true);
        Choice m1c3 = new Choice("it", false);
        Choice m1c4 = new Choice("do", false);
        m1.addChoice(m1c1);
        m1.addChoice(m1c2);
        m1.addChoice(m1c3);
        m1.addChoice(m1c4);

        MultipleChoice m2 = new MultipleChoice("Grammar", " ... old are you? (info)", 3);
        Choice m2c1 = new Choice("How", true);
        Choice m2c2 = new Choice("What", false);
        Choice m2c3 = new Choice("Which", false);
        Choice m2c4 = new Choice("Who", false);
        m2.addChoice(m2c1);
        m2.addChoice(m2c2);
        m2.addChoice(m2c3);
        m2.addChoice(m2c4);

        MultipleChoice m3 = new MultipleChoice("Grammar", "Where ... you born? (info)", 3);
        Choice m3c1 = new Choice("was", false);
        Choice m3c2 = new Choice("have", false);
        Choice m3c3 = new Choice("are", false);
        Choice m3c4 = new Choice("were", true);
        m3.addChoice(m3c1);
        m3.addChoice(m3c2);
        m3.addChoice(m3c3);
        m3.addChoice(m3c4);
        
        MultipleChoice m4 = new MultipleChoice("Tenses", "A computer ... a tool for finding data.(Tech)", 3);
        Choice m4c1 = new Choice("was", false);
        Choice m4c2 = new Choice("have", false);
        Choice m4c3 = new Choice("are", false);
        Choice m4c4 = new Choice("is", true);
        m4.addChoice(m4c1);
        m4.addChoice(m4c2);
        m4.addChoice(m4c3);
        m4.addChoice(m4c4);
        
        MultipleChoice m5 = new MultipleChoice("Tenses", "Computers ... helped people a lot in all fields.(Tech)", 3);
        Choice m5c1 = new Choice("was", false);
        Choice m5c2 = new Choice("have", true);
        Choice m5c3 = new Choice("are", false);
        Choice m5c4 = new Choice("is", false);
        m5.addChoice(m5c1);
        m5.addChoice(m5c2);
        m5.addChoice(m5c3);
        m5.addChoice(m5c4);
        
        MultipleChoice m6 = new MultipleChoice("Tenses", "A LAN is a network that connects computers. (Tech)", 3);
        Choice m6c1 = new Choice("was", false);
        Choice m6c2 = new Choice("have", false);
        Choice m6c3 = new Choice("are", false);
        Choice m6c4 = new Choice("is", true);
        m6.addChoice(m6c1);
        m6.addChoice(m6c2);
        m6.addChoice(m6c3);
        m6.addChoice(m6c4);

        managementQuestion.addQuestion(m1);
        managementQuestion.addQuestion(m2);
        managementQuestion.addQuestion(m3);
        managementQuestion.addQuestion(m4);
        managementQuestion.addQuestion(m5);
        managementQuestion.addQuestion(m6);

//      qlCauHoi.danhSachTheoDoKho(0).thucThi();
//      incomplete
        //Easy
        Incomplete i1 = new Incomplete("Grammar", "What ... your name? ... name is Nam (info)", 0);

        MultipleChoice i1m1 = new MultipleChoice("eng", "Dien vao cho trong thu (1)", 0);
        Choice i1m1c1 = new Choice("is", true);
        Choice i1m1c2 = new Choice("are", false);
        Choice i1m1c3 = new Choice("were", false);
        Choice i1m1c4 = new Choice("was", false);
        i1m1.addChoice(i1m1c1);
        i1m1.addChoice(i1m1c2);
        i1m1.addChoice(i1m1c3);
        i1m1.addChoice(i1m1c4);

        MultipleChoice i1m2 = new MultipleChoice("Grammar", "Dien vao cho trong thu (2)", 0);
        Choice i1m2c1 = new Choice("His", false);
        Choice i1m2c2 = new Choice("Her", false);
        Choice i1m2c3 = new Choice("My", true);
        Choice i1m2c4 = new Choice("Your", false);
        i1m2.addChoice(i1m2c1);
        i1m2.addChoice(i1m2c2);
        i1m2.addChoice(i1m2c3);
        i1m2.addChoice(i1m2c4);

        i1.addQuestion(i1m1);
        i1.addQuestion(i1m2);

        Incomplete i2 = new Incomplete("Grammar", " ... do you live? I live ... Viet Nam (info)", 0);

        MultipleChoice i2m1 = new MultipleChoice("Grammar", "Dien vao cho trong thu (1)", 0);
        Choice i2m1c1 = new Choice("What", false);
        Choice i2m1c2 = new Choice("Where", true);
        Choice i2m1c3 = new Choice("Who", false);
        Choice i2m1c4 = new Choice("Which", false);
        i2m1.addChoice(i2m1c1);
        i2m1.addChoice(i2m1c2);
        i2m1.addChoice(i2m1c3);
        i2m1.addChoice(i2m1c4);

        MultipleChoice i2m2 = new MultipleChoice("Grammar", "Dien vao cho trong thu (2)", 0);
        Choice i2m2c1 = new Choice("in", true);
        Choice i2m2c2 = new Choice("on", false);
        Choice i2m2c3 = new Choice("at", false);
        Choice i2m2c4 = new Choice("it", false);
        i2m2.addChoice(i2m2c1);
        i2m2.addChoice(i2m2c2);
        i2m2.addChoice(i2m2c3);
        i2m2.addChoice(i2m2c4);

        i2.addQuestion(i2m1);
        i2.addQuestion(i2m2);

        //Normal
        Incomplete i3 = new Incomplete("Tenses", "My friends ... to the zoo but we ... yesterday", 1);

        MultipleChoice i3m1 = new MultipleChoice("Tenses", "Dien vao cho trong thu (1)", 1);
        Choice i3m1c1 = new Choice("didn't go", false);
        Choice i3m1c2 = new Choice("don't go", true);
        Choice i3m1c3 = new Choice("does go", false);
        Choice i3m1c4 = new Choice("doesn't go", false);
        i3m1.addChoice(i3m1c1);
        i3m1.addChoice(i3m1c2);
        i3m1.addChoice(i3m1c3);
        i3m1.addChoice(i3m1c4);

        MultipleChoice i3m2 = new MultipleChoice("Tenses", "Dien vao cho trong thu (2)", 1);
        Choice i3m2c1 = new Choice("were", true);
        Choice i3m2c2 = new Choice("did", false);
        Choice i3m2c3 = new Choice("don't", false);
        Choice i3m2c4 = new Choice("was", false);
        i3m2.addChoice(i3m2c1);
        i3m2.addChoice(i3m2c2);
        i3m2.addChoice(i3m2c3);
        i3m2.addChoice(i3m2c4);

        i3.addQuestion(i3m1);
        i3.addQuestion(i3m2);

        Incomplete i4 = new Incomplete("Tenses", "We ... not allower ... jeans at school", 1);

        MultipleChoice i4m1 = new MultipleChoice("Tenses", "Dien vao cho trong thu (1)", 1);
        Choice i4m1c1 = new Choice("is", false);
        Choice i4m1c2 = new Choice("are", true);
        Choice i4m1c3 = new Choice("was", false);
        Choice i4m1c4 = new Choice("were", false);
        i4m1.addChoice(i4m1c1);
        i4m1.addChoice(i4m1c2);
        i4m1.addChoice(i4m1c3);
        i4m1.addChoice(i4m1c4);

        MultipleChoice i4m2 = new MultipleChoice("Tenses", "Dien vao cho trong thu (2)", 1);
        Choice i4m2c1 = new Choice("to wear", true);
        Choice i4m2c2 = new Choice("wear", false);
        Choice i4m2c3 = new Choice("wearing", false);
        Choice i4m2c4 = new Choice("worn", false);
        i4m2.addChoice(i4m2c1);
        i4m2.addChoice(i4m2c2);
        i4m2.addChoice(i4m2c3);
        i4m2.addChoice(i4m2c4);

        i4.addQuestion(i4m1);
        i4.addQuestion(i4m2);

        //Hard
        Incomplete i5 = new Incomplete("Tenses", "How .... since we .... school?", 2);

        MultipleChoice i5m1 = new MultipleChoice("Tenses", "Dien vao cho trong thu (1)", 2);
        Choice i5m1c1 = new Choice("are you", false);
        Choice i5m1c2 = new Choice("have you", true);
        Choice i5m1c3 = new Choice("have you been", false);
        Choice i5m1c4 = new Choice("were you", false);
        i5m1.addChoice(i5m1c1);
        i5m1.addChoice(i5m1c2);
        i5m1.addChoice(i5m1c3);
        i5m1.addChoice(i5m1c4);

        MultipleChoice i5m2 = new MultipleChoice("Tenses", "Dien vao cho trong thu (2)", 2);
        Choice i5m2c1 = new Choice("left", false);
        Choice i5m2c2 = new Choice("have left", true);
        Choice i5m2c3 = new Choice("has left", false);
        Choice i5m2c4 = new Choice("had left", false);
        i5m2.addChoice(i5m2c1);
        i5m2.addChoice(i5m2c2);
        i5m2.addChoice(i5m2c3);
        i5m2.addChoice(i5m2c4);

        i5.addQuestion(i5m1);
        i5.addQuestion(i5m2);

        Incomplete i6 = new Incomplete("Tenses", "Since we .... in the new house we .... very busy.", 2);

        MultipleChoice i6m1 = new MultipleChoice("Tenses", "Dien vao cho trong thu (1)", 2);
        Choice i6m1c1 = new Choice("move", false);
        Choice i6m1c2 = new Choice("have moved", true);
        Choice i6m1c3 = new Choice("moved", false);
        Choice i6m1c4 = new Choice("has move", false);
        i6m1.addChoice(i6m1c1);
        i6m1.addChoice(i6m1c2);
        i6m1.addChoice(i6m1c3);
        i6m1.addChoice(i6m1c4);

        MultipleChoice i6m2 = new MultipleChoice("Tenses", "Dien vao cho trong thu (2)", 2);
        Choice i6m2c1 = new Choice("is", false);
        Choice i6m2c2 = new Choice("are", true);
        Choice i6m2c3 = new Choice("were", false);
        Choice i6m2c4 = new Choice("have been", false);
        i6m2.addChoice(i6m2c1);
        i6m2.addChoice(i6m2c2);
        i6m2.addChoice(i6m2c3);
        i6m2.addChoice(i6m2c4);

        i6.addQuestion(i6m1);
        i6.addQuestion(i6m2);

        managementQuestion.addQuestion(i1);
        managementQuestion.addQuestion(i2);
        managementQuestion.addQuestion(i3);
        managementQuestion.addQuestion(i4);
        managementQuestion.addQuestion(i5);
        managementQuestion.addQuestion(i6);

//qlCauHoi.danhSachTheoInComplete().thucThi();
//Conservation
        Conversation c1 = new Conversation("Success", "Books which give instructions on how to do things are very popular in the United States today.\nThousands of these How-to books are useful. In fact, there are about four thousand books with\ntitles that begin with the words “How to”.One book may tell you how to earn more money.\nAnother may tell you how to save or spend it and another may explain how to give your money away.\n"
                + "\n"
                + "Many How-to books give advice on careers. They tell you how to choose a career and ‘now to succeed in it.\nIf you fail, however, you can buy the book ” How to Turn Failure into Success”. If you would like to\nbecome very rich, you can buy the book “How to Make a Millionaire”.\nIf you never make any money at all, you may need a book called “How to Live on Nothing”.\n"
                + "\n"
                + "One of the most popular types of books is one that helps you with personal problems. If you want\nto have a better love of life, you can read “How to Succeed in Love every Minute of Your Life”.\nIf you are tired of books on happiness, you may prefer books which give step-by-step instructions\non how to redecorate or enlarge a house.\n"
                + "\n"
                + "Why have How-to books become so popular? Probably because life has become so complex. Today people\nhave far more free time to use, more choices to make, and more problems to solve. How-to books help\npeople deal with modern life.", 0);

        MultipleChoice c1m1 = new MultipleChoice("Success", "What is the passage mainly about?", 0);
        Choice c1m1v1 = new Choice("How to succeed in love every minute of your life.", false);
        Choice c1m1v2 = new Choice("How to turn failure into success.", false);
        Choice c1m1v3 = new Choice("How to make a millionaire.", false);
        Choice c1m1v4 = new Choice("How-to books.", true);
        c1m1.addChoice(c1m1v1);
        c1m1.addChoice(c1m1v2);
        c1m1.addChoice(c1m1v3);
        c1m1.addChoice(c1m1v4);

        MultipleChoice c1m2 = new MultipleChoice("Success", "The word “it” in paragraph 2 refers to _________", 0);
        Choice c1m2v1 = new Choice("advice ", false);
        Choice c1m2v2 = new Choice("instruction ", true);
        Choice c1m2v3 = new Choice("how-to books ", false);
        Choice c1m2v4 = new Choice("career", false);
        c1m2.addChoice(c1m2v1);
        c1m2.addChoice(c1m2v2);
        c1m2.addChoice(c1m2v3);
        c1m2.addChoice(c1m2v4);

        MultipleChoice c1m3 = new MultipleChoice("Success", "Which of the following is NOT the type of books giving information on careers?", 0);
        Choice c1m3v1 = new Choice("“How to Succeed in Love every Minute of Your Life”.", true);
        Choice c1m3v2 = new Choice("“How to Live on Nothing”", false);
        Choice c1m3v3 = new Choice("“How to Make a Millionaire”.", false);
        Choice c1m3v4 = new Choice("“How to Turn Failure into Success”", false);
        c1m3.addChoice(c1m3v1);
        c1m3.addChoice(c1m3v2);
        c1m3.addChoice(c1m3v3);
        c1m3.addChoice(c1m3v4);

        MultipleChoice c1m4 = new MultipleChoice("Success", "The word “step-by-step” in paragraph 3 is closest in meaning to", 0);
        Choice c1m4v1 = new Choice("little by little", false);
        Choice c1m4v2 = new Choice("gradually", true);
        Choice c1m4v3 = new Choice("slower and slower", false);
        Choice c1m4v4 = new Choice("A and B", false);
        c1m4.addChoice(c1m4v1);
        c1m4.addChoice(c1m4v2);
        c1m4.addChoice(c1m4v3);
        c1m4.addChoice(c1m4v4);

        MultipleChoice c1m5 = new MultipleChoice("Success", "It can be inferred from the passage that", 0);
        Choice c1m5v1 = new Choice("Today people are more bored with the modern life.", false);
        Choice c1m5v2 = new Choice("Modern life is more difficult to deal with.", true);
        Choice c1m5v3 = new Choice("Today people have fewer choices to make.", false);
        Choice c1m5v4 = new Choice("Today people are more interested in modern life.", false);
        c1m5.addChoice(c1m5v1);
        c1m5.addChoice(c1m5v2);
        c1m5.addChoice(c1m5v3);
        c1m5.addChoice(c1m5v4);

        c1.addQuestion(c1m1);
        c1.addQuestion(c1m2);
        c1.addQuestion(c1m3);
        c1.addQuestion(c1m4);
        c1.addQuestion(c1m5);

        Conversation c2 = new Conversation("Entertainment", "Most of us tend to think of production when we think of mass media industries. After all, it\n"
                + "is the output of this production – the papers we read, the cable TV shows we watch – that grab our\n"
                + "attention, make us happy or angry, interested or bored. Moreover, most public discussion about\n"
                + "mass communication tends to be about production. The latest gossip about that actor will be in\n"
                + "what film, the angry comments a mayor makes about the violence on local TV news, the newest\n"
                + "CDs by an up-and-coming group – these are the kinds of topics that focus our attention on the\n"
                + "making of content, not its distribution or exhibition.\n"
                + "Media executives know, however, that production is only one step in the arduous and risky\n"
                + "process of getting a mass media idea to an audience. Distribution is the delivery of the produced\n"
                + "material to the point where it will be shown to its intended audience. The activity takes place out of\n"
                + "public view. We have already mentioned the NBC acts as a distributor when it disseminates\n"
                + "television programming via satellite to TV stations. When Philadelphia Newspapers Inc. delivers\n"
                + "its Philadelphia Inquirer to city newsstands, when Twentieth – Century – Fox moves its Musicland\n"
                + "stores, they are involved in distribution to exhibitions.", 2);

        MultipleChoice c2m1 = new MultipleChoice("Entertainment", "In this passage, “arduous” means .", 2);
        Choice c2m1v1 = new Choice("difficult", true);
        Choice c2m1v2 = new Choice("lucrative", false);
        Choice c2m1v3 = new Choice("lengthy", false);
        Choice c2m1v4 = new Choice("free", false);
        c2m1.addChoice(c2m1v1);
        c2m1.addChoice(c2m1v2);
        c2m1.addChoice(c2m1v3);
        c2m1.addChoice(c2m1v4);

        MultipleChoice c2m2 = new MultipleChoice("Entertainment", "The passage states that people tend to focus on production because .", 2);
        Choice c2m2v1 = new Choice("it takes place out of public view ", false);
        Choice c2m2v2 = new Choice("mass media companies do not own production divisions ", false);
        Choice c2m2v3 = new Choice("the output of mass media is intended to grab our attention", true);
        Choice c2m2v4 = new Choice("companies can function as both producers and distributors", false);
        c2m2.addChoice(c2m2v1);
        c2m2.addChoice(c2m2v2);
        c2m2.addChoice(c2m2v3);
        c2m2.addChoice(c2m2v4);

        MultipleChoice c2m3 = new MultipleChoice("Entertainment", "In this passage, to “disseminate” means to __ .", 2);
        Choice c2m3v1 = new Choice("create", false);
        Choice c2m3v2 = new Choice("send out", true);
        Choice c2m3v3 = new Choice("take in", false);
        Choice c2m3v4 = new Choice("fertilize", false);
        c2m3.addChoice(c2m3v1);
        c2m3.addChoice(c2m3v2);
        c2m3.addChoice(c2m3v3);
        c2m3.addChoice(c2m3v4);

        MultipleChoice c2m4 = new MultipleChoice("Entertainment", "This passage states that distribution is .", 2);
        Choice c2m4v1 = new Choice("the first step in mass media production", false);
        Choice c2m4v2 = new Choice("the most talked-about step in mass media production", false);
        Choice c2m4v3 = new Choice("at least as important as production", true);
        Choice c2m4v4 = new Choice("not as important as exhibition", false);
        c2m4.addChoice(c2m4v1);
        c2m4.addChoice(c2m4v2);
        c2m4.addChoice(c2m4v3);
        c2m4.addChoice(c2m4v4);

        MultipleChoice c2m5 = new MultipleChoice("Entertainment", "The author’s purpose in writing this passage is to .", 2);
        Choice c2m5v1 = new Choice("tell an interesting story", false);
        Choice c2m5v2 = new Choice("define a concept clearly", true);
        Choice c2m5v3 = new Choice("describe a scene vividly", false);
        Choice c2m5v4 = new Choice("argue with the reader", false);
        c2m5.addChoice(c2m5v1);
        c2m5.addChoice(c2m5v2);
        c2m5.addChoice(c2m5v3);
        c2m5.addChoice(c2m5v4);

        c2.addQuestion(c2m1);
        c2.addQuestion(c2m2);
        c2.addQuestion(c2m3);
        c2.addQuestion(c2m4);
        c2.addQuestion(c2m5);

        Conversation c3 = new Conversation("Entertainment", "When we were in England last year, I went fishing with my friend, Peter. Early in the\n"
                + "morning we were sitting quietly by the side of the lake when we had an unpleasant surprise. We\n"
                + "saw a duck come along with three ducklings padding cheerfully behind her. As we watched them,\n"
                + "there was a sudden swirl in the water. We caught a glimpse of the vicious jaws of a pike – a fish\n"
                + "which is rather like a freshwater shark – and one of the ducklings was dragged below the surface.\n"
                + "This incident made Peter furious. He vowed to catch the pike. On three successive\n"
                + "mornings we returned to the vicinity and used several different kinds of bait. On the third day\n"
                + "Peter was lucky. Using an artificial frog as bait, he managed to hook the monster. There was a\n"
                + "desperate fight but Peter was determined to capture the pike and succeeded. When he had got it\n"
                + "ashore and killed it, he wieghed the fish and found that it scaled nearly thirty pounds\n"
                + "– a record for that district.", 1);

        MultipleChoice c3m1 = new MultipleChoice("Entertainment", "Why do you think Peter was sitting quietly by the lake?", 1);
        Choice c3m1v1 = new Choice("He was watching the ducks.", false);
        Choice c3m1v2 = new Choice("He wasn’t very talkative.", false);
        Choice c3m1v3 = new Choice("He was waiting for the pike to appear.", false);
        Choice c3m1v4 = new Choice("He was fishing", true);
        c3m1.addChoice(c3m1v1);
        c3m1.addChoice(c3m1v2);
        c3m1.addChoice(c3m1v3);
        c3m1.addChoice(c3m1v4);

        MultipleChoice c3m2 = new MultipleChoice("Entertainment", "To what does surprise in line 3 probably refer?", 1);
        Choice c3m2v1 = new Choice("to the duck.", false);
        Choice c3m2v2 = new Choice("to the ducklings.", false);
        Choice c3m2v3 = new Choice("to the action of the pike.", true);
        Choice c3m2v4 = new Choice("to the time of the day", false);
        c3m2.addChoice(c3m2v1);
        c3m2.addChoice(c3m2v2);
        c3m2.addChoice(c3m2v3);
        c3m2.addChoice(c3m2v4);

        MultipleChoice c3m3 = new MultipleChoice("Entertainment", "What were Peter’s feelings about the incident two days later?", 1);
        Choice c3m3v1 = new Choice("He caught and killed the pike.", false);
        Choice c3m3v2 = new Choice("He vowed that he would catch the remaining ducklings", true);
        Choice c3m3v3 = new Choice("He remained determined to catch the pike.", false);
        Choice c3m3v4 = new Choice("He caught a frog and used it as bait for the pike.", false);
        c3m3.addChoice(c3m3v1);
        c3m3.addChoice(c3m3v2);
        c3m3.addChoice(c3m3v3);
        c3m3.addChoice(c3m3v4);

        MultipleChoice c3m4 = new MultipleChoice("Entertainment", "How much was the pike worth?", 1);
        Choice c3m4v1 = new Choice("about thirty pounds.", false);
        Choice c3m4v2 = new Choice("about two hundred and forty dollars.", false);
        Choice c3m4v3 = new Choice("the passage contains no information on this point.", true);
        Choice c3m4v4 = new Choice("the passage says that the fish scaled nearly thirty pound.", false);
        c3m4.addChoice(c3m4v1);
        c3m4.addChoice(c3m4v2);
        c3m4.addChoice(c3m4v3);
        c3m4.addChoice(c3m4v4);

        MultipleChoice c3m5 = new MultipleChoice("Entertainment", "Which of the following titles best sums up the whole passage?", 1);
        Choice c3m5v1 = new Choice("Mysterious disappearance of ducklings.", false);
        Choice c3m5v2 = new Choice("Revenge on a duck.", true);
        Choice c3m5v3 = new Choice("Record pike caught by an angry fisherman.", false);
        Choice c3m5v4 = new Choice("Huge pike caught by fisherman after desperate struggle atsea.", false);
        c3m5.addChoice(c3m5v1);
        c3m5.addChoice(c3m5v2);
        c3m5.addChoice(c3m5v3);
        c3m5.addChoice(c3m5v4);

        c3.addQuestion(c3m1);
        c3.addQuestion(c3m2);
        c3.addQuestion(c3m3);
        c3.addQuestion(c3m4);
        c3.addQuestion(c3m5);

        managementQuestion.addQuestion(c1);
        managementQuestion.addQuestion(c3);
        managementQuestion.addQuestion(c2);

        int choiceMenuChinh, choiceNguoiHoc, choiceLoaiCauHoi, choiceQuanLiCauHoi;
        boolean mainThread, threadNguoiHoc, threadLamBai, threadCauHoi;

        mainThread = true;

        // MENU CHINH
        while (mainThread) {
            threadNguoiHoc = threadLamBai = threadCauHoi = true;
//            posMenuChinh:
            menuChinh();
            choiceMenuChinh = sc.nextInt();

            switch (choiceMenuChinh) {
                case 1:
                    while (threadNguoiHoc) {
                        menuNguoiHoc();
                        choiceNguoiHoc = sc.nextInt();

                        switch (choiceNguoiHoc) {
                            case 1:
                                System.out.println("Danh sach nguoi hoc la: ");
                                managementStudent.exportList();
                                break;
                            case 2:
                                System.out.print("Nhap ngay sinh can tra cuu: ");
                                sc.nextLine();
                                Date ns;
                                ns = dmy.inputDMY(sc.nextLine());
                                managementStudent.searchBirthday(ns).exportList();
                                break;
                            case 3:
                                System.out.print("Nhap ten can tra cuu: ");
                                sc.nextLine();
                                String ten = sc.nextLine();
                                System.out.println("Danh sach sau khi tra cuu theo ten la: ");
                                managementStudent.searchName(ten).exportList();

                                break;
                            case 4:
                                System.out.print("Nhap que quan can tra cuu: ");
                                sc.nextLine();
                                String quequan = sc.nextLine();

                                System.out.println("Danh sach sau khi tra cuu theo que quan la: ");
                                managementStudent.searchCountry(quequan).exportList();
                                break;
                            case 5:
                                System.out.print("Nhap gioi tinh can tra cuu (Nam: 0, Nu: 1): ");
                                int gioitinh = sc.nextInt();

                                System.out.println("Danh sach sau khi tra cuu theo gioi tinh la: ");
                                managementStudent.searchSex(gioitinh).exportList();
                                break;
                            case 6:
                                System.out.println("Them hoc vien moi");
                                Student hocVienMoi = new Student();
                                hocVienMoi.inputData();
                                managementStudent.add(hocVienMoi);

                                break;
                            case 7:
                                System.out.println("\nCap nhat thong tin nguoi hoc");
                                managementStudent.exportList();

                                System.out.print("\nId can cap nhat: ");
                                int id = sc.nextInt();

                                System.out.println(managementStudent.getStudent(id));
                                managementStudent.update(id);
                                break;
                            case 8:
                                System.out.println("\nXoa thong tin nguoi hoc");
                                managementStudent.exportList();
                                System.out.print("\nId can xoa: ");
                                int ID = sc.nextInt();
                                managementStudent.delete(ID);
                                break;
                            case 0:
                                threadNguoiHoc = false;
                                break;
                            default:
                                System.out.println("Loi!");
                                break;
                        }
                    }
                    break;

                case 2:
                    while (threadCauHoi) {
                        menuQuanLiCauHoi();
                        choiceQuanLiCauHoi = sc.nextInt();

                        switch (choiceQuanLiCauHoi) {
                            case 1:
                                managementQuestion.exportContent();
                                break;
                            case 2:
                                System.out.print("\nNoi dung can tra cuu: ");
                                sc.nextLine();
                                String noiDungTraCuu = sc.nextLine();
                                managementQuestion.searchContent(noiDungTraCuu).exportContent();
                                break;
                            case 3:
                                System.out.print("\nChu de can tra cuu: ");
                                sc.nextLine();
                                String chuDeTraCuu = sc.nextLine();
                                managementQuestion.searchTopic(chuDeTraCuu).exportContent();
                                break;
                            case 4:
                                System.out.print("Do kho (De: 0, Trung Binh: 1, Kho: 2): ");
                                int doKhoTraCuu = sc.nextInt();
                                managementQuestion.searchLevel(doKhoTraCuu).exportContent();
                                break;
                            case 0:
                                threadCauHoi = false;
                                break;
                            default:
                                System.out.println("LOI !!!");
                                break;
                        }
                    }
                    break;

                case 3:
                    while (threadLamBai) {
                        menuChonCauHoi();
                        choiceLoaiCauHoi = sc.nextInt();

                        switch (choiceLoaiCauHoi) {
                            case 1:
                                int soCauMultiple;
                                System.out.print("So luong cau hoi muon lam: ");
                                soCauMultiple = sc.nextInt();

                                if (soCauMultiple > managementQuestion.countMultipleChoice()) {
                                    System.out.println("\nSo luong cau hoi khong du");
                                } else {
                                    managementQuestion.multipleChoiceList(soCauMultiple).excute();
                                }
                                break;

                            case 2:
                                int doKho;
                                System.out.print("Do kho (De: 0, Trung Binh: 1, Kho: 2): ");
                                doKho = sc.nextInt();

                                managementQuestion.randomIncomplete(doKho).excute();
                                break;

                            case 3:
                                int dokho;
                                System.out.print("Do kho (De: 0, Trung Binh: 1, Kho: 2): ");
                                dokho = sc.nextInt();

                                managementQuestion.randomConversation(dokho).excute();
                                break;

                            case 0:
                                threadLamBai = false;
                                break;

                            default:
                                System.out.println("LOI !!!");
                                break;
                        }
                    }
                    break;

                case 0:
                    mainThread = false;
                    break;
                default:
                    System.out.println("LOI !!!");
                    break;
            }
        }

//      menu lam cau hoi
    }

    /**
     * create menu
     */
    public static void menuChinh() {
        System.out.println("\n\n----------- MENU ------------");
        System.out.println("1. Quan li nguoi hoc");
        System.out.println("2. Quan li cau hoi");
        System.out.println("3. Lam bai kiem tra");
        System.out.println("0. Thoat!");
        System.out.println("---------------------------");
        System.out.print("Your choice: ");
    }

    public static void menuNguoiHoc() {
        System.out.println("\n\n----------- MENU HOC VIEN ------------");
        System.out.println("1. Xuat danh sach thanh vien trong lop hoc ");
        System.out.println("2. Tra cuu thong tin nguoi dung theo ngay sinh");
        System.out.println("3. Tra cuu thong tin nguoi dung theo ten");
        System.out.println("4. Tra cuu thong tin nguoi dung theo que quan");
        System.out.println("5. Tra cuu thong tin nguoi dung theo gioi tinh");
        System.out.println("6. Them thong tin hoc vien moi");
        System.out.println("7. Cap nhat thong tin cua hoc vien");
        System.out.println("8. Xoa thong tin cua hoc vien");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("---------------------------");
        System.out.print("Your choice: ");
    }

    public static void menuQuanLiCauHoi() {
        System.out.println("\n\n----------- MENU QUAN LI CAU HOI ------------");
        System.out.println("1. Xuat danh sach cau hoi");
        System.out.println("2. Tra cuu theo noi dung");
        System.out.println("3. Tra cuu theo danh muc");
        System.out.println("4. Tra cuu theo muc do");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("---------------------------");
        System.out.print("Your choice: ");
    }

    public static void menuChonCauHoi() {
        System.out.println("\n\n----------- MENU CHON LOAI CAU HOI ------------");
        System.out.println("1. MultipleChoice");
        System.out.println("2. Incomplete");
        System.out.println("3. Conversation");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("---------------------------");
        System.out.print("Your choice: ");
    }
}
