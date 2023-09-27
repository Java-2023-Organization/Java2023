package ua.goodvice.factory.database;

import ua.goodvice.database.Database;
import ua.goodvice.database.objects.Schema;

public abstract class DatabaseAbstractFactory {
    protected static String DATABASE;
    protected final Database databaseInstance;

    public DatabaseAbstractFactory(Database databaseInstance) {
        this.databaseInstance = databaseInstance;
    }

    protected String getDatabaseType() {
        return DATABASE;
    }

    public void createSchema(String name) {
        Schema schema = Schema.builder()
                .name(name)
                .build();
        databaseInstance.addSchema(schema);

    }

}
