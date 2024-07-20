package InterfaceSegregation.Sol;

public class DBStoreService implements DBStore{
    @Override
    public void Save() {
        System.out.println("saved");
    }

    @Override
    public void Delete() {
        System.out.println("Deleted");
    }

    @Override
    public void Update() {
        System.out.println("Updated");
    }

    @Override
    public void Fetch() {
        System.out.println("Fetched");
    }
}
