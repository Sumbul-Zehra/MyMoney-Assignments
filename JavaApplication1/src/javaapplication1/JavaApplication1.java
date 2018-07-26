/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author ubl-ho
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        
         try {

		File file = new File("C:\\sample.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(IBMX.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		IBMX ib = (IBMX)jaxbUnmarshaller.unmarshal(file);
		System.out.println(ib);
                
                
                
        
                File file1 = new File("C:\\file.xml");
		JAXBContext jaxbContext1 = JAXBContext.newInstance(IBMX.class);
		Marshaller jaxbMarshaller = jaxbContext1.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

		jaxbMarshaller.marshal(ib, file1);
		jaxbMarshaller.marshal(ib, System.out);
                
                
                

	  } catch (JAXBException e) {
		e.printStackTrace();
               
                
	  }
         
         
        
         
         
        
    }
}
