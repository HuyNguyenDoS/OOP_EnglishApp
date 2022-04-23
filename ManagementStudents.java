import java.sql.Date;
import java.util.ArrayList;


public class ManagementStudents {

    private ArrayList<Student> studentList;
    private String LABEL = String.format("%s\t%-20s\t%-15s\t%-15s\t%-15s",
            "ID", "Name ", "Sex", "Birthday", "Country");

    public ManagementStudents(){
        this.studentList = new ArrayList<>();
    }

    public void add(Student student){
        this.studentList.add(student);
    }

    public int index(int id){
        for(int i=0; i< this.studentList.size(); i++){
            if(this.studentList.get(i).getId() == id)
                return i;
        }

        return -1;
    }

    public void delete(int id){
        int index = ManagementStudents.this.index(id);
        if (index == id)
            this.studentList.remove(ManagementStudents.this.index(id));
        else
            System.out.println("error");
    }

    public void update(int id){
        int index = ManagementStudents.this.index(id);
        if (index == id)
            this.studentList.get(index).inputData();
        else
            System.out.println("error");
    }

    public void exportList(){
        System.out.println(this.LABEL);
        for(Student student : studentList){
            System.out.println(student);
        }
    }

    public Student getStudent(int id){
        for(int i = 0; i < this.studentList.size(); i++){
            if (this.studentList.get(i).getId() == id){
                return this.studentList.get(i);    
            }
        }

        return null;
    }

    public ManagementStudents searchName(String name){
        ManagementStudents m = new ManagementStudents();
        for(Student student : studentList){
            if(student.getName().toLowerCase().contains(name.toLowerCase()) == true )
                m.add(student);
        }
        return m;
    }

    public ManagementStudents searchCountry(String country){
        ManagementStudents m = new ManagementStudents();
        for(Student student : studentList){
            if(student.getCountry().toLowerCase().contains(country.toLowerCase()) == true )
                m.add(student);
        }
        return m;
    }

    public ManagementStudents searchSex(int sex){
        ManagementStudents m = new ManagementStudents();
        for(Student student : studentList){
            if(student.getSex() == sex )
                m.add(student);
        }
        return m;
    }

    public ManagementStudents searchBirthday(java.util.Date ns){
        ManagementStudents m = new ManagementStudents();
        for(Student student : studentList){
            if(student.getBirthday().equals(ns))
                m.add(student);
        }
        return m;
    }
}
