package com.gaocai.test;

import com.gaocai.dao.StudentDao;
import com.gaocai.domain.Student;
import com.gaocai.util.SqlSessionUtil;
import com.gaocai.vo.StudentAndClassroomVo;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
//        使用简单数据类型String
//        Student student = studentDao.select1("A0001");
//        System.out.println(student);

//        使用简单数据类型String ,单个参数相当于形参，StudentDao.xml文件中的参数变量名可随意写
//        List<Student> sList = studentDao.select2(23);
//        for(Student s:sList){
//            System.out.println(s);
//        }

//        绝对不可以给sql语句传多个参数，我们可以将多个参数封装到一个domain对象中，或者打包到一个map集合中
//        List<Student> sList = studentDao.select3("wyf",23);
//        for(Student s:sList) System.out.println(s);

//        使用domain为参数
//        Student student = new Student();
//        student.setName(" wyf");
//        student.setAge(23);
//        List<Student> sList = studentDao.select4(student);
//        for(Student s:sList) {
//            System.out.println(s);
//        }

//        使用map为参数
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("name"," wyf");
//        map.put("age",23);
//        List<Student> sList = studentDao.select5(map);
//        for(Student s:sList){
//            System.out.println(s);
//        }
//        在实际开发 中使用domain引用类型，或者是使用map集合类型都可以为sql语句同时传递多个参数，一般来说，我们使用domain就可以了。
//        当domain不符合需求的情况下，我们一定要考虑使用map来传值

        //根据id查单条，sql使用${}来接收值。
        /*Student s = studentDao.select6("A0001");
        System.out.println(s);*/

        //like 模糊查询 方式一 使用${}
        /*List<Student> sList = studentDao.select7("z");
        for(Student s1:sList){
            System.out.println(s1);
        }*/

        //like 模糊查询 方式二 使用#{}
        /*List<Student> sList = studentDao.select8("%z%");
        for(Student s1:sList){
            System.out.println(s1);
        }*/

//        like模糊查询，使用#{} 必须掌握
        /*List<Student> sList = studentDao.select9("z");
        for(Student s1:sList){
            System.out.println(s1);
        }*/

//        resultType 返回值String类型
        /*String name = studentDao.select10("A0001");
        System.out.println(name);*/

//        查询所的学生的姓名
        /*List<String> sList = studentDao.select11();
        for(String s:sList) System.out.println(s);*/

//        查询中表中一共有多少条信息
        /*int count = studentDao.select12();
        System.out.println( count);*/

//        resultType 返回map
        /*List<Map<String,Object>> mapList = studentDao.select13();
        for(Map<String,Object> map:mapList){
            Set<String> set = map.keySet();
            for(String key:set){
                System.out.print(key);
                System.out.println(" -> "+map.get(key));
            }
        }*/

//        List<Student> sList = studentDao.select14(); //起别名
//        for(Student s:sList) System.out.println(s);

        /*List<Student> sList = studentDao.select16();
        for(Student s:sList) System.out.println(s);*/

        Student s = new Student();
        s.setName("y");
        s.setAddress("a");

        List<Student> sList = studentDao.select17(s);
        for(Student student:sList) {
            System.out.println(student);
        }

//        测试：动态sql foreach标签
        /*String strArr[] = {"A0001","A0002","A0003"};
        List<Student> sList = studentDao.select18(strArr);
        for(Student student:sList) {
            System.out.println(student);
        }*/

//        测试sql片段
        /*Student s = studentDao.select19("A0001");
        System.out.println(s);*/

//        测试多表联查
        /*List<Map<String,Object>> mapList =  studentDao.select20();
        for(Map<String,Object> map:mapList){
            Set<String> set = map.keySet();
            for(String key:set){
                System.out.println(key +" ----> "+map.get(key));
            }
            System.out.println("===============");
        }*/

        /*List<StudentAndClassroomVo> voList = studentDao.select21();
        for(StudentAndClassroomVo vo:voList){
            System.out.println(vo);
        }*/

//        List<StudentAndClassroomVo> voList = studentDao.select22('z');
//        for(StudentAndClassroomVo vo:voList){
//            System.out.println(vo);
//        }

    }
}
