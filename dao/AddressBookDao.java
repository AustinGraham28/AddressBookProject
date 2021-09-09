/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.AddressBook;
import java.util.List;

/**
 *
 * @author agrah
 */
public interface AddressBookDao {
    
    /**
     * Adds the given Address to the AddressBook and associates it with the given
     * last name.If there is already an address associated with the given
     * last name, it will return that student object, otherwise it will
     * return null.
     *
     * @param lastName name with which address is to be associated
     * @param addressBook address to be added to the roster
     * @return the AddressBook object previously associated with the given  
     * lastName if it exists, null otherwise
     * @throws com.sg.addressbook.dao.AddressBookDaoException
     */
    AddressBook addAddress(String lastName, AddressBook addressBook)
            throws AddressBookDaoException;
    
    /**
     * Returns a List of all addresses in the AddressBook.
     *
     * @return List containing all AddressBook objects in the AddressBook.
     * @throws com.sg.addressbook.dao.AddressBookDaoException
     */
    List<AddressBook> getAllAddresses()
            throws AddressBookDaoException;
    
    /**
     * Returns the AddressBook object associated with the given last name.Returns null if no such AddressBook Object exists
     *
     * @param lastName ID of the address to retrieve
     * @return the AddressBook object associated with the lastName,  
     * null if no such address exists
     * @throws com.sg.addressbook.dao.AddressBookDaoException
     */
    AddressBook getAddress(String lastName)
            throws AddressBookDaoException;

    /**
     * Removes from the AddressBook the address associated with the given lastName.Returns the addressBook object that is being removed or null if
 there is no Address associated with the given lastName
     *
     * @param lastName id of address to be removed
     * @return AddressBook object that was removed or null if no address
     * was associated with the given last name
     * @throws com.sg.addressbook.dao.AddressBookDaoException
     */
    AddressBook removeAddress(String lastName)
            throws AddressBookDaoException;
    
    /**
     * Returns the total number of AddressBook objects
     * 
     * @return total AddressBook objects
     * @throws com.sg.addressbook.dao.AddressBookDaoException
     */
    AddressBook getTotalAddresses()
            throws AddressBookDaoException;
}
