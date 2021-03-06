package eu.opensme.cope.recommenders.entities;
// Generated 11 ��� 2011 11:25:48 �� by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Logs generated by hbm2java
 */
@Entity
@Table(name = "frequencies", catalog = "dependencies")
public class Frequencies implements java.io.Serializable, Comparable<Frequencies> {

    private Long id;
    private Long dependend;
    private Long dependee;
    private int frequency;
    private Long projectId;
    private Long dependendPackageId;
    private Long dependeePackageId;
    private Long dependendLayer;
    private Long dependeeLayer;

    public Frequencies() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long logid) {
        this.id = logid;
    }

    @Column(name = "dependee")
    public Long getDependee() {
        return dependee;
    }

    public void setDependee(Long dependee) {
        this.dependee = dependee;
    }

    @Column(name = "dependend")
    public Long getDependend() {
        return dependend;
    }

    public void setDependend(Long dependend) {
        this.dependend = dependend;
    }

    @Column(name = "frequency")
    public int getFrequencies() {
        return frequency;
    }

    public void setFrequencies(int frequencies) {
        this.frequency = frequencies;
    }

    @Column(name = "dependeeLayer")
    public Long getDependeeLayer() {
        return dependeeLayer;
    }

    public void setDependeeLayer(Long dependeeLayer) {
        this.dependeeLayer = dependeeLayer;
    }

    @Column(name = "dependeePackageId")
    public Long getDependeePackageId() {
        return dependeePackageId;
    }

    public void setDependeePackageId(Long dependeePackageId) {
        this.dependeePackageId = dependeePackageId;
    }

    @Column(name = "dependendLayer")
    public Long getDependendLayer() {
        return dependendLayer;
    }

    public void setDependendLayer(Long dependendLayer) {
        this.dependendLayer = dependendLayer;
    }

    @Column(name = "dependendPackageId")
    public Long getDependendPackageId() {
        return dependendPackageId;
    }

    public void setDependendPackageId(Long dependendPackageId) {
        this.dependendPackageId = dependendPackageId;
    }

    @Column(name = "projectId")
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public int compareTo(Frequencies t) {
         return this.frequency - t.frequency;
    }
}
