package ChapterSixth;


public class RecordAnnotation {
    @FieldMethodParameterAnnotation(describe = "id", type = int.class)
    int id;
    @FieldMethodParameterAnnotation(describe = "name", type = String.class)
    String name;
    @ConstructorAnnotation()
    public RecordAnnotation() {
    }
    @ConstructorAnnotation("start initalize the constructor method")
    public RecordAnnotation(
            @FieldMethodParameterAnnotation(describe = "id", type = int.class)
            int id,
            @FieldMethodParameterAnnotation(describe = "name", type = String.class)
            String name) {
        this.id = id;
        this.name = name;
    }
    @FieldMethodParameterAnnotation(describe = "setId")
    public void setId(
            @FieldMethodParameterAnnotation(describe = "id", type = int.class)
        int id) {
        this.id = id;
    }
    @FieldMethodParameterAnnotation(describe = "getId", type = int.class)
    public int getId() {
        return id;
    }
    @FieldMethodParameterAnnotation(describe = "getName", type = String.class)
    public String getName() {
        return name;
    }
    @FieldMethodParameterAnnotation(describe = "setName", type = String.class)
    public void setName(
            @FieldMethodParameterAnnotation(describe = "name", type = String.class)
            String name) {
        this.name = name;
    }
}