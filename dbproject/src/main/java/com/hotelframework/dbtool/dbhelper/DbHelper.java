package com.hotelframework.dbtool.dbhelper;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbHelper {
	public SqlSessionFactory getFactory(String configUrl) throws IOException {
		Reader reader = Resources.getResourceAsReader(configUrl);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		return factory;
	}
}
