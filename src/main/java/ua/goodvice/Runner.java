package ua.goodvice;

import ua.goodvice.database.Database;
import ua.goodvice.database.objects.Schema;
import ua.goodvice.factory.database.DatabaseAbstractFactory;
import ua.goodvice.factory.database.OracleFactory;

public class Runner {
    public static void main(String[] args) {
        DatabaseAbstractFactory databaseFactory = new OracleFactory(Database.getDatabaseInstance());
        databaseFactory.createSchema("Zoo");
        Schema schema = Database.getDatabaseInstance().getSchemaByName("Zoo");
        schema.createTable("Ground", new String[]{"Name", "Age", "Weight"});
        schema.createTable("Flying", new String[]{"Name", "Age", "Wingspan"});
        System.out.println(Database.getDatabaseInstance());
        System.out.println(schema);
    }
}
