import java.util.List;
import java.util.ArrayList;
public class Main {
    private static List<Professor> professor = new ArrayList<>();

    public static void main(String[] args) {
        professor.add(new Professor("Amarillo"));
        professor.add(new Professor("Inocencio"));
        professor.add(new Professor("Jubileu"));

       for (Professor prof : professor) {
        System.out.println("Nome: " + prof.getNome());
       }
    }
}