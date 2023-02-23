package com.example.myapplication.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.myapplication.Models.Company;

public class CompanyDAO {
    private static final String SELECT_ALL_COMPANIES_SQL = "SELECT name, longitude, latitude, year_established FROM companies";

    public List<Company> getAllCompanies(Connection connection) throws SQLException {
        List<Company> companies = new ArrayList<Company>();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL_COMPANIES_SQL)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double longitude = resultSet.getDouble("longitude");
                double latitude = resultSet.getDouble("latitude");
                double yearEstablished = resultSet.getDouble("year_established");

                Company company = new Company(name, longitude, latitude, yearEstablished);
                companies.add(company);
            }
        }

        return companies;
    }
}