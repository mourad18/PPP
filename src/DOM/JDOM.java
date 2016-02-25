package DOM;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Comparator;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import org.jdom2.*;
import org.jdom2.output.*;


public class JDOM
{
   static Element racine = new Element("impact");
   static Document document = new Document(racine);
   
   static void affiche() {
   try {
      XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
      sortie.output(document, System.out);
   }
   catch (java.io.IOException e){}
   }
   public void sortChildren(java.util.Comparator<? super Element> comparator){
   
   
   
   }
   
   
public static void main(String[] args)
{
      Element Health_Harm = new Element("Health_Harm");
      racine.addContent(Health_Harm);
      Attribute importance = new Attribute("importance","3");
      Health_Harm.setAttribute(importance);
      Attribute valeur = new Attribute("valeur","2");
      Health_Harm.setAttribute(valeur);
      Element Business = new Element("Business");
      racine.addContent(Business);
      Business.setAttribute(new Attribute("importance","2"));
      Business.setAttribute(new Attribute("valeur","2.5"));
      Element Technical = new Element("Technical");
      racine.addContent(Technical);
      Technical.setAttribute(new Attribute("importance","1"));
      Technical.setAttribute(new Attribute("valeur","1.2"));
      
      Element Irreversible = new Element("Irreversible");
      Health_Harm.addContent(Irreversible);
      Irreversible.setAttribute(new Attribute("importance","2"));
      Irreversible.setAttribute(new Attribute("valeur","3"));
      Element Reversible = new Element("Reversible");
      Health_Harm.addContent(Reversible);
      Reversible.setAttribute(new Attribute("importance","1"));
      Reversible.setAttribute(new Attribute("valeur","0"));
      
     
      Element Reputation = new Element("Reputation");
      Business.addContent(Reputation);
      Reputation.setAttribute(new Attribute("importance","2"));
      Reputation.setAttribute(new Attribute("valeur","3"));
       Element Financial = new Element("Financial");
      Business.addContent(Financial);
      Financial.setAttribute(new Attribute("importance","3"));
      Financial.setAttribute(new Attribute("valeur","3"));
      Element Privacy = new Element("Privacy");
      Business.addContent(Privacy);
      Privacy.setAttribute(new Attribute("importance","1"));
      Privacy.setAttribute(new Attribute("valeur","0"));
      
      Element Availability = new Element("Availability");
      Technical.addContent(Availability);
      Availability.setAttribute(new Attribute("importance","4"));
      Availability.setAttribute(new Attribute("valeur","3"));
      Element Integrity = new Element("Integrity");
      Technical.addContent(Integrity);
      Integrity.setAttribute(new Attribute("importance","3"));
      Integrity.setAttribute(new Attribute("valeur","0"));
      Element Confidentiality = new Element("Confidentiality");
      Technical.addContent(Confidentiality);
      Confidentiality.setAttribute(new Attribute("importance","2"));
      Confidentiality.setAttribute(new Attribute("valeur","0"));
      Element Accountability = new Element("Accountability");
      Technical.addContent(Accountability);
      Accountability.setAttribute(new Attribute("importance","1"));
      Accountability.setAttribute(new Attribute("valeur","0"));
      
      
      affiche();
      Business.getChildren();
      List list=Business.getChildren();
      
     List listCopy = new ArrayList(list);
     System.out.println(listCopy);
     Collections.sort(listCopy);
     System.out.println(listCopy);
     
     
  for (int i=0;i<3;i++){
      
  }
      
   

}
}