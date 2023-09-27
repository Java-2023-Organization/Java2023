package ua.goodvice.factory.database;

import ua.goodvice.database.Database;

public class SQLiteFactory extends DatabaseAbstractFactory {
    private static final String DATABASE = "SQLite";

    public SQLiteFactory(Database databaseInstance) {
        super(databaseInstance);
        databaseInstance.setName(DATABASE);
    }
}
