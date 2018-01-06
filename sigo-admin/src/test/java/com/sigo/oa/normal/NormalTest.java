package com.sigo.oa.normal;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * Create by intelliJ idea
 * User : guochang
 * Date : 2018/1/5
 * Time : 14:10
 */
public class NormalTest {

    class Foo{
        public Foo(String name, Date date, Integer age) {
            this.name = name;
            this.date = date;
            this.age = age;
        }

        private String name;
        private Date date;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    class Aoo{

        private Integer age;
        private Date date;
        private Integer sex;

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Integer getSex() {
            return sex;
        }

        public void setSex(Integer sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Aoo{" +
                    "age='" + age + '\'' +
                    ", date=" + date +
                    ", sex=" + sex +
                    '}';
        }
    }

    @Test
    public void test(){
        Foo foo = new Foo("guochang",new Date(),123);
        Aoo aoo = new Aoo();
        BeanUtils.copyProperties(foo,aoo);
        System.out.println(aoo);
    }
}
