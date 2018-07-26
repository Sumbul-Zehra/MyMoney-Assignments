/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author ubl-ho
 */
public class FDTList {
    //FDTStatus Status;
    private List<FDTStatus> Status = new ArrayList<FDTStatus>();
    
    public List<FDTStatus> getFDTStatus() {
		return Status;
	}

    
    @XmlElement
    public void setFDTStatus(List<FDTStatus> status) {
		this.Status = status;
	}
        
    
}
