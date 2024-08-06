package MultiThreading.concurrent_Collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentCache {
    private static final Map<String,String> cache = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final int threadNum = i;

            new Thread(()->{
                String key = "Key @ "+threadNum;
                for(int j = 0; j < 10; j++){
                    String value = getCachedValue(key);
                    System.out.println("Thread "+Thread.currentThread().getName() + "Key = "+key+"Value = "+value);
                }
            }).start();
        }
    }    

    private static String getCachedValue(final String Key){
        String value = cache.get(Key);

        if(value == null){
            value = compute(Key);
            cache.put(Key,value);
        }
        return value;
    }

    private static String compute(final String key){
        System.out.println(key + " not present in the cache, so going to compute!");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return "Value for "+ key;
    }
}
