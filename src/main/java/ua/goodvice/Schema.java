package ua.goodvice;

import java.util.ArrayList;
import java.util.List;

public class Schema extends DatabaseObject {
    private final List<Table> tableList;

    public Schema(String name) {
        tableList = new ArrayList<>();
        this.name = name;
    }

    public void addTable(Table table) {
        tableList.add(table);
    }

    public List<Table> getTableList() {
        return tableList;
    }

    @Override
    public String toString() {
        StringBuilder schemaInfo = new StringBuilder("Tables included in the schema '").append(this.name).append("':\n");
        for (Table table : tableList) {
            schemaInfo.append(table.getName()).append("\n");
        }
        return schemaInfo.toString();
    }

}
