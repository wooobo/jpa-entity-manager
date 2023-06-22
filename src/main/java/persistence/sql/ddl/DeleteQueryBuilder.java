package persistence.sql.ddl;

public abstract class DeleteQueryBuilder {
    String delete(String tableName, String columnName, String columnValue) {
        return String.format("delete from %s where %s = %s", tableName, columnName, columnValue);
    }
}
