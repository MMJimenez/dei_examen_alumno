package com.example.dei_examen_alumno.model;

import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "nombre")
    private String name;

    @Basic
    @Column(name = "apellido")
    private String lastName;

    @Basic
    @Column
    private Double AD;

    @Basic
    @Column
    private Double SGE;

    @Basic
    @Column
    private Double DI;

    @Basic
    @Column
    private Double PMDM;

    @Basic
    @Column
    private Double PSP;

    @Basic
    @Column
    private Double EIE;

    @Basic
    @Column
    private Double HLC;

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