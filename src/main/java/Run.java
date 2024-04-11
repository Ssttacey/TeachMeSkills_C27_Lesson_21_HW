import com.google.gson.Gson;

public class Run {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson(new Person("Leon", 24));
        System.out.println(json);
    }
}
