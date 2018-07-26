/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author ubl-ho
 */
public class FDTRsp {
    
    RSP Rsp;
    
    public RSP getRSP() {
		return Rsp;
	}

    
    @XmlElement
    public void setRSP(RSP rsp) {
		this.Rsp = rsp;
	}
    
}
