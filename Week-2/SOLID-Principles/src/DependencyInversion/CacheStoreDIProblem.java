package DependencyInversion;

public class CacheStoreDIProblem {//Implemented without Interfaces
    //These implemented as per initial requirement, but might have to be changed
    public void addKey(String key, String value) {

    }
    public void removeKey(String Key) {

    }
    public void evictKey() {

    }

    public static void main(String[] args) {
        CacheStoreDIProblem cs = new CacheStoreDIProblem();
        cs.addKey("dev","spring");//this will be impacted when there is a change in numParameters
    }
}
