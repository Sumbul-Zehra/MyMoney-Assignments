/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ubl-ho
 */

public class FDTStatus {
        String STAN;
	double TxnReference;
	String PostingDate;
        int HostStatusCode;
        String HostStatusDesc;
        String StatusCode;
        String StatusDesc;
      
        

	public String getSTAN() {
		return STAN;
	}

	@XmlElement(name = "STAN")
	public void setSTAN(String stan) {
		this.STAN = stan;
	}

	public double getTxnReference() {
		return TxnReference;
	}

        @XmlElement(name = "TxnReference")
	public void setTxnReference(double ref) {
		this.TxnReference = ref;
	}

	public String getPostingDate() {
		return PostingDate;
	}
        
        @XmlElement(name = "PostingDate")
	public void setPostingDate(String date) {
		this.PostingDate = date;
	}
        
        
        public int getHostStatusCode() {
		return HostStatusCode;
	}
        
        @XmlElement(name = "HostStatusCode")
	public void setHostStatusCode(int code) {
		this.HostStatusCode = code;
	}
        
        public String getHostStatusDesc() {
		return HostStatusDesc;
	}

        @XmlElement(name = "HostStatusDesc")
	public void setHostStatusDesc(String desc) {
		this.HostStatusDesc = desc;
	}

        
        public String getStatusCode() {
		return StatusCode;
	}

        @XmlElement(name = "StatusCode")
	public void setStatusCode(String statuscode) {
		this.StatusCode = statuscode;
	}
        
        
        public String getStatusDesc() {
		return StatusDesc;
	}

        @XmlElement (name = "StatusDesc")
	public void setStatusDesc(String desc) {
		this.StatusDesc = desc;
	}
        
        
	
                    
                
    
}
