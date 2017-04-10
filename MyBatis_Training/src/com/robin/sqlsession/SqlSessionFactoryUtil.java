package com.robin.sqlsession;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class SqlSessionFactoryUtil {
	public static Logger logger = Logger.getLogger(SqlSessionFactoryUtil.class);

	private static SqlSessionFactory factory;

	public static Class<SqlSessionFactoryUtil> LOCK = SqlSessionFactoryUtil.class;

	public static SqlSession getSqlSession() {
		return getFactory().openSession();
	}

	private static SqlSessionFactory getFactory() {
		if (factory != null)
			return factory;

		synchronized (LOCK) {
			if (factory == null) {
				InputStream inputStream = null;
				try {
					inputStream = Resources
							.getResourceAsStream("mybatis-config.xml");
					factory = new SqlSessionFactoryBuilder().build(inputStream);
				} catch (IOException e) {
					logger.error(e.getMessage(), e);
				} finally {
					if (inputStream != null)
						try {
							inputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
				}
			}
		}
		return factory;
	}

	public static void main(String[] args) throws IOException {
		SqlSessionFactoryUtil.getSqlSession();
	}
}
