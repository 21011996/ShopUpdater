/**
 * OrderFullDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org;

public class OrderFullDto  extends org.OrderDto  implements java.io.Serializable {
    private org.OrderLineDto[] lines;

    public OrderFullDto() {
    }

    public OrderFullDto(
           java.util.Calendar creationDate,
           java.lang.String currency,
           java.lang.Integer goodsCount,
           java.lang.String id,
           java.util.Calendar invoiceDate,
           java.lang.String invoiceId,
           java.lang.Integer lineCount,
           java.lang.String status,
           java.math.BigDecimal sum,
           java.lang.Integer type,
           org.OrderLineDto[] lines) {
        super(
            creationDate,
            currency,
            goodsCount,
            id,
            invoiceDate,
            invoiceId,
            lineCount,
            status,
            sum,
            type);
        this.lines = lines;
    }


    /**
     * Gets the lines value for this OrderFullDto.
     * 
     * @return lines
     */
    public org.OrderLineDto[] getLines() {
        return lines;
    }


    /**
     * Sets the lines value for this OrderFullDto.
     * 
     * @param lines
     */
    public void setLines(org.OrderLineDto[] lines) {
        this.lines = lines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderFullDto)) return false;
        OrderFullDto other = (OrderFullDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lines==null && other.getLines()==null) || 
             (this.lines!=null &&
              java.util.Arrays.equals(this.lines, other.getLines())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderFullDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "OrderFullDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "Lines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "OrderLineDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "OrderLineDto"));
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
