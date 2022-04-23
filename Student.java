import java.util.Date;
import java.util.Scanner;

public class Student {
    private static int count = 0;
    private int id;
    private String username;
    private String password;
    private String name;    
    private int sex;
    private Date birthday;
    private String country;

    //function nayf laf sao? moi lan goi lai class nay thi id tu dong tang
    private static dmy dmy = new dmy();
    {
        count++;
        this.id = count;
    }

    public Student(){}

    public Student(String username, String password, String name, int sex, String birthday, String country){
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.birthday = dmy.inputDMY(birthday); 
        this.country = country;
    }

    public static int getCount(){
        return count;
    }

    public static void setCount(int count){
        Student.count = count;   //static khong dung this dc, tai sao vd this.count = count
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    public String toString(){
        return String.format("%d"
                            + "\t%-20s"
                            + "\t%-15s"
                            + "\t%-15s"
                            + "\t%-15s", 
                            this.id, this.name, 
                            this.sex == 0 ? "Nam" : "Nu", dmy.outputDMY(this.birthday), this.country);   //ngay sinh
    }

    private static Scanner sc = new Scanner(System.in);
    public void inputData(){
        System.out.println("");        
        System.out.print("Ho Ten: ");
        this.name = sc.nextLine();
        
        System.out.print("Gioi Tinh: (Nam: 0, Nu: 1): ");
        this.sex = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Ngay Sinh (dd/MM/yyyy): ");
        this.birthday = dmy.inputDMY(sc.nextLine());    
        
        System.out.print("Que Quan: ");
        this.country = sc.nextLine();
    }
}
