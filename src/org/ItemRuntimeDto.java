/**
 * ItemRuntimeDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org;

public class ItemRuntimeDto  implements java.io.Serializable {
    private java.math.BigDecimal availableQuantity;

    private java.lang.String id;

    private java.math.BigDecimal mainOfficeQuantity;

    private java.math.BigDecimal price;

    private java.math.BigDecimal transitQuantity;

    public ItemRuntimeDto() {
    }

    public ItemRuntimeDto(
           java.math.BigDecimal availableQuantity,
           java.lang.String id,
           java.math.BigDecimal mainOfficeQuantity,
           java.math.BigDecimal price,
           java.math.BigDecimal transitQuantity) {
           this.availableQuantity = availableQuantity;
           this.id = id;
           this.mainOfficeQuantity = mainOfficeQuantity;
           this.price = price;
           this.transitQuantity = transitQuantity;
    }


    /**
     * Gets the availableQuantity value for this ItemRuntimeDto.
     * 
     * @return availableQuantity
     */
    public java.math.BigDecimal getAvailableQuantity() {
        return availableQuantity;
    }


    /**
     * Sets the availableQuantity value for this ItemRuntimeDto.
     * 
     * @param availableQuantity
     */
    public void setAvailableQuantity(java.math.BigDecimal availableQuantity) {
        this.availableQuantity = availableQuantity;
    }


    /**
     * Gets the id value for this ItemRuntimeDto.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ItemRuntimeDto.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the mainOfficeQuantity value for this ItemRuntimeDto.
     * 
     * @return mainOfficeQuantity
     */
    public java.math.BigDecimal getMainOfficeQuantity() {
        return mainOfficeQuantity;
    }


    /**
     * Sets the mainOfficeQuantity value for this ItemRuntimeDto.
     * 
     * @param mainOfficeQuantity
     */
    public void setMainOfficeQuantity(java.math.BigDecimal mainOfficeQuantity) {
        this.mainOfficeQuantity = mainOfficeQuantity;
    }


    /**
     * Gets the price value for this ItemRuntimeDto.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ItemRuntimeDto.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the transitQuantity value for this ItemRuntimeDto.
     * 
     * @return transitQuantity
     */
    public java.math.BigDecimal getTransitQuantity() {
        return transitQuantity;
    }


    /**
     * Sets the transitQuantity value for this ItemRuntimeDto.
     * 
     * @param transitQuantity
     */
    public void setTransitQuantity(java.math.BigDecimal transitQuantity) {
        this.transitQuantity = transitQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemRuntimeDto)) return false;
        ItemRuntimeDto other = (ItemRuntimeDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableQuantity==null && other.getAvailableQuantity()==null) || 
             (this.availableQuantity!=null &&
              this.availableQuantity.equals(other.getAvailableQuantity()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.mainOfficeQuantity==null && other.getMainOfficeQuantity()==null) || 
             (this.mainOfficeQuantity!=null &&
              this.mainOfficeQuantity.equals(other.getMainOfficeQuantity()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.transitQuantity==null && other.getTransitQuantity()==null) || 
             (this.transitQuantity!=null &&
              this.transitQuantity.equals(other.getTransitQuantity())));
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
        if (getAvailableQuantity() != null) {
            _hashCode += getAvailableQuantity().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMainOfficeQuantity() != null) {
            _hashCode += getMainOfficeQuantity().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getTransitQuantity() != null) {
            _hashCode += getTransitQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemRuntimeDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "ItemRuntimeDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "AvailableQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainOfficeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "MainOfficeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://portal.vtt.ru/data", "TransitQuantity"));
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
