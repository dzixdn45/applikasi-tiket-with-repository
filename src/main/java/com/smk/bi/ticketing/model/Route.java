package com.smk.bi.ticketing.model;// Nama : Didin nur yahya

import javax.persistence.*;

// kelas : 16102087
@Entity
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routeId;
    private String routeName;
    private String valid;

    private Long getRouteId(){
        return routeId;
    }
    public void setRouteId(Long routeId){
        this.routeId = routeId;
    }
    private String getRouteName(){
        return routeName;
    }
    public void setRouteName(String routeId){
        this.routeName = routeName;
    }
    private String getValid(){
        return valid;
    }
    public void setValid(String valid){
        this.valid= valid;
    }

}
