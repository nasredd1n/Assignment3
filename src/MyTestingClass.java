public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 29 * hash + id;
        hash = 29 * hash + name.hashCode();
        return hash;
    }
}
