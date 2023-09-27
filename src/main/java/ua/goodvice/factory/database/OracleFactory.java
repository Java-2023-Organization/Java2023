package ua.goodvice.factory.database;

import ua.goodvice.database.Database;

public class OracleFactory extends DatabaseAbstractFactory {
    private static final String DATABASE = "Oracle";

    public OracleFactory(Database databaseInstance) {
        super(databaseInstance);
        databaseInstance.setName(DATABASE);
    }
}
