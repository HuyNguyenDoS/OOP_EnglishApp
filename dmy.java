import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dmy {
    Scanner sc = new Scanner(System.in);

    public Date inputDMY(String s){
        Date date = new Date();

        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try{
            date=df.parse(s);  //chuyển đổi string n thành dạng date
        } catch(Exception e){
            System.out.println("Invalid Date");
        }

        return date;
    }

    public String outputDMY(Date date){
        if(date != null){
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            return df.format(date);
        } else {
            return "n/a";
        }
    }
}
