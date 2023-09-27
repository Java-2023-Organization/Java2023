package ua.goodvice.factory.database;

import ua.goodvice.database.Database;

public class MySQLFactory extends DatabaseAbstractFactory {
    private static final String DATABASE = "MySQL";

    public MySQLFactory(Database databaseInstance) {
        super(databaseInstance);
        databaseInstance.setName(DATABASE);
    }
}
