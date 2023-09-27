package ua.goodvice.factory.objects;

import ua.goodvice.database.objects.Table;

public class TableFactory {
    public Table createTable(String name, String[] columnList) {
        Table.TableBuilder tableBuilder = Table.builder().name(name);
        for (String column : columnList) {
            tableBuilder.column(column);
        }

        return tableBuilder.build();
    }


}
