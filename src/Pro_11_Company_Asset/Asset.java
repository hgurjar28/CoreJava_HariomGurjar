package Pro_11_Company_Asset;
public class Asset {
    private String id;
    private String name;

    public Asset(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Asset{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}


