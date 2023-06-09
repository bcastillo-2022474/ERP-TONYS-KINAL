package org.joaocastillo.com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IConnection<M> {
    public M resulsetToObject(ResultSet resultSet) throws SQLException;

    public void setProcedureParamsUpdate(PreparedStatement sp, M model) throws SQLException;
    public void setProcedureParamsCreate(PreparedStatement sp, M model) throws SQLException;

    public void setIdParam(PreparedStatement sp, String id) throws SQLException;
}
