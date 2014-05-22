package eu.opensme.cope.recommenders.entities;
// Generated 11 ��� 2011 11:25:48 �� by Hibernate Tools 3.2.1.GA

import eu.opensme.cope.domain.ReuseProject;
import eu.opensme.cope.recommenders.ProjectCKMetricsStats;
import eu.opensme.cope.util.HibernateUtil;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Classes generated by hbm2java
 */
@Entity
@Table(name = "classes", catalog = "dependencies")
public class ClassAnalysis implements java.io.Serializable {

    private Long classId;
    private PackageAnalysis packageAnalysis;
    private Project project;
    private String name;
    private String sources;
    private String type;
    private Boolean innerclass;
    private Long classSize;
    private Long usedby;
    private Long usesinternal;
    private Long usesexternal;
    private Long layer;
    private Integer WMC;
    private Integer DIT;
    private Integer NOC;
    private Integer CBO;
    private Integer RFC;
    private Integer LCOM;
    private Integer Ca;
    private Integer NPM;
    private Integer ClusterSize;
    private Set<ClassAnalysis> classesesForDependee = new HashSet(0);
    private Set<Path> paths = new HashSet(0);
    private Set<ClassAnalysis> classesesForDependency = new HashSet(0);
    private boolean marked;
    private int frequency;

    public ClassAnalysis() {
    }

    public ClassAnalysis(Project project) {
        this.project = project;
    }

    public ClassAnalysis(PackageAnalysis packageAnalysis, Project projects, String name, String sources,
            String type, Boolean innerclass, Long size, Long usedby, Long usesinternal, Long usesexternal,
            Long layer, Integer WMC, Integer DIT, Integer NOC, Integer CBO,
            Integer RFC, Integer LCOM, Integer Ca, Integer NPM, Integer ClusterSize, Set<ClassAnalysis> classesesForDependee, Set<Path> paths,
            Set<ClassAnalysis> classesesForDependency) {
        this.packageAnalysis = packageAnalysis;
        this.project = projects;
        this.name = name;
        this.sources = sources;
        this.type = type;
        this.innerclass = innerclass;
        this.classSize = size;
        this.usedby = usedby;
        this.usesinternal = usesinternal;
        this.usesexternal = usesexternal;
        this.layer = layer;
        this.WMC = WMC;
        this.DIT = DIT;
        this.NOC = NOC;
        this.CBO = CBO;
        this.RFC = RFC;
        this.LCOM = LCOM;
        this.Ca = Ca;
        this.NPM = NPM;
        this.ClusterSize = ClusterSize;
        this.classesesForDependee = classesesForDependee;
        this.paths = paths;
        this.classesesForDependency = classesesForDependency;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "classid", unique = true, nullable = false)
    public Long getClassid() {
        return this.classId;
    }

    public void setClassid(Long classid) {
        this.classId = classid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "packageid")
    public PackageAnalysis getPackageAnalysis() {
        return this.packageAnalysis;
    }

    public void setPackageAnalysis(PackageAnalysis packageAnalysis) {
        this.packageAnalysis = packageAnalysis;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projectid", nullable = false)
    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Column(name = "name", length = 200)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "sources", length = 100)
    public String getSources() {
        return this.sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    @Column(name = "type", length = 20)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "innerclass")
    public Boolean getInnerclass() {
        return this.innerclass;
    }

    public void setInnerclass(Boolean innerclass) {
        this.innerclass = innerclass;
    }

    @Column(name = "\"size\"")
    public Long getClassSize() {
        return this.classSize;
    }

    public void setClassSize(Long classSize) {
        this.classSize = classSize;
    }

    @Column(name = "usedby")
    public Long getUsedby() {
        return this.usedby;
    }

    public void setUsedby(Long usedby) {
        this.usedby = usedby;
    }

    @Column(name = "usesinternal")
    public Long getUsesinternal() {
        return this.usesinternal;
    }

    public void setUsesinternal(Long usesinternal) {
        this.usesinternal = usesinternal;
    }

    @Column(name = "usesexternal")
    public Long getUsesexternal() {
        return this.usesexternal;
    }

    public void setUsesexternal(Long usesexternal) {
        this.usesexternal = usesexternal;
    }

    @Column(name = "layer")
    public Long getLayer() {
        return this.layer;
    }

    public void setLayer(Long layer) {
        this.layer = layer;
    }

    @Column(name = "CBO")
    public Integer getCBO() {
        return CBO;
    }

    public void setCBO(Integer CBO) {
        this.CBO = CBO;
    }

    @Column(name = "Ca")
    public Integer getCa() {
        return Ca;
    }

    public void setCa(Integer Ca) {
        this.Ca = Ca;
    }

    @Column(name = "DIT")
    public Integer getDIT() {
        return DIT;
    }

    public void setDIT(Integer DIT) {
        this.DIT = DIT;
    }

    @Column(name = "LCOM")
    public Integer getLCOM() {
        return LCOM;
    }

    public void setLCOM(Integer LCOM) {
        this.LCOM = LCOM;
    }

    @Column(name = "NOC")
    public Integer getNOC() {
        return NOC;
    }

    public void setNOC(Integer NOC) {
        this.NOC = NOC;
    }

    @Column(name = "NPM")
    public Integer getNPM() {
        return NPM;
    }

    public void setNPM(Integer NPM) {
        this.NPM = NPM;
    }

    @Column(name = "RFC")
    public Integer getRFC() {
        return RFC;
    }

    public void setRFC(Integer RFC) {
        this.RFC = RFC;
    }

    @Column(name = "WMC")
    public Integer getWMC() {
        return WMC;
    }

    public void setWMC(Integer WMC) {
        this.WMC = WMC;
    }
    
    @Column(name = "ClusterSize")
    public Integer getClusterSize() {
        return ClusterSize;
    }

    public void setClusterSize(Integer ClusterSize) {
        this.ClusterSize = ClusterSize;
    }    

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "classinternaldependencies", catalog = "dependencies", joinColumns = {
        @JoinColumn(name = "dependency", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "dependee", nullable = false, updatable = false)})
    public Set<ClassAnalysis> getClassesesForDependee() {
        return this.classesesForDependee;
    }

    public void setClassesesForDependee(Set<ClassAnalysis> classesesForDependee) {
        this.classesesForDependee = classesesForDependee;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "classAnalysis")
    public Set<Path> getPaths() {
        return this.paths;
    }

    public void setPaths(Set<Path> paths) {
        this.paths = paths;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "classinternaldependencies", catalog = "dependencies", joinColumns = {
        @JoinColumn(name = "dependee", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "dependency", nullable = false, updatable = false)})
    public Set<ClassAnalysis> getClassesesForDependency() {
        return this.classesesForDependency;
    }

    public void setClassesesForDependency(Set<ClassAnalysis> classesesForDependency) {
        this.classesesForDependency = classesesForDependency;
    }
    
    @Transient
    public boolean getMarked() {
        return this.marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    @Transient
    public int getFrequency() {
        return this.frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Transient
    public Double getReusabilityAssessment() {
        Double assessment =
                ProjectCKMetricsStats.getReusabilityAssessmentForClass(this, project);
        return assessment;
    }

    /**
     * For a given class this method follows transitivelly all the classes that this
     * class uses and then the classes that the used classes use and so on. It
     * adds these classes in a HashSet.
     * @return
     */
    public Set<ClassAnalysis> depthFirstTraversal() {
        //Initialize the traversal by creating the set of visited classes
        //which is intially empty
        Set<ClassAnalysis> visited = new HashSet<ClassAnalysis>();

        //the call the recursive depth first traversal using the visited set
        //as a parameter
        Set<ClassAnalysis> dependencies = depthFirstTraversal(visited);
        System.out.println("There are " + dependencies.size() + " classes in this component");
        //after getting all the dependencies the return them
        return dependencies;
    }

    public String copySrcFileToComponentFile(ClassAnalysis ca, String srcDir, String componentPath)
            throws IOException, FileNotFoundException {
        String path = ClassAnalysis.classAnalysisToSrcPath(ca, srcDir);
        File f = new File(path);
        String className = "";
        
        if (ca.getName().contains("$")) {
            String parts[] = ca.getName().split("\\$");
            className = parts[0];
        } else {
            className = ca.getName();
        }
        
        File t = new File(componentPath + File.separator + "src" + File.separator + className.replace(".", File.separator) + ".java");
        int j = t.getAbsolutePath().lastIndexOf(File.separator);
        String destDirName = t.getAbsolutePath().substring(0, j);
        File destDir = new File(destDirName);
        destDir.mkdirs();
        //copy file to new location
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(f);
            to = new FileOutputStream(t);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = from.read(buffer)) != -1) {
                to.write(buffer, 0, bytesRead); // write
            }
        } finally {
            if (from != null) {
                try {
                    from.close();
                } catch (IOException e) {
                }
            }
            if (to != null) {
                try {
                    to.close();
                } catch (IOException e) {
                }
            }
        }
        return t.getAbsolutePath();
    }

    private Set<ClassAnalysis> depthFirstTraversal(Set<ClassAnalysis> visited) {
        if (visited.contains(this)) {
            return visited;
        }
        visited.add(this);

        //Set<ClassAnalysis> neighbors = this.getClassesesForDependency();
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Query q = session.createQuery(
                "select elements(ca.classesesForDependency) from ClassAnalysis ca where ca = :ca");
        q.setEntity("ca", this);
        List<ClassAnalysis> neighbors = q.list();
        session.close();
        for (ClassAnalysis c : neighbors) {
            visited = c.depthFirstTraversal(visited);
        }
        return visited;
    }

    public static ClassAnalysis srcPathToClassAnalysis(String srcPath, Project project) {
        //get the class name from the path
        //by converting the path separator to dots
        String className = srcPath;
         if(className.endsWith(".java"))
            className = className.substring(0, className.length() - 5); // remove the ".java" 
        className= className.replace(File.separatorChar, '.');
        //now look for the id of this class in the database
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from ClassAnalysis where name=:name and projectid=:projectid");
        query.setParameter("name", className);
        query.setParameter("projectid",project.getProjectid());
        ClassAnalysis ca = (ClassAnalysis) query.uniqueResult();
        session.close();
        return ca;
    }

    public static String classAnalysisToSrcPath(ClassAnalysis ca, String srcDir) {
        
       String className = "";
        
        if (ca.getName().contains("$")) {
            String parts[] = ca.getName().split("\\$");
            className = parts[0];
        } else {
            className = ca.getName();
        }

        String path = className.replace(".", File.separator);
        return srcDir + File.separator + path + ".java";
    }

    @Override
    public int hashCode() {
        int hash = 0;
        Long id = this.getClassid();
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) { // TODO: Warning - this method won't work in the case the id fields are not set

        if (!(object instanceof ClassAnalysis)) {
            return false;
        }
        ClassAnalysis other = (ClassAnalysis) object;
        Long id = this.getClassid();
        Long otherId = other.getClassid();
        if ((id == null && otherId != null) || (id != null && !id.equals(otherId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public Set<String> extractComponent(String srcDir, String componentPath) {
        HashSet<String> generatedFiles = new HashSet<String>();
        try {

            Set<ClassAnalysis> caDependencies = this.depthFirstTraversal();
            //for each of the dependencies extract the file to the component's folder
            for (ClassAnalysis caDep : caDependencies) {
                if (!caDep.getInnerclass() == true) {
                    generatedFiles.add(copySrcFileToComponentFile(caDep, srcDir, componentPath));
                }
            }
            copySrcFileToComponentFile(this, srcDir, componentPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return generatedFiles;
    }
    
    //TODO: To be documented!!! (needed for sorting reasons)
    public String toFileName()
    {
        String [] parts = name.split("\\.");
        return parts[parts.length-1];
    }

    public static void main(String[] args) throws IOException {
        //test the functionality of depth first traversal
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        /*
        System.out.println("Enter a class id (-1 to stop): ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        String sid = in.readLine();
        Long id = Long.parseLong(sid);
        while (id!=-1) {*/

        //select all classes in a given project
        Query query = session.createQuery("from ClassAnalysis where projectid=3");
        List<ClassAnalysis> list = query.list();






        for (ClassAnalysis ca : list) {

            Set<ClassAnalysis> caDependencies = ca.depthFirstTraversal();






            int size = caDependencies.size();






            if (size >= 20 && size <= 30) {
                System.out.println("Class " + ca.getName() + " has " + caDependencies.size()
                        + " dependencies and layer " + ca.getLayer());
                //create a csv of the classes that are required using the component name as a filename
                File f = new File("out/" + ca.getName() + ".csv");
                BufferedWriter writer = new BufferedWriter(new FileWriter(f));







                for (ClassAnalysis cd : caDependencies) {
                    writer.write(cd.getName() + ";");






                }
                writer.flush();
                writer.close();



            }

        }
    }
}
