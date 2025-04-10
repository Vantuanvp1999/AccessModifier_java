public class testStudent {
    private String name = "John";
    private String classes = "C02";

    public testStudent() {
    }
    protected String getName() {
        return name;
    }
    protected String getClasses() {
        return classes;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
}
