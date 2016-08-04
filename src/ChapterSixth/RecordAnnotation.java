package ChapterSixth;


public class RecordAnnotation {
    @Field_Method_Parameter_Annotation(describe = "id", type = int.class)
    int id;
    @Field_Method_Parameter_Annotation(describe = "name", type = String.class)
    String name;
    @Constructor_Annotation()
    public RecordAnnotation() {
    }
    @Constructor_Annotation("start initalize the constructor method")
    public RecordAnnotation(
            @Field_Method_Parameter_Annotation(describe = "id", type = int.class)
            int id,
            @Field_Method_Parameter_Annotation(describe = "name", type = String.class)
            String name) {
        this.id = id;
        this.name = name;
    }
    @Field_Method_Parameter_Annotation(describe = "setId")
    public void setId(
        @Field_Method_Parameter_Annotation(describe = "id", type = int.class)
        int id) {
        this.id = id;
    }
    @Field_Method_Parameter_Annotation(describe = "getId", type = int.class)
    public int getId() {
        return id;
    }
    @Field_Method_Parameter_Annotation(describe = "getName", type = String.class)
    public String getName() {
        return name;
    }
    @Field_Method_Parameter_Annotation(describe = "setName", type = String.class)
    public void setName(
            @Field_Method_Parameter_Annotation(describe = "name", type = String.class)
            String name) {
        this.name = name;
    }
}