package bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author xiaoyuan.zhang
 * @date 2021/7/10 - 17:05
 */

public class Student {
    private String name;
    private Teacher teacher;
    private Map<String,String> map;
    private List<String> list;
    private Set<String> set;
    private String[] books;

    public Student(String name, Teacher teacher, Map<String, String> map, List<String> list, Set<String> set, String[] books) {
        this.name = name;
        this.teacher = teacher;
        this.map = map;
        this.list = list;
        this.set = set;
        this.books = books;
    }

    public Student() {
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getBooks() {
        for (String book : books) {
            System.out.println(book);
        }
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }
}
