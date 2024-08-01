import java.util.HashMap;
import java.util.Map;

public class MapModifier {

    public static Map<String, String> mapAB4(Map<String, String> map) {
        // Get values from the map
        String a = map.get("a");
        String b = map.get("b");
        String c = map.get("c");

        // Check if both "a" and "b" are present
        if (a != null && b != null) {
            if (a.length() != b.length()) {
                // Set "c" to the longer value
                if (a.length() > b.length()) {
                    map.put("c", a);
                } else {
                    map.put("c", b);
                }
            } else {
                // If lengths are the same, set "a", "b", and "c" to empty strings
                map.put("a", "");
                map.put("b", "");
                map.put("c", "");
            }
        } else if (a != null) {
            // If only "a" is present, set "c" to "a" if "c" is not present
            if (map.get("c") == null) {
                map.put("c", a);
            }
        } else if (b != null) {
            // If only "b" is present, set "c" to "b" if "c" is not present
            if (map.get("c") == null) {
                map.put("c", b);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        // Test cases
        Map<String, String> testMap1 = new HashMap<>();
        testMap1.put("a", "aaa");
        testMap1.put("b", "bb");
        testMap1.put("c", "cake");
        System.out.println(mapAB4(testMap1)); // {a=aaa, b=bb, c=aaa}

        Map<String, String> testMap2 = new HashMap<>();
        testMap2.put("a", "aa");
        testMap2.put("b", "bbb");
        testMap2.put("c", "cake");
        System.out.println(mapAB4(testMap2)); // {a=aa, b=bbb, c=bbb}

        Map<String, String> testMap3 = new HashMap<>();
        testMap3.put("a", "aa");
        testMap3.put("b", "bbb");
        System.out.println(mapAB4(testMap3)); // {a=aa, b=bbb, c=bbb}

        Map<String, String> testMap4 = new HashMap<>();
        testMap4.put("a", "aaa");
        System.out.println(mapAB4(testMap4)); // {a=aaa, c=aaa}

        Map<String, String> testMap5 = new HashMap<>();
        testMap5.put("b", "bbb");
        System.out.println(mapAB4(testMap5)); // {b=bbb, c=bbb}

        Map<String, String> testMap6 = new HashMap<>();
        testMap6.put("a", "aaa");
        testMap6.put("b", "bbb");
        testMap6.put("c", "cake");
        System.out.println(mapAB4(testMap6)); // {a=, b=, c=}

        Map<String, String> testMap7 = new HashMap<>();
        testMap7.put("a", "a");
        testMap7.put("b", "b");
        testMap7.put("c", "cake");
        System.out.println(mapAB4(testMap7)); // {a=, b=, c=}

        Map<String, String> testMap8 = new HashMap<>();
        testMap8.put("a", "");
        testMap8.put("b", "b");
        testMap8.put("c", "cake");
        System.out.println(mapAB4(testMap8)); // {a=, b=b, c=b}

        Map<String, String> testMap9 = new HashMap<>();
        testMap9.put("a", "a");
        testMap9.put("b", "");
        testMap9.put("c", "cake");
        System.out.println(mapAB4(testMap9)); // {a=a, b=, c=a}

        Map<String, String> testMap10 = new HashMap<>();
        testMap10.put("c", "cat");
        testMap10.put("d", "dog");
        System.out.println(mapAB4(testMap10)); // {c=cat, d=dog}

        Map<String, String> testMap11 = new HashMap<>();
        testMap11.put("ccc", "ccc");
        System.out.println(mapAB4(testMap11)); // {ccc=ccc}

        Map<String, String> testMap12 = new HashMap<>();
        testMap12.put("c", "a");
        testMap12.put("d", "b");
        System.out.println(mapAB4(testMap12)); // {c=a, d=b}

        Map<String, String> testMap13 = new HashMap<>();
        System.out.println(mapAB4(testMap13)); // {}

        Map<String, String> testMap14 = new HashMap<>();
        testMap14.put("a", "");
        testMap14.put("z", "z");
        System.out.println(mapAB4(testMap14)); // {a=, z=z}

        Map<String, String> testMap15 = new HashMap<>();
        testMap15.put("b", "");
        testMap15.put("z", "z");
        System.out.println(mapAB4(testMap15)); // {b=, z=z}
    }
}
