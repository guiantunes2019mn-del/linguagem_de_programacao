import java.util.List;
import java.util.ArrayList;
public class Main {
    private static List<Professor> professor = new ArrayList<>();
    private static List<Aluno> aluno = new ArrayList<>();

    public static void main(String[] args) {
        professor.add(new Professor("Amarillo"));
        professor.add(new Professor("Inocencio"));
        professor.add(new Professor("Jubileu"));

        aluno.add(new Aluno("Aeronauta Barata"));
        aluno.add(new Aluno("Savalo horse"));

       for (Professor prof : professor) {
        System.out.println("Nome do professor: " + prof.getNome());
       }

    for (Aluno al : aluno) {
        System.out.println("Nome do Aluno: " + al.getNome());
        }
    }
}

