package com.example.dei_examen_alumno.model;

import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public int id;

    @Basic
    @Column(name = "nombre")
    public String name;

    @Basic
    @Column(name = "apellido")
    public String lastName;

    @Basic
    @Column
    public Double AD;

    @Basic
    @Column
    public Double SGE;


    @Basic
    @Column
    public Double DI;


    @Basic
    @Column
    public Double PMDM;


    @Basic
    @Column
    public Double PSP;


    @Basic
    @Column
    public Double EIE;


    @Basic
    @Column
    public Double HLC;

    public Alumno() {

    }

    public Alumno(String name, String lastName, Double AD, Double SGE, Double DI, Double PMDM, Double PSP, Double EIE, Double HLC) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.AD = AD;
        this.SGE = SGE;
        this.DI = DI;
        this.PMDM = PMDM;
        this.PSP = PSP;
        this.EIE = EIE;
        this.HLC = HLC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAD() {
        return AD;
    }

    public void setAD(Double AD) {
        this.AD = AD;
    }

    public Double getSGE() {
        return SGE;
    }

    public void setSGE(Double SGE) {
        this.SGE = SGE;
    }

    public Double getDI() {
        return DI;
    }

    public void setDI(Double DI) {
        this.DI = DI;
    }

    public Double getPMDM() {
        return PMDM;
    }

    public void setPMDM(Double PMDM) {
        this.PMDM = PMDM;
    }

    public Double getPSP() {
        return PSP;
    }

    public void setPSP(Double PSP) {
        this.PSP = PSP;
    }

    public Double getEIE() {
        return EIE;
    }

    public void setEIE(Double EIE) {
        this.EIE = EIE;
    }

    public Double getHLC() {
        return HLC;
    }

    public void setHLC(Double HLC) {
        this.HLC = HLC;
    }
}