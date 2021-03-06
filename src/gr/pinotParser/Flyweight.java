package gr.pinotParser;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angor
 */
public class Flyweight extends Pattern {

    private String flyweightFactory;
    private String flyweight;
    private String concreteFlyweight;
    private static int validPatternCounter = 0;
    private static int inValidPatternCounter = 0;

    public Flyweight() {
        super("Flyweight");
    }

    @Override
    public void resetPatternCounters() {
        validPatternCounter = 0;
        inValidPatternCounter = 0;
    }

    @Override
    public void addPatternBlock(ArrayList<String> block, long projectID) {
        for (int i = 0; i < block.size(); i++) {
            if (block.get(i).contains("is a flyweight factory")) {
                try {
                    this.flyweightFactory = this.getValidClassFullName(
                            this.getClassName(block.get(i)), projectID);
                } catch (SQLException ex) {
                    Logger.getLogger(Flyweight.class.getName()).log(Level.SEVERE,
                            null, ex);
                }
            } else if (block.get(i).contains("is a flyweight object")) {
                try {
                    this.concreteFlyweight = this.getValidClassFullName(
                            this.getClassName(block.get(i)), projectID);
                } catch (SQLException ex) {
                    Logger.getLogger(Flyweight.class.getName()).log(Level.SEVERE,
                            null, ex);
                }
                try {
                    this.flyweight = this.getValidSuperClassFullName(
                            concreteFlyweight, projectID);
                } catch (SQLException ex) {
                    Logger.getLogger(Flyweight.class.getName()).log(Level.SEVERE,
                            null, ex);
                }
            }
        }

        // Checking pattern validity..
        if (this.flyweightFactory == null
                || this.flyweight == null
                || this.concreteFlyweight == null) {
            this.setValidity(false);
            inValidPatternCounter++;
        } else {
            validPatternCounter++;
        }
    }

    @Override
    public void writePatternToXml(Writer writer) throws IOException {
        writer.write("\t\t<instance>\n");
        writer.write("\t\t\t" + this.getParticipantWithXmlFormat("Factory",
                this.flyweightFactory));
        writer.write("\t\t\t" + this.getParticipantWithXmlFormat("Flyweight",
                this.flyweight));
        writer.write("\t\t\t" + this.getParticipantWithXmlFormat("Subclass",
                this.concreteFlyweight));
        writer.write("\t\t</instance>\n");
    }

    @Override
    public void writePatternToCsv(Writer writer, String projectName) throws IOException {
        writer.write(projectName + ";" + this.getPatternName());
        writer.write(";" + "Factory" + ";" + this.flyweightFactory);
        writer.write(";" + "Flyweight" + ";" + this.flyweight);
        writer.write(";" + "Subclass" + ";" + this.concreteFlyweight);
        writer.write("\n");
    }

    @Override
    public void printPatternStatistics() {
        System.out.printf("%-30s %-10s %-10s %-10s\n",
                this.getPatternName(), validPatternCounter, inValidPatternCounter,
                (validPatternCounter + inValidPatternCounter));
    }

    @Override
    public void writePatternStatistics(PrintWriter out) {
        out.printf("%-30s %-10s %-10s %-10s\n",
                this.getPatternName(), validPatternCounter, inValidPatternCounter,
                (validPatternCounter + inValidPatternCounter));
    }
}
