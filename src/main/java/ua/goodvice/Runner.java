package ua.goodvice;

public class Runner {
    public static void main(String[] args) {
        DatabaseAbstractFactory databaseFactory = new DatabaseAbstractFactory(Database.getDatabaseInstance());
        Schema schema = (Schema) databaseFactory.createDatabaseObject(Type.SCHEMA, "Zoo");
        schema.addTable((Table) databaseFactory.createDatabaseObject(Type.TABLE, "Ground",
                new String[]{"Name", "Age", "Weight"}));
        schema.addTable((Table) databaseFactory.createDatabaseObject(Type.TABLE, "Flying",
                new String[]{"Name", "Age", "Wingspan"}));
        System.out.println(Database.getDatabaseInstance());
        System.out.println(schema);
        for (Table table : schema.getTableList()) {
            System.out.println(table);
        }
    }
}
