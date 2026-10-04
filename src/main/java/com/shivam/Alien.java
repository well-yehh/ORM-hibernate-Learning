package com.shivam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int id;
    private String name;
    private int point;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alien{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", point=").append(point);
        sb.append('}');
        return sb.toString();
    }
}
