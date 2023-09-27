package ua.goodvice.database.objects;

import ua.goodvice.factory.objects.TableFactory;

import java.util.ArrayList;
import java.util.List;

public class Schema extends DatabaseObject {
    private final List<Table> tableList;
    private final TableFactory tableFactory;

    private Schema(String name) {
        this.tableFactory = new TableFactory();
        tableList = new ArrayList<>();
        this.name = name;
    }

    private void addTable(Table table) {
        tableList.add(table);
    }

    public void createTable(String name, String[] columnList) {
        addTable(tableFactory.createTable(name, columnList));
    }

    private List<Table> getTableList() {
        return tableList;
    }

    @Override
    public String toString() {
        StringBuilder schemaInfo = new StringBuilder();
        schemaInfo.append("Tables included in the schema '").append(this.name).append("':\n");
        for (Table table : tableList) {
            schemaInfo.append(table.getName()).append("\n");
        }
        schemaInfo.append("\n");
        for (Table table : getTableList()) {
            schemaInfo.append(table).append("\n");
        }
        return schemaInfo.toString();
    }

    public static SchemaBuilder builder() {
        return new SchemaBuilder();
    }

    public static class SchemaBuilder {

        private String name;

        private SchemaBuilder() {
        }

        public SchemaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Schema build() {
            return new Schema(this.name);
        }
    }

}
