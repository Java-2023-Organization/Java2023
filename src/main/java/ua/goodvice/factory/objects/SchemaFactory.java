package ua.goodvice.factory.objects;

import ua.goodvice.database.objects.Schema;

public class SchemaFactory {
    public Schema createSchema(String name) {
        return Schema.builder()
                .name(name)
                .build();
    }
}
