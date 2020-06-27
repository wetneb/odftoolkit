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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableDataFieldAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOrderAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableSortModeAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:data-pilot-sort-info}. */
public class TableDataPilotSortInfoElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "data-pilot-sort-info");

  /**
   * Create the instance of <code>TableDataPilotSortInfoElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableDataPilotSortInfoElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     table:data-pilot-sort-info}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableDataFieldAttribute</code>
   * , See {@odf.attribute table:data-field}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableDataFieldAttribute() {
    TableDataFieldAttribute attr =
        (TableDataFieldAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "data-field");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableDataFieldAttribute</code> , See
   * {@odf.attribute table:data-field}
   *
   * @param tableDataFieldValue The type is <code>String</code>
   */
  public void setTableDataFieldAttribute(String tableDataFieldValue) {
    TableDataFieldAttribute attr = new TableDataFieldAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableDataFieldValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableOrderAttribute</code> ,
   * See {@odf.attribute table:order}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableOrderAttribute() {
    TableOrderAttribute attr =
        (TableOrderAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "order");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableOrderAttribute</code> , See
   * {@odf.attribute table:order}
   *
   * @param tableOrderValue The type is <code>String</code>
   */
  public void setTableOrderAttribute(String tableOrderValue) {
    TableOrderAttribute attr = new TableOrderAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableOrderValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableSortModeAttribute</code> ,
   * See {@odf.attribute table:sort-mode}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableSortModeAttribute() {
    TableSortModeAttribute attr =
        (TableSortModeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "sort-mode");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableSortModeAttribute</code> , See
   * {@odf.attribute table:sort-mode}
   *
   * @param tableSortModeValue The type is <code>String</code>
   */
  public void setTableSortModeAttribute(String tableSortModeValue) {
    TableSortModeAttribute attr = new TableSortModeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableSortModeValue);
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
