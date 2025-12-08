
import java.util.HashMap;

public class HashMapArray{

    public static void main(){

    HashMap<String, Integer> person = new HashMap<String, Integer>();

    person.put("Harry", 12);
    person.put("James", 22);
    person.put("John", 45);

    for(String i : person.keySet()){
        System.out.println("Persona: " + i + ", vecums: " + person.get(i));
    }
        
    }

}

// 2.uzdevums
// Izveidojiet programmu, kas apstrādā Hash Table tipa masīvu un izvada katru tā elementu ar For-Each.
// Izmantojiet HashMap implementāciju.
// Izveidojiet sarakstu ar vismaz 3 elementiem, kurā atslēga ir vārds (String), bet vērtība - vecums (int).
// Veidotos sekojoša formāta izvadi katram vērtību pārim, "Persona: {Vārds}, vecums: {vecums} gadi."