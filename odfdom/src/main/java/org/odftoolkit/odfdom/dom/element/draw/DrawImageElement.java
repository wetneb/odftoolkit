/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawFilterNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.element.office.OfficeBinaryDataElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element draw:image}. */
public class DrawImageElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "image");

  /**
   * Create the instance of <code>DrawImageElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DrawImageElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element draw:image}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawFilterNameAttribute</code>
   * , See {@odf.attribute draw:filter-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawFilterNameAttribute() {
    DrawFilterNameAttribute attr =
        (DrawFilterNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "filter-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawFilterNameAttribute</code> , See
   * {@odf.attribute draw:filter-name}
   *
   * @param drawFilterNameValue The type is <code>String</code>
   */
  public void setDrawFilterNameAttribute(String drawFilterNameValue) {
    DrawFilterNameAttribute attr = new DrawFilterNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawFilterNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> ,
   * See {@odf.attribute xlink:actuate}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkActuateAttribute() {
    XlinkActuateAttribute attr =
        (XlinkActuateAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "actuate");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkActuateAttribute.DEFAULT_VALUE_ONLOAD;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See
   * {@odf.attribute xlink:actuate}
   *
   * @param xlinkActuateValue The type is <code>String</code>
   */
  public void setXlinkActuateAttribute(String xlinkActuateValue) {
    XlinkActuateAttribute attr = new XlinkActuateAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkActuateValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See
   * {@odf.attribute xlink:href}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkHrefAttribute() {
    XlinkHrefAttribute attr =
        (XlinkHrefAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "href");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See
   * {@odf.attribute xlink:href}
   *
   * @param xlinkHrefValue The type is <code>String</code>
   */
  public void setXlinkHrefAttribute(String xlinkHrefValue) {
    XlinkHrefAttribute attr = new XlinkHrefAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkHrefValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkShowAttribute</code> , See
   * {@odf.attribute xlink:show}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkShowAttribute() {
    XlinkShowAttribute attr =
        (XlinkShowAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "show");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkShowAttribute.DEFAULT_VALUE_EMBED;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkShowAttribute</code> , See
   * {@odf.attribute xlink:show}
   *
   * @param xlinkShowValue The type is <code>String</code>
   */
  public void setXlinkShowAttribute(String xlinkShowValue) {
    XlinkShowAttribute attr = new XlinkShowAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkShowValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See
   * {@odf.attribute xlink:type}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkTypeAttribute() {
    XlinkTypeAttribute attr =
        (XlinkTypeAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkTypeAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See
   * {@odf.attribute xlink:type}
   *
   * @param xlinkTypeValue The type is <code>String</code>
   */
  public void setXlinkTypeAttribute(String xlinkTypeValue) {
    XlinkTypeAttribute attr = new XlinkTypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkTypeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXmlIdAttribute() {
    XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute(OdfDocumentNamespace.XML, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * @param xmlIdValue The type is <code>String</code>
   */
  public void setXmlIdAttribute(String xmlIdValue) {
    XmlIdAttribute attr = new XmlIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xmlIdValue);
  }

  /**
   * Create child element {@odf.element office:binary-data}.
   *
   * @return the element {@odf.element office:binary-data}
   */
  public OfficeBinaryDataElement newOfficeBinaryDataElement() {
    OfficeBinaryDataElement officeBinaryData =
        ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeBinaryDataElement.class);
    this.appendChild(officeBinaryData);
    return officeBinaryData;
  }

  /**
   * Create child element {@odf.element text:list}.
   *
   * @return the element {@odf.element text:list}
   */
  public TextListElement newTextListElement() {
    TextListElement textList =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextListElement.class);
    this.appendChild(textList);
    return textList;
  }

  /**
   * Create child element {@odf.element text:p}.
   *
   * @return the element {@odf.element text:p}
   */
  public TextPElement newTextPElement() {
    TextPElement textP = ((OdfFileDom) this.ownerDocument).newOdfElement(TextPElement.class);
    this.appendChild(textP);
    return textP;
  }

  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }
}
