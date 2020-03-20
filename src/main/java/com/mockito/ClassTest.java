package com.mockito;

public class ClassTest {
    public final Database database;

    public ClassTest(Database database) {
        this.database=database;
    }

    public boolean query(String query) {
        return this.database.query(query);
    }
}
