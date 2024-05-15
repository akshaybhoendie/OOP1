package com.unasat.jdbc;

import com.unasat.jdbc.entity.Werknemer;
import com.unasat.jdbc.repository.WerknemerRepository;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Werknemer cedric = new Werknemer("cedric", "Dorder", "12-12-1998");

        WerknemerRepository werknemerRepository = new WerknemerRepository();
        werknemerRepository.insertWerknemer(cedric);
    }
}
