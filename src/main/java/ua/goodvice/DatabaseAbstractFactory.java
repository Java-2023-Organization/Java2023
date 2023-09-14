package ua.goodvice;

public class DatabaseAbstractFactory {
    Database databaseInstance;
    DatabaseObject databaseObject;

    public DatabaseAbstractFactory(Database databaseInstance) {
        this.databaseInstance = databaseInstance;
    }

    DatabaseObject createDatabaseObject(Object... args) {
        Type objectType = (Type) args[0];
        String name = (String) args[1];
        String[] columnList = args.length > 2 ? (String[]) args[2] : null;
        switch (objectType) {
            case TABLE -> {
                assert columnList != null;
                databaseObject = createTable(name, columnList);
            }
            case SCHEMA -> {
                databaseObject = createSchema(name);
                databaseInstance.addSchema((Schema) databaseObject);
            }
        }


        return databaseObject;
    }

    private Table createTable(String name, String[] columnList) {
        Table.TableBuilder tableBuilder = Table.builder().name(name);
        for (String column : columnList) {
            tableBuilder.column(column);
        }

        return tableBuilder.build();
    }

    private Schema createSchema(String name) {
        return new Schema(name);
    }

}
