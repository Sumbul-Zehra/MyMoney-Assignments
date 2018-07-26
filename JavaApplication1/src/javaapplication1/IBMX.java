/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ubl-ho
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "IBMX")
public class IBMX {
    FDTRsp fdtRsp;
    
    public FDTRsp getFDTRsp() {
		return fdtRsp;
	}

    
    @XmlElement
    public void setFDTRsp(FDTRsp fdtrsp) {
		this.fdtRsp = fdtrsp;
	}
                                        
                                        
   
}
