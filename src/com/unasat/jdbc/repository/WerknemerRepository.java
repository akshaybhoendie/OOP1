package com.unasat.jdbc.repository;

import com.unasat.jdbc.connection.DBConfiguration;
import com.unasat.jdbc.entity.Werknemer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WerknemerRepository {
    private final Connection connection;
    public static final String generatedColumns[] = { "id" };
    private final String insertWerknemerQuery = "insert into werknemer (naam,voornaam,geboortedatum) values (?,?,?)";

    public WerknemerRepository() {
        this.connection = DBConfiguration.connectToDB();
    }

    public int insertWerknemer(Werknemer werknemer) throws SQLException {
        PreparedStatement insertWerknemerStatement = connection.prepareStatement(insertWerknemerQuery, generatedColumns);

        insertWerknemerStatement.setString(1, werknemer.getNaam());
        insertWerknemerStatement.setString(2, werknemer.getVoornaam());
        insertWerknemerStatement.setString(3, werknemer.getGeboorteDatum());

        int affectedRows = insertWerknemerStatement.executeUpdate();
        if (affectedRows == 0) {
            throw new SQLException("werknemer toevoegen gefaald");
        }

        ResultSet generatedKeys = insertWerknemerStatement.getGeneratedKeys();

        int werknemerId = 0;
        if (generatedKeys.next()) {
            werknemerId = generatedKeys.getInt(1);
            System.out.println("Inserted werknemer ID - " + werknemerId); // display id inserted record
        }

        insertWerknemerStatement.close();
        connection.close();

        return werknemerId;
    }
}
