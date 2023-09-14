package ua.goodvice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Database {
    private static Database databaseInstance;
    private final List<Schema> schemaList;

    private Database() {
        schemaList = new ArrayList<>();
    }

    public static Database getDatabaseInstance() {
        databaseInstance = Objects.isNull(databaseInstance) ? new Database() : databaseInstance;
        return databaseInstance;
    }

    public void addSchema(Schema schema) {
        this.schemaList.add(schema);
    }

    @Override
    public String toString() {
        StringBuilder databaseInfo = new StringBuilder("Schemas included in the database:\n");
        for (Schema schema : schemaList) {
            databaseInfo.append(schema.getName()).append("\n");
        }
        return databaseInfo.toString();
    }
}
