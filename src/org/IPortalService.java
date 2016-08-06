/**
 * IPortalService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org;

public interface IPortalService extends java.rmi.Remote {
    public org.ItemDto[] getItems(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException;
    public org.ItemRuntimeDto[] getRuntimeItems(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException;
    public org.CategoryDto[] getCategories(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException;
    public org.ItemDto[] getCategoryItems(java.lang.String login, java.lang.String password, java.lang.String categoryId) throws java.rmi.RemoteException;
    public org.ItemRuntimeDto[] getCategoryRuntimeItems(java.lang.String login, java.lang.String password, java.lang.String categoryId) throws java.rmi.RemoteException;
    public org.ItemPortionDto getItemPortion(java.lang.String login, java.lang.String password, java.lang.Integer from, java.lang.Integer to) throws java.rmi.RemoteException;
    public org.ItemRuntimePortionDto getRuntimeItemPortion(java.lang.String login, java.lang.String password, java.lang.Integer from, java.lang.Integer to) throws java.rmi.RemoteException;
    public org.ItemDto getItem(java.lang.String login, java.lang.String password, java.lang.String itemId) throws java.rmi.RemoteException;
    public org.ItemRuntimeDto getRuntimeItem(java.lang.String login, java.lang.String password, java.lang.String itemId) throws java.rmi.RemoteException;
    public org.OrderDto getOrderStatus(java.lang.String login, java.lang.String password, java.lang.String orderId) throws java.rmi.RemoteException;
    public org.OrderFullDto getOrderWithLines(java.lang.String login, java.lang.String password, java.lang.String orderId) throws java.rmi.RemoteException;
    public org.OrderDto[] getOrders(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String createOrder(java.lang.String login, java.lang.String password, org.OrderLineCreationDto[] lines) throws java.rmi.RemoteException;
    public org.OrderLineStatusDto addItem(java.lang.String login, java.lang.String password, java.lang.String orderId, org.OrderLineCreationDto item) throws java.rmi.RemoteException;
    public void removeItem(java.lang.String login, java.lang.String password, java.lang.String orderId, java.lang.String itemId) throws java.rmi.RemoteException;
    public java.lang.String exportInvoiceXml(java.lang.String login, java.lang.String password, java.lang.String orderId) throws java.rmi.RemoteException;
}
