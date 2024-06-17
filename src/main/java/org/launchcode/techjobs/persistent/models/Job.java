package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToMany
    @JoinTable(
            name = "job_skill",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    // Initialize the id and value fields.
//    public Job(String anEmployer, String someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }

//    public Job(Employer employer, String skills) {
//        super();
//        this.employer = employer;
//        this.skills = skills;
//    }

    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.
    
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getEmployer() {
//        return employer;
//    }
//

    public Employer getEmployer() {
        return employer;
    }

//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }

    public void setEmployer(Employer employer){
        this.employer = employer;
    }

//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
