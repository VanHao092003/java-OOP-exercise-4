import java.util.ArrayList;
import java.util.List;

public class Area {
    private List<Family> families;

    public Area(){
        families = new ArrayList<Family>();
    }
    public List<Family> getFamily() {
        return families;
    }
    public void setFamily(List<Family> family) {
        this.families = family;
    }
    
    public void addFamily(Family family) {
        this.families.add(family);
    }
}
