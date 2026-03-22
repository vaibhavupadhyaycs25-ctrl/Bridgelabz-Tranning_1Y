package DefaultsMethods;
interface Exporter {
    void export();

    default void exportToJSON() {
        System.out.println("Exporting to JSON...");
    }
}

class CSVExporter implements Exporter {
    public void export() {
        System.out.println("Export CSV");
    }
}