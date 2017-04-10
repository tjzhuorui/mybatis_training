package com.robin.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.robin.mapper.StudentMapper;
import com.robin.pojo.Student;
import com.robin.sqlsession.SqlSessionFactoryUtil;

public class TestStudentMapper {
	public static void main(String[] args) {
		SqlSession session = null;
		try {
			session = SqlSessionFactoryUtil.getSqlSession();
			StudentMapper mp = session.getMapper(StudentMapper.class);
			testGetAllStudentsByList(session, mp);
			// testGetAllStudentsByMapStudent(session, mp);
			testGetAllStudentsByArr(session, mp);
			testGetAllStudentsByMapList(session, mp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

	}

	/**
	 * 查询所有学生，返回list
	 * 
	 * @return
	 */
	static void testGetAllStudentsByList(SqlSession session, StudentMapper mp) {
		System.out.println("====测试getAllStudentsByList====");
		List<Student> list = mp.getAllStudentsByList();
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.toString());
		}
		System.out.println();
	}

	/**
	 * 查询所有学生，返回Map，map中的value为Student
	 * 
	 * @return
	 */
	static void testGetAllStudentsByMapStudent(SqlSession session,
			StudentMapper mp) {
		System.out.println("====测试getAllStudentsByMapStudent====");
		System.out.println("遗憾的是，这种配置方式我并没有找到合适的办法");
	}

	/**
	 * 查询所有学生，返回数组
	 * 
	 * @return
	 */
	static void testGetAllStudentsByArr(SqlSession session, StudentMapper mp) {
		System.out.println("====测试getAllStudentsByArr====");
		Student[] arr = mp.getAllStudentsByArr();
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s.toString());
		}
		System.out.println();
	}

	/**
	 * 查询所有学生，返回Map，String为表中的column，Value为值
	 * 
	 * @return
	 */
	static void testGetAllStudentsByMapList(SqlSession session, StudentMapper mp) {
		System.out.println("====测试getAllStudentsByMapList====");
		List<Map<String, String>> list = mp.getAllStudentsByMapList();
		for (int i = 0; i < list.size(); i++) {
			Map<String, String> map = list.get(i);
			for (Map.Entry<String, String> s : map.entrySet()) {
				System.out.print(s.toString());
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
