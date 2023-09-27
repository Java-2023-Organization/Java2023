package ua.goodvice.database;

import ua.goodvice.database.objects.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Database {
    private static Database databaseInstance;
    private String databaseName;
    private final List<Schema> schemaList;

    private Database() {
        schemaList = new ArrayList<>();
    }

    public static Database getDatabaseInstance() {
        databaseInstance = Objects.isNull(databaseInstance) ? new Database() : databaseInstance;
        return databaseInstance;
    }

    public void setName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void addSchema(Schema schema) {
        this.schemaList.add(schema);
    }


    @Override
    public String toString() {
        StringBuilder databaseInfo = new StringBuilder();
        databaseInfo.append("Database: ").append(databaseName).append("\nSchemas included in the database:\n");
        for (Schema schema : schemaList) {
            databaseInfo.append(schema.getName()).append("\n");
        }
        return databaseInfo.toString();
    }

    public Schema getSchemaByName(String name) {
        Optional<Schema> optionalSchema = schemaList.stream()
                .filter(schema -> schema.getName().equals(name))
                .findFirst();
        return optionalSchema.orElse(null);
    }
}
