package DependencyInversion;

import InterfaceSegregation.Sol.CacheStore;

public class CacheStoreService implements CacheInterface {
    @Override
    public void addKey(String key, String value) {
        //can change the DB // Can change the workflow //it doesn't create a problem to CacheInterface
    }

    @Override
    public void removeKey(String Key) {

    }

    @Override
    public void evictKey() {

    }
}
