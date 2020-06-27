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
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionPointXAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionPointYAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCornerRadiusAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawLayerAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTransformAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgXAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgYAttribute;
import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgTitleElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element draw:caption}. */
public class DrawCaptionElement extends DrawShapeElementBase {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "caption");

  /**
   * Create the instance of <code>DrawCaptionElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DrawCaptionElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element draw:caption}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> ,
   * See {@odf.attribute draw:caption-id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawCaptionIdAttribute() {
    DrawCaptionIdAttribute attr =
        (DrawCaptionIdAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "caption-id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See
   * {@odf.attribute draw:caption-id}
   *
   * @param drawCaptionIdValue The type is <code>String</code>
   */
  public void setDrawCaptionIdAttribute(String drawCaptionIdValue) {
    DrawCaptionIdAttribute attr = new DrawCaptionIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawCaptionIdValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawCaptionPointXAttribute
   * </code> , See {@odf.attribute draw:caption-point-x}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawCaptionPointXAttribute() {
    DrawCaptionPointXAttribute attr =
        (DrawCaptionPointXAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "caption-point-x");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawCaptionPointXAttribute</code> , See
   * {@odf.attribute draw:caption-point-x}
   *
   * @param drawCaptionPointXValue The type is <code>String</code>
   */
  public void setDrawCaptionPointXAttribute(String drawCaptionPointXValue) {
    DrawCaptionPointXAttribute attr =
        new DrawCaptionPointXAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawCaptionPointXValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawCaptionPointYAttribute
   * </code> , See {@odf.attribute draw:caption-point-y}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawCaptionPointYAttribute() {
    DrawCaptionPointYAttribute attr =
        (DrawCaptionPointYAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "caption-point-y");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawCaptionPointYAttribute</code> , See
   * {@odf.attribute draw:caption-point-y}
   *
   * @param drawCaptionPointYValue The type is <code>String</code>
   */
  public void setDrawCaptionPointYAttribute(String drawCaptionPointYValue) {
    DrawCaptionPointYAttribute attr =
        new DrawCaptionPointYAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawCaptionPointYValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawCornerRadiusAttribute
   * </code> , See {@odf.attribute draw:corner-radius}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawCornerRadiusAttribute() {
    DrawCornerRadiusAttribute attr =
        (DrawCornerRadiusAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "corner-radius");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawCornerRadiusAttribute</code> , See
   * {@odf.attribute draw:corner-radius}
   *
   * @param drawCornerRadiusValue The type is <code>String</code>
   */
  public void setDrawCornerRadiusAttribute(String drawCornerRadiusValue) {
    DrawCornerRadiusAttribute attr = new DrawCornerRadiusAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawCornerRadiusValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawLayerAttribute</code> , See
   * {@odf.attribute draw:layer}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawLayerAttribute() {
    DrawLayerAttribute attr =
        (DrawLayerAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "layer");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawLayerAttribute</code> , See
   * {@odf.attribute draw:layer}
   *
   * @param drawLayerValue The type is <code>String</code>
   */
  public void setDrawLayerAttribute(String drawLayerValue) {
    DrawLayerAttribute attr = new DrawLayerAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawLayerValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawTextStyleNameAttribute
   * </code> , See {@odf.attribute draw:text-style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawTextStyleNameAttribute() {
    DrawTextStyleNameAttribute attr =
        (DrawTextStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "text-style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawTextStyleNameAttribute</code> , See
   * {@odf.attribute draw:text-style-name}
   *
   * @param drawTextStyleNameValue The type is <code>String</code>
   */
  public void setDrawTextStyleNameAttribute(String drawTextStyleNameValue) {
    DrawTextStyleNameAttribute attr =
        new DrawTextStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawTextStyleNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawTransformAttribute</code> ,
   * See {@odf.attribute draw:transform}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawTransformAttribute() {
    DrawTransformAttribute attr =
        (DrawTransformAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "transform");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawTransformAttribute</code> , See
   * {@odf.attribute draw:transform}
   *
   * @param drawTransformValue The type is <code>String</code>
   */
  public void setDrawTransformAttribute(String drawTransformValue) {
    DrawTransformAttribute attr = new DrawTransformAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawTransformValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgHeightAttribute</code> , See
   * {@odf.attribute svg:height}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgHeightAttribute() {
    SvgHeightAttribute attr =
        (SvgHeightAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "height");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgHeightAttribute</code> , See
   * {@odf.attribute svg:height}
   *
   * @param svgHeightValue The type is <code>String</code>
   */
  public void setSvgHeightAttribute(String svgHeightValue) {
    SvgHeightAttribute attr = new SvgHeightAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgHeightValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgWidthAttribute</code> , See
   * {@odf.attribute svg:width}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgWidthAttribute() {
    SvgWidthAttribute attr = (SvgWidthAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "width");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgWidthAttribute</code> , See
   * {@odf.attribute svg:width}
   *
   * @param svgWidthValue The type is <code>String</code>
   */
  public void setSvgWidthAttribute(String svgWidthValue) {
    SvgWidthAttribute attr = new SvgWidthAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgWidthValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgXAttribute</code> , See
   * {@odf.attribute svg:x}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgXAttribute() {
    SvgXAttribute attr = (SvgXAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "x");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgXAttribute</code> , See
   * {@odf.attribute svg:x}
   *
   * @param svgXValue The type is <code>String</code>
   */
  public void setSvgXAttribute(String svgXValue) {
    SvgXAttribute attr = new SvgXAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgXValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgYAttribute</code> , See
   * {@odf.attribute svg:y}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgYAttribute() {
    SvgYAttribute attr = (SvgYAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "y");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgYAttribute</code> , See
   * {@odf.attribute svg:y}
   *
   * @param svgYValue The type is <code>String</code>
   */
  public void setSvgYAttribute(String svgYValue) {
    SvgYAttribute attr = new SvgYAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgYValue);
  }

  /**
   * Create child element {@odf.element draw:glue-point}.
   *
   * @param drawEscapeDirectionValue the <code>String</code> value of <code>
   *     DrawEscapeDirectionAttribute</code>, see {@odf.attribute draw:escape-direction} at
   *     specification
   * @param drawIdValue the <code>String</code> value of <code>DrawIdAttribute</code>, see
   *     {@odf.attribute draw:id} at specification
   * @param svgXValue the <code>String</code> value of <code>SvgXAttribute</code>, see
   *     {@odf.attribute svg:x} at specification
   * @param svgYValue the <code>String</code> value of <code>SvgYAttribute</code>, see
   *     {@odf.attribute svg:y} at specification
   * @return the element {@odf.element draw:glue-point}
   */
  public DrawGluePointElement newDrawGluePointElement(
      String drawEscapeDirectionValue, String drawIdValue, String svgXValue, String svgYValue) {
    DrawGluePointElement drawGluePoint =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawGluePointElement.class);
    drawGluePoint.setDrawEscapeDirectionAttribute(drawEscapeDirectionValue);
    drawGluePoint.setDrawIdAttribute(drawIdValue);
    drawGluePoint.setSvgXAttribute(svgXValue);
    drawGluePoint.setSvgYAttribute(svgYValue);
    this.appendChild(drawGluePoint);
    return drawGluePoint;
  }

  /**
   * Create child element {@odf.element office:event-listeners}.
   *
   * @return the element {@odf.element office:event-listeners}
   */
  public OfficeEventListenersElement newOfficeEventListenersElement() {
    OfficeEventListenersElement officeEventListeners =
        ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
    this.appendChild(officeEventListeners);
    return officeEventListeners;
  }

  /**
   * Create child element {@odf.element svg:desc}.
   *
   * @return the element {@odf.element svg:desc}
   */
  public SvgDescElement newSvgDescElement() {
    SvgDescElement svgDesc = ((OdfFileDom) this.ownerDocument).newOdfElement(SvgDescElement.class);
    this.appendChild(svgDesc);
    return svgDesc;
  }

  /**
   * Create child element {@odf.element svg:title}.
   *
   * @return the element {@odf.element svg:title}
   */
  public SvgTitleElement newSvgTitleElement() {
    SvgTitleElement svgTitle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(SvgTitleElement.class);
    this.appendChild(svgTitle);
    return svgTitle;
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
