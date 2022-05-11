import java.util.LinkedHashSet;

public class App60 {
    public static void main(String[] args) {
        //init set object
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");

        //show set
        for(String str : linkedHashSet)
        {
            System.out.println(str);
        }

    }
}