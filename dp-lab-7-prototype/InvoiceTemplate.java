class InvoiceTemplate extends BaseDocument {
    public InvoiceTemplate() {
        type = "INVOICE";
        header = "Invoice Header";
        footer = "Invoice Footer (Thank you)";
        title = "Default Invoice Title";
        body  = "Default Invoice Content...";
    }
}