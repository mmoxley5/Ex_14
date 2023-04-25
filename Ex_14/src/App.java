import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws IOException {

        ArrayList<Tasks> myList = new ArrayList<>();
        ObjectMapper map = new ObjectMapper();

        File file = new File("json.data");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String total="";
        while((st = br.readLine())!=null){
            total = total+st;
        }
        
        ArrayList<Tasks>myList3 = map.readValue(total, ArrayList.class);
        System.out.println("Reading in Values");
        System.out.println(myList3);
            






    }



}

class Tasks{
    @Override
    public String toString() {
        return "Tasks [body=" + body + ", done=" + done + ", id=" + id + ", priority=" + priority + ", title=" + title
                + "]";
    }
    public Tasks(String body, Boolean done, int id, int priority, String title) {
        this.body = body;
        this.done = done;
        this.id = id;
        this.priority = priority;
        this.title = title;
    }
    private String body;
    private Boolean done;
    private int id;
    private int priority;
    private String title;
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public Boolean getDone() {
        return done;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
