package br.com.saltengine.dto;

import br.com.saltengine.model.entity.SampleEntity;

/**
 * Class auto-generated by archetype-spring project
 * Repository: http://californio.keynet.com.br:8089/java/archetype/archetype-spring
 */
public class InputDTO {

    public static SampleEntity toSampleEntity(InputDTO inputDTO) {
        return new SampleEntity(inputDTO.getName(), inputDTO.getAge());
    }

    private String name;
    private int age;

    public InputDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public InputDTO() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return "InputDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
