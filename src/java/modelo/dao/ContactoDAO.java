/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.ContactoDTO;

/**
 *
 * @author andre
 */
public class ContactoDAO {

    private static final List<ContactoDTO> lista= new ArrayList<ContactoDTO>();

    public ContactoDAO() {
        
    }

    public List<ContactoDTO> readAll() {

        return lista;
    }
    
    public void create(ContactoDTO nuevo)  {

      lista.add(nuevo);
    }
    public boolean delete(ContactoDTO elim ){
        
       return lista.remove(elim);
    }
}


