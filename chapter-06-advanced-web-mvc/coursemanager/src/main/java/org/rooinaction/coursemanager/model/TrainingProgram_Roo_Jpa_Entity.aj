// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rooinaction.coursemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.rooinaction.coursemanager.model.TrainingProgram;

privileged aspect TrainingProgram_Roo_Jpa_Entity {
    
    declare @type: TrainingProgram: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long TrainingProgram.id;
    
    @Version
    @Column(name = "version")
    private Integer TrainingProgram.version;
    
    public Long TrainingProgram.getId() {
        return this.id;
    }
    
    public void TrainingProgram.setId(Long id) {
        this.id = id;
    }
    
    public Integer TrainingProgram.getVersion() {
        return this.version;
    }
    
    public void TrainingProgram.setVersion(Integer version) {
        this.version = version;
    }
    
}