class ReportTemplate extends BaseDocument {
    public ReportTemplate() {
        type = "REPORT";
        header = "Company Report Header";
        footer = "Report Footer (Confidential)";
        title = "Default Report Title";
        body  = "Default Report Content...";
    }
}