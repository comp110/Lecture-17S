package comp110.lecture27;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sample {

  // Fields
  private String _name;
  private List<String> _alleles;

  // Constructor
  public Sample(String name) {
    _name = name;
    _alleles = new ArrayList<String>();
  }

  // Methods
  public String toString() {
    return _name;
  }

  public List<String> getAlleles() {
    return _alleles;
  }

  public void addAllele(String allele) {
    _alleles.add(allele);
  }

  public Map<String, Integer> countAlleles() {
    Map<String, Integer> alleles = new HashMap<String, Integer>();
    //TODO: implement logic
    return alleles;
  }

  public Set<String> filterAlleles(int threshold) {
    Map<String, Integer> counts = this.countAlleles();
    Set<String> frequent = new HashSet<String>();
    //TODO: implement logic
    return frequent;
  }

}