interface DocumentTemplate extends Cloneable {
    DocumentTemplate cloneDoc();
    void setTitle(String title);
    void setBody(String body);
    void print();
}