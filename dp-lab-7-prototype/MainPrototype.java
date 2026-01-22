public class MainPrototype {
    public static void main(String[] args) {
        TemplateRegistry registry = new TemplateRegistry();

        DocumentTemplate r1 = registry.createFromTemplate("report");
        r1.setTitle("Weekly Sales Report");
        r1.setBody("Sales increased by 12% this week.");
        r1.print();

        DocumentTemplate i1 = registry.createFromTemplate("invoice");
        i1.setTitle("Invoice #A102");
        i1.setBody("Customer: XYZ | Amount: 9000 BDT");
        i1.print();

        DocumentTemplate c1 = registry.createFromTemplate("contract");
        c1.setTitle("Employment Contract");
        c1.setBody("Terms and conditions apply...");
        c1.print();
    }
}
