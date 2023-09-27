package ua.goodvice.database.objects;

import java.util.ArrayList;
import java.util.List;

public class Table extends DatabaseObject {
    private final List<String> columnList;

    private Table(String name, List<String> columnNames) {
        this.name = name;
        this.columnList = columnNames;
    }

    public static TableBuilder builder() {
        return new TableBuilder();
    }

    @Override
    public String toString() {
        StringBuilder tableInfo = new StringBuilder("Columns included in the table '").append(this.name).append("':\n");
        for (String column : columnList) {
            tableInfo.append(column).append("\n");
        }
        return tableInfo.toString();
    }

    public static class TableBuilder {
        private final List<String> columnList;
        private String name;

        private TableBuilder() {
            columnList = new ArrayList<>();
        }

        public TableBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TableBuilder column(String columnName) {
            this.columnList.add(columnName);
            return this;
        }

        public Table build() {
            return new Table(this.name, this.columnList);
        }
    }

}
