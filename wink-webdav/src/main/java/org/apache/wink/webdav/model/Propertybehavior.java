/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *  
 *   http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *  
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.04 at 02:20:17 PM IST 
//

package org.apache.wink.webdav.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The <code>propertybehavior</code> XML element per the WebDAV specification
 * [RFC 4918]
 * 
 * <pre>
 *    Name:       propertybehavior 
 *    Namespace:  DAV:  
 *    Purpose:    Specifies how properties are handled during a COPY or MOVE.
 *    Description: The propertybehavior XML element specifies how
 *    properties are handled during a COPY or MOVE.  If this XML element is
 *    not included in the request body then the server is expected to act
 *    as defined by the default property handling behavior of the
 *    associated method.  All WebDAV compliant resources MUST support the
 *    propertybehavior XML element.
 * 
 *    &lt;!ELEMENT propertybehavior (omit | keepalive) &gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"omit", "keepalive"})
@XmlRootElement(name = "propertybehavior")
public class Propertybehavior {

    protected Omit      omit;
    protected Keepalive keepalive;

    /**
     * Gets the value of the omit property.
     * 
     * @return possible object is {@link Omit }
     */
    public Omit getOmit() {
        return omit;
    }

    /**
     * Sets the value of the omit property.
     * 
     * @param value allowed object is {@link Omit }
     */
    public void setOmit(Omit value) {
        this.omit = value;
    }

    /**
     * Gets the value of the keepalive property.
     * 
     * @return possible object is {@link Keepalive }
     */
    public Keepalive getKeepalive() {
        return keepalive;
    }

    /**
     * Sets the value of the keepalive property.
     * 
     * @param value allowed object is {@link Keepalive }
     */
    public void setKeepalive(Keepalive value) {
        this.keepalive = value;
    }

}
