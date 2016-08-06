/**
 * OrderLineDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org;

public class OrderLineDto  implements java.io.Serializable {
    private java.lang.String gtdCountry;

    private java.lang.String gtdNumber;

    private java.lang.String itemId;

    private java.lang.String name;

    private java.lang.Integer quantity;

    private java.lang.Integer reservedQuantity;

    private java.math.BigDecimal totalPrice;

    private java.math.BigDecimal unitPrice;

    public OrderLineDto() {
    }

    public OrderLineDto(
           java.lang.String gtdCountry,
           java.lang.String gtdNumber,
           java.lang.String itemId,
           java.lang.String name,
           java.lang.Integer quantity,
           java.lang.Integer reservedQuantity,
           java.math.BigDecimal totalPrice,
           java.math.BigDecimal unitPrice) {
           this.gtdCountry = gtdCountry;
           this.gtdNumber = gtdNumber;
           this.itemId = itemId;
           this.name = name;
           this.quantity = quantity;
           this.reservedQuantity = reservedQuantity;
           this.totalPrice = totalPrice;
           this.unitPrice = unitPrice;
    }


    /**
     * Gets the gtdCountry value for this OrderLineDto.
     * 
     * @return gtdCountry
     */
    public java.lang.String getGtdCountry() {
        return gtdCountry;
    }


    /**
     * Sets the gtdCountry value for this OrderLineDto.
     * 
     * @param gtdCountry
     */
    public void setGtdCountry(java.lang.String gtdCountry) {
        this.gtdCountry = gtdCountry;
    }


    /**
     * Gets the gtdNumber value for this OrderLineDto.
     * 
     * @return gtdNumber
     */
    public java.lang.String getGtdNumber() {
        return gtdNumber;
    }


    /**
     * Sets the gtdNumber value for this OrderLineDto.
     * 
     * @param gtdNumber
     */
    public void setGtdNumber(java.lang.String gtdNumber) {
        this.gtdNumber = gtdNumber;
    }


    /**
     * Gets the itemId value for this OrderLineDto.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this OrderLineDto.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the name value for this OrderLineDto.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OrderLineDto.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the quantity value for this OrderLineDto.
     * 
     * @return quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OrderLineDto.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the reservedQuantity value for this OrderLineDto.
     * 
     * @return reservedQuantity
     */
    public java.lang.Integer getReservedQuantity() {
        return reservedQuantity;
    }


    /**
     * Sets the reservedQuantity value for this OrderLineDto.
     * 
     * @param reservedQuantity
     */
    public void setReservedQuantity(java.lang.Integer reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }


    /**
     * Gets the totalPrice value for this OrderLineDto.
     * 
     * @return totalPrice
     */
    public java.math.BigDecimal getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this OrderLineDto.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the unitPrice value for this OrderLineDto.
     * 
     * @return unitPrice
     */
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this OrderLineDto.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderLineDto)) return false;
        OrderLineDto other = (OrderLineDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gtdCountry==null && other.getGtdCountry()==null) || 
             (this.gtdCountry!=null &&
              this.gtdCountry.equals(other.getGtdCountry()))) &&
            ((this.gtdNumber==null && other.getGtdNumber()==null) || 
             (this.gtdNumber!=null &&
              this.gtdNumber.equals(other.getGtdNumber()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.reservedQuantity==null && other.getReservedQuantity()==null) || 
             (this.reservedQuantity!=null &&
              this.reservedQuantity.equals(other.getReservedQuantity()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGtdCountry() != null) {
            _hashCode += getGtdCountry().hashCode();
        }
        if (getGtdNumber() != null) {
            _hashCode += getGtdNumber().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getReservedQuantity() != null) {
            _hashCode += getReservedQuantity().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderLineDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "OrderLineDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gtdCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "GtdCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gtdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "GtdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "ReservedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "TotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "UnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
