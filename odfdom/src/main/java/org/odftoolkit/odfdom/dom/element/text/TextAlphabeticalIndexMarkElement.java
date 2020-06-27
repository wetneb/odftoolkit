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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.text.TextKey1Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextKey1PhoneticAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextKey2Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextKey2PhoneticAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextMainEntryAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStringValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStringValuePhoneticAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:alphabetical-index-mark}. */
public class TextAlphabeticalIndexMarkElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TEXT, "alphabetical-index-mark");

  /**
   * Create the instance of <code>TextAlphabeticalIndexMarkElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextAlphabeticalIndexMarkElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     text:alphabetical-index-mark}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextKey1Attribute</code> , See
   * {@odf.attribute text:key1}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextKey1Attribute() {
    TextKey1Attribute attr = (TextKey1Attribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "key1");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextKey1Attribute</code> , See
   * {@odf.attribute text:key1}
   *
   * @param textKey1Value The type is <code>String</code>
   */
  public void setTextKey1Attribute(String textKey1Value) {
    TextKey1Attribute attr = new TextKey1Attribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textKey1Value);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextKey1PhoneticAttribute
   * </code> , See {@odf.attribute text:key1-phonetic}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextKey1PhoneticAttribute() {
    TextKey1PhoneticAttribute attr =
        (TextKey1PhoneticAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "key1-phonetic");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextKey1PhoneticAttribute</code> , See
   * {@odf.attribute text:key1-phonetic}
   *
   * @param textKey1PhoneticValue The type is <code>String</code>
   */
  public void setTextKey1PhoneticAttribute(String textKey1PhoneticValue) {
    TextKey1PhoneticAttribute attr = new TextKey1PhoneticAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textKey1PhoneticValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextKey2Attribute</code> , See
   * {@odf.attribute text:key2}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextKey2Attribute() {
    TextKey2Attribute attr = (TextKey2Attribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "key2");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextKey2Attribute</code> , See
   * {@odf.attribute text:key2}
   *
   * @param textKey2Value The type is <code>String</code>
   */
  public void setTextKey2Attribute(String textKey2Value) {
    TextKey2Attribute attr = new TextKey2Attribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textKey2Value);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextKey2PhoneticAttribute
   * </code> , See {@odf.attribute text:key2-phonetic}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextKey2PhoneticAttribute() {
    TextKey2PhoneticAttribute attr =
        (TextKey2PhoneticAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "key2-phonetic");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextKey2PhoneticAttribute</code> , See
   * {@odf.attribute text:key2-phonetic}
   *
   * @param textKey2PhoneticValue The type is <code>String</code>
   */
  public void setTextKey2PhoneticAttribute(String textKey2PhoneticValue) {
    TextKey2PhoneticAttribute attr = new TextKey2PhoneticAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textKey2PhoneticValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextMainEntryAttribute</code> ,
   * See {@odf.attribute text:main-entry}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextMainEntryAttribute() {
    TextMainEntryAttribute attr =
        (TextMainEntryAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "main-entry");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextMainEntryAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextMainEntryAttribute</code> , See
   * {@odf.attribute text:main-entry}
   *
   * @param textMainEntryValue The type is <code>Boolean</code>
   */
  public void setTextMainEntryAttribute(Boolean textMainEntryValue) {
    TextMainEntryAttribute attr = new TextMainEntryAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textMainEntryValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextStringValueAttribute</code>
   * , See {@odf.attribute text:string-value}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextStringValueAttribute() {
    TextStringValueAttribute attr =
        (TextStringValueAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "string-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextStringValueAttribute</code> , See
   * {@odf.attribute text:string-value}
   *
   * @param textStringValueValue The type is <code>String</code>
   */
  public void setTextStringValueAttribute(String textStringValueValue) {
    TextStringValueAttribute attr = new TextStringValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textStringValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TextStringValuePhoneticAttribute</code> , See {@odf.attribute text:string-value-phonetic}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextStringValuePhoneticAttribute() {
    TextStringValuePhoneticAttribute attr =
        (TextStringValuePhoneticAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "string-value-phonetic");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextStringValuePhoneticAttribute</code>
   * , See {@odf.attribute text:string-value-phonetic}
   *
   * @param textStringValuePhoneticValue The type is <code>String</code>
   */
  public void setTextStringValuePhoneticAttribute(String textStringValuePhoneticValue) {
    TextStringValuePhoneticAttribute attr =
        new TextStringValuePhoneticAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textStringValuePhoneticValue);
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
