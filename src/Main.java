import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Age", 10);
        Pair<Integer,String> error= new Pair<>(404, "Not found");
        System.out.println(student);
        System.out.println(error);
        System.out.println(student.equals(error));
        HashSet<Pair<String,Integer>> hashSet = new HashSet<>();
        hashSet.add(student);
        System.out.println(hashSet);
    }
}