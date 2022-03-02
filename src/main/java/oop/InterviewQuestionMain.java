package oop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InterviewQuestionMain {

    public static void main(String[] args) throws SQLException {
        getListOfPersonNamesAgeBiggerThan(30);
    }

    public static List<Integer> getListOfPersonNamesAgeBiggerThan(int age) throws SQLException {
        List<Integer> names = new ArrayList<>();

        String connectionUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        try (Connection c = DriverManager.getConnection(connectionUrl, "username", "password");
             PreparedStatement statement = c.prepareStatement("SELECT NAME FROM PERSON WHERE AGE > ?")) {

            statement.setInt(1, age);
            ResultSet rs = statement.executeQuery();
            while (rs.next())
                names.add(Integer.valueOf(rs.getObject("NAME").toString()));

            int max = 0;
            int min = 9999999;
            for (int i = 0; i < Objects.requireNonNull(names).size(); i++) {
                if (i > max) max = i;
                if (i < min) min = i;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }
}
