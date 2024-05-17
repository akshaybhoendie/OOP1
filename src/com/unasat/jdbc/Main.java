package com.unasat.jdbc;

import com.unasat.jdbc.entity.Werknemer;
import com.unasat.jdbc.repository.WerknemerRepository;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Werknemer danietscha = new Werknemer("danietscha", "van der broek", "12-12-1998");

        WerknemerRepository werknemerRepository = new WerknemerRepository();
        werknemerRepository.insertWerknemer(danietscha);
    }
}
