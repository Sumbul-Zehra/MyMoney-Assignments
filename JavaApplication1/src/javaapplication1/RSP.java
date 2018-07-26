/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ubl-ho
 */

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RSP {
    	String STAN;
	double BatchReferenceNo;
        FDTList List;
	

	public String getSTAN() {
		return STAN;
	}

	@XmlElement(name = "STAN")
	public void setSTAN(String stan) {
		this.STAN = stan;
	}

	public double getBatchReferenceNo() {
		return BatchReferenceNo;
	}

	@XmlElement(name = "BatchReferenceNo")
	public void setBatchReferenceNo(double bref) {
		this.BatchReferenceNo = bref;
	}
         
        
         public FDTList getFDTList() {
		return List;
            }

    
         @XmlElement
          public void setFDTList(FDTList lst) {
                        this.List = lst;
                }
	
        
        
	
        
        
        

}
