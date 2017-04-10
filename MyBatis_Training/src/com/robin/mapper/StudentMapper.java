package com.robin.mapper;

import java.util.List;
import java.util.Map;

import com.robin.pojo.Student;

public interface StudentMapper {
	/**
	 * 查询所有学生，返回list
	 * 
	 * @return
	 */
	List<Student> getAllStudentsByList();

	/**
	 * 查询所有学生，返回Map，map中的value为Student <!-- 遗憾的是，这种配置方式我并没有找到合适的办法 -->
	 * 
	 * @return
	 */
	Map<Integer, Student> getAllStudentsByMapStudent();

	/**
	 * 查询所有学生，返回数组
	 * 
	 * @return
	 */
	Student[] getAllStudentsByArr();

	/**
	 * 查询所有学生，返回Map，String为表中的column，Value为值
	 * 
	 * @return
	 */
	List<Map<String, String>> getAllStudentsByMapList();

}
