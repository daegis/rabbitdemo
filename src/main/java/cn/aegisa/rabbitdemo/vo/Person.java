package cn.aegisa.rabbitdemo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/12/20 13:05
 */
@Data
public class Person implements Serializable {
    private String name;
    private Integer age;
    private String time;
}
