package InterfaceSegregation;

public interface Store {
    public void Save();
    public void Delete();
    public void Update();
    public void Fetch();
    public void AddKey();
    public void RemoveKey();
    public void Evict();
}
