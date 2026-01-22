abstract class BaseDocument implements DocumentTemplate {
    protected String type;
    protected String header;
    protected String footer;
    protected String title;
    protected String body;

    @Override
    public DocumentTemplate cloneDoc() {
        try {
            return (DocumentTemplate) super.clone(); 
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported");
        }
    }

    @Override
    public void setTitle(String title) { this.title = title; }

    @Override
    public void setBody(String body) { this.body = body; }

    @Override
    public void print() {
        System.out.println(" " + type + " ");
        System.out.println(header);
        System.out.println("Title: " + title);
        System.out.println("Body: " + body);
        System.out.println(footer);
       
    }
}