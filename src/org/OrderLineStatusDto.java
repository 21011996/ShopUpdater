/**
 * OrderLineStatusDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org;

public class OrderLineStatusDto  implements java.io.Serializable {
    private java.lang.Integer goodsDeleted;

    private java.lang.Integer linesDeleted;

    private java.lang.Integer orderedQuantity;

    private java.lang.Integer reservedQuantity;

    public OrderLineStatusDto() {
    }

    public OrderLineStatusDto(
           java.lang.Integer goodsDeleted,
           java.lang.Integer linesDeleted,
           java.lang.Integer orderedQuantity,
           java.lang.Integer reservedQuantity) {
           this.goodsDeleted = goodsDeleted;
           this.linesDeleted = linesDeleted;
           this.orderedQuantity = orderedQuantity;
           this.reservedQuantity = reservedQuantity;
    }


    /**
     * Gets the goodsDeleted value for this OrderLineStatusDto.
     * 
     * @return goodsDeleted
     */
    public java.lang.Integer getGoodsDeleted() {
        return goodsDeleted;
    }


    /**
     * Sets the goodsDeleted value for this OrderLineStatusDto.
     * 
     * @param goodsDeleted
     */
    public void setGoodsDeleted(java.lang.Integer goodsDeleted) {
        this.goodsDeleted = goodsDeleted;
    }


    /**
     * Gets the linesDeleted value for this OrderLineStatusDto.
     * 
     * @return linesDeleted
     */
    public java.lang.Integer getLinesDeleted() {
        return linesDeleted;
    }


    /**
     * Sets the linesDeleted value for this OrderLineStatusDto.
     * 
     * @param linesDeleted
     */
    public void setLinesDeleted(java.lang.Integer linesDeleted) {
        this.linesDeleted = linesDeleted;
    }


    /**
     * Gets the orderedQuantity value for this OrderLineStatusDto.
     * 
     * @return orderedQuantity
     */
    public java.lang.Integer getOrderedQuantity() {
        return orderedQuantity;
    }


    /**
     * Sets the orderedQuantity value for this OrderLineStatusDto.
     * 
     * @param orderedQuantity
     */
    public void setOrderedQuantity(java.lang.Integer orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }


    /**
     * Gets the reservedQuantity value for this OrderLineStatusDto.
     * 
     * @return reservedQuantity
     */
    public java.lang.Integer getReservedQuantity() {
        return reservedQuantity;
    }


    /**
     * Sets the reservedQuantity value for this OrderLineStatusDto.
     * 
     * @param reservedQuantity
     */
    public void setReservedQuantity(java.lang.Integer reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderLineStatusDto)) return false;
        OrderLineStatusDto other = (OrderLineStatusDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.goodsDeleted==null && other.getGoodsDeleted()==null) || 
             (this.goodsDeleted!=null &&
              this.goodsDeleted.equals(other.getGoodsDeleted()))) &&
            ((this.linesDeleted==null && other.getLinesDeleted()==null) || 
             (this.linesDeleted!=null &&
              this.linesDeleted.equals(other.getLinesDeleted()))) &&
            ((this.orderedQuantity==null && other.getOrderedQuantity()==null) || 
             (this.orderedQuantity!=null &&
              this.orderedQuantity.equals(other.getOrderedQuantity()))) &&
            ((this.reservedQuantity==null && other.getReservedQuantity()==null) || 
             (this.reservedQuantity!=null &&
              this.reservedQuantity.equals(other.getReservedQuantity())));
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
        if (getGoodsDeleted() != null) {
            _hashCode += getGoodsDeleted().hashCode();
        }
        if (getLinesDeleted() != null) {
            _hashCode += getLinesDeleted().hashCode();
        }
        if (getOrderedQuantity() != null) {
            _hashCode += getOrderedQuantity().hashCode();
        }
        if (getReservedQuantity() != null) {
            _hashCode += getReservedQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderLineStatusDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "OrderLineStatusDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodsDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "GoodsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linesDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "LinesDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "OrderedQuantity"));
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
