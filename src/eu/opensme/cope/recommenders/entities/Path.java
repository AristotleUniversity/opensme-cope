package eu.opensme.cope.recommenders.entities;
// Generated 11 ��� 2011 11:25:48 �� by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Paths generated by hbm2java
 */
@Entity
@Table(name = "paths", catalog = "dependencies")
public class Path implements java.io.Serializable {

    private Long pathid;
    private Logentry logentry;
    private ClassAnalysis classAnalysis;
    private String kind;
    private String action;
    private String path;
    private Boolean isPathAmonitoredClass;

    public Path() {
    }

    public Path(Logentry logentry, ClassAnalysis classAnalysis, String kind, String action,
            String path, Boolean isPathAmonitoredClass) {
        this.logentry = logentry;
        this.classAnalysis = classAnalysis;
        this.kind = kind;
        this.action = action;
        this.path = path;
        this.isPathAmonitoredClass = isPathAmonitoredClass;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "pathid", unique = true, nullable = false)
    public Long getPathid() {
        return this.pathid;
    }

    public void setPathid(Long pathid) {
        this.pathid = pathid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "logentryid")
    public Logentry getLogentry() {
        return this.logentry;
    }

    public void setLogentry(Logentry logentry) {
        this.logentry = logentry;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classid")
    public ClassAnalysis getClassAnalysis() {
        return this.classAnalysis;
    }

    public void setClassAnalysis(ClassAnalysis classAnalysis) {
        this.classAnalysis = classAnalysis;
    }

    @Column(name = "kind", length = 100)
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Column(name = "\"action\"", length = 5)
    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Column(name = "\"path\"", length = 500)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(name = "isPathAMonitoredClass")
    public Boolean getIsPathAmonitoredClass() {
        return this.isPathAmonitoredClass;
    }

    public void setIsPathAmonitoredClass(Boolean isPathAmonitoredClass) {
        this.isPathAmonitoredClass = isPathAmonitoredClass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        Long id = this.getPathid();
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Path)) {
            return false;
        }
        Path other = (Path) object;
        Long id = this.getPathid();
        Long otherId = other.getPathid();
        if ((id == null && otherId != null) || (id != null && !id.equals(otherId))) {
            return false;
        }
        return true;
    }
}
