package me.magi.demoniccore.model.entity;

import jakarta.persistence.*;
import me.magi.demoniccore.model.entity.enums.Behavior;
import me.magi.demoniccore.model.entity.enums.BloodType;

import java.util.UUID;

@Entity
@Table(name = "militarys")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;

    private String cellNumber;

    private Behavior behavior;

    private Boolean cfc;

    private String cpf;

    private String address;

    private String district;

    private BloodType bloodType;

    public static UserEntity newInstance(){
        return new UserEntity();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public Boolean getCfc() {
        return cfc;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void setCfc(Boolean cfc) {
        this.cfc = cfc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }
}