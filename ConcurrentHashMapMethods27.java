import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods27 {
   // reduceToLong​(long parallelismThreshold, ToLongBiFunction<? super K,​? super V> transformer, long basis, LongBinaryOperator reducer)

    public static void main(String[] args) throws Exception {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println("Map:" + map);

        long result = map.reduceToLong(2, (k, v) -> {
            System.out.println("Key:" + k + " Value:" + v);
            return Long.parseLong(v);
        }, 1, (k1, k2) -> {
            System.out.println("Key1:" + k1 + " Key2:" + k2);
            return k1 + k2;
        });
        System.out.println("Result:" + result);

    }
    
}
