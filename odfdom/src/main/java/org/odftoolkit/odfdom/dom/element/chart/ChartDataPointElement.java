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
package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartRepeatedAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element chart:data-point}. */
public class ChartDataPointElement extends OdfStylableElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.CHART, "data-point");

  /**
   * Create the instance of <code>ChartDataPointElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public ChartDataPointElement(OdfFileDom ownerDoc) {
    super(
        ownerDoc,
        ELEMENT_NAME,
        OdfStyleFamily.Chart,
        OdfName.newName(OdfDocumentNamespace.CHART, "style-name"));
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element chart:data-point}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>ChartRepeatedAttribute</code> ,
   * See {@odf.attribute chart:repeated}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getChartRepeatedAttribute() {
    ChartRepeatedAttribute attr =
        (ChartRepeatedAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "repeated");
    if (attr != null) {
      return Integer.valueOf(attr.intValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>ChartRepeatedAttribute</code> , See
   * {@odf.attribute chart:repeated}
   *
   * @param chartRepeatedValue The type is <code>Integer</code>
   */
  public void setChartRepeatedAttribute(Integer chartRepeatedValue) {
    ChartRepeatedAttribute attr = new ChartRepeatedAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(chartRepeatedValue.intValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>ChartStyleNameAttribute</code>
   * , See {@odf.attribute chart:style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getChartStyleNameAttribute() {
    ChartStyleNameAttribute attr =
        (ChartStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See
   * {@odf.attribute chart:style-name}
   *
   * @param chartStyleNameValue The type is <code>String</code>
   */
  public void setChartStyleNameAttribute(String chartStyleNameValue) {
    ChartStyleNameAttribute attr = new ChartStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(chartStyleNameValue);
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
   * Create child element {@odf.element chart:data-label}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element chart:data-label}
   */
  public ChartDataLabelElement newChartDataLabelElement() {
    ChartDataLabelElement chartDataLabel =
        ((OdfFileDom) this.ownerDocument).newOdfElement(ChartDataLabelElement.class);
    this.appendChild(chartDataLabel);
    return chartDataLabel;
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
