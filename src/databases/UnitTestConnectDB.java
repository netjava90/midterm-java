package databases;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

public class UnitTestConnectDB {
    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

        Assert.assertEquals("", "");


    }
}
