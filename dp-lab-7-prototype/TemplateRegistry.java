class TemplateRegistry {
    private final java.util.Map<String, DocumentTemplate> templates = new java.util.HashMap<>();

    public TemplateRegistry() {
        templates.put("report", new ReportTemplate());
        templates.put("invoice", new InvoiceTemplate());
        templates.put("contract", new ContractTemplate());
    }

    public DocumentTemplate createFromTemplate(String key) {
        DocumentTemplate template = templates.get(key.toLowerCase());
        if (template == null) throw new IllegalArgumentException("No template: " + key);
        return template.cloneDoc(); 
    }
}