/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOM;

import java.util.Comparator;
import org.jdom2.Element;

public class ContentTagComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
    String s1=((Element)o1).getText();
    String s2=((Element)o2).getText();
    int result = s1.compareTo(s2);      
    return result;
  
  
    }
    
}
